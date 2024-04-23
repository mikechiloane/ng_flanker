package com.faboda.ng_flanker.task;

import com.faboda.ng_flanker.http.RequestSender;

import java.io.IOException;

public class StoppableSenderTask implements Runnable {

    private final RequestSender requestSender;
    private final String username;
    private volatile boolean running = true;

    public StoppableSenderTask(RequestSender requestSender, String username) {
        this.requestSender = requestSender;
        this.username = username;
    }

    @Override
    public void run() {
        while (running) {
            try {
                requestSender.sendRequest(username);
                Thread.sleep(10000);
            } catch (InterruptedException | IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void stop() {
        this.running = false;
    }

    public String getUsername() {
        return this.username;
    }

    public void sendRequestEvery10Seconds(String username) throws IOException {
        requestSender.sendRequest(username);
    }
}
