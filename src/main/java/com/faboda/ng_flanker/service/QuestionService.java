package com.faboda.ng_flanker.service;


import com.faboda.ng_flanker.http.RequestSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class QuestionService {

    @Autowired
    RequestSender requestSender;
    private final ExecutorService executorService = Executors.newFixedThreadPool(100);


    public void sendRequest(String username) {
        sendRequestEvery20Seconds(username);
    }


    public void sendRequestEvery20Seconds(String username) {
        executorService.submit(() -> {
            int count = 0;
            while (count<200) {
                try {
                    requestSender.sendRequest(username);
                    Thread.sleep(10000);
                } catch (InterruptedException | IOException e) {
                    throw new RuntimeException(e);
                }
                ++count;
            }
        });
    }
}
