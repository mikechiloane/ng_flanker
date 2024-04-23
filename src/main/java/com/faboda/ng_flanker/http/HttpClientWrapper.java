package com.faboda.ng_flanker.http;

import okhttp3.OkHttpClient;
import org.springframework.stereotype.Component;


@Component
public class HttpClientWrapper {
    private final OkHttpClient client;

    public HttpClientWrapper() {
        this.client = new OkHttpClient();
    }

    public OkHttpClient getClient() {
        return client;
    }
}
