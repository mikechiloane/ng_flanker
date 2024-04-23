package com.faboda.ng_flanker.http;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
public class RequestSenderTest {

    @Autowired
    private RequestSender requestSender;

    @Test
    public void testSendRequest() {
        try {
            requestSender.sendRequest("_faboda");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
