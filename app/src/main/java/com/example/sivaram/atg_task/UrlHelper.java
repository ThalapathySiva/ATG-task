package com.example.sivaram.atg_task;


public class UrlHelper {
    static String baseUrl = "https://api.flickr.com/services/rest";
    static String recentImageMethod = "flickr.photos.getRecent";

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static String getRecentImageMethod() {
        return recentImageMethod;
    }
}
