package com.faboda.ng_flanker.task;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Component
public class SenderTaskManager {

    private final ExecutorService executorService = Executors.newFixedThreadPool(100);
    private final Map<String, StoppableSenderTask> tasks = new HashMap<>();

    public void addTask(StoppableSenderTask task) {
        tasks.put(task.getUsername(), task);
    }

    public void stopTask(String username) {
        this.tasks.get(username).stop();
    }

    public void runTask(String username){
        this.tasks.get(username).run();
    }

    public boolean taskExist(String username){
        return tasks.containsKey(username);
    }

}
