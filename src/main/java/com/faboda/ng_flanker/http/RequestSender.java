package com.faboda.ng_flanker.http;

import com.faboda.ng_flanker.question.QuestionUtil;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class RequestSender {


    private final HttpClientWrapper httpClientWrapper;

    public RequestSender(HttpClientWrapper httpClientWrapper) {
        this.httpClientWrapper = httpClientWrapper;
    }
    public String sendRequest(String username) throws IOException {
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8");
        String requestBody = String.format(
                "username=%s&question=%s&deviceId=541b6eaa-85cb-49cf-934e-1196d787db56&gameSlug=confessions&referrer=",
                username, QuestionUtil.getRandomQuestion()
        );
        RequestBody body = RequestBody.create(mediaType, requestBody);

        String URL = "https://ngl.link/api/submit";
        Request.Builder requestBuilder = new Request.Builder()
                .url(URL)
                .method("POST", body);

        var headers = NGLHeaders.headerList();

        for (Header header : headers) {
            requestBuilder.addHeader(header.headerName(), header.headerValue());
        }

        Request request = requestBuilder.build();
        Response response = httpClientWrapper.getClient().newCall(request).execute();

        return response.body().string();
    }
}
