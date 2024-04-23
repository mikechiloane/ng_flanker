package com.faboda.ng_flanker.service;


import com.faboda.ng_flanker.http.RequestSender;
import com.faboda.ng_flanker.task.SenderTaskManager;
import com.faboda.ng_flanker.task.StoppableSenderTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    RequestSender requestSender;

    @Autowired
    SenderTaskManager senderTaskManager;

    public void sendRequest(String username) {
        if(!senderTaskManager.taskExist(username)) {
            StoppableSenderTask stoppableSenderTask = new StoppableSenderTask(requestSender, username);
            senderTaskManager.addTask(stoppableSenderTask);
            senderTaskManager.runTask(username);
        }
        else {
            senderTaskManager.runTask(username);
        }
    }

    public void stopSender(String username){
        if(senderTaskManager.taskExist(username)){
            senderTaskManager.stopTask(username);
        }
    }



}
