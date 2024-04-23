package com.faboda.ng_flanker.http;
import java.util.List;

public class NGLHeaders {
    static final Header[] headers = {
            new Header("authority", "ngl.link"),
            new Header("accept", "*/*"),
            new Header("accept-language", "en-US,en;q=0.9"),
            new Header("cache-control", "no-cache"),
            new Header("content-type", "application/x-www-form-urlencoded; charset=UTF-8"),
            new Header("cookie", "__stripe_mid=0b8edaab-39f6-48c7-955c-d56b608a40b5a4bde7; __stripe_sid=84c809c7-6e36-4d61-b646-bb1a65b845a3d7e0fd"),
            new Header("dnt", "1"),
            new Header("origin", "https://ngl.link"),
            new Header("pragma", "no-cache"),
            new Header("referer", "https://ngl.link/credence93577/confessions"),
            new Header("sec-fetch-dest", "empty"),
            new Header("sec-fetch-mode", "cors"),
            new Header("sec-fetch-site", "same-origin"),
            new Header("user-agent", "Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.188 Safari/537.36 CrKey/1.54.250320"),
            new Header("x-requested-with", "XMLHttpRequest")
    };

    public static List<Header> headerList() {
        return List.of(headers);
    }

}