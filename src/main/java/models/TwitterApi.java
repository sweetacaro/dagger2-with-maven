package models;

//https://youtu.be/plK0zyRLIP8?t=1052

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TwitterApi {
    private final OkHttpClient client;

    @Inject
    public TwitterApi(OkHttpClient client) {
        this.client = client;
    }

    public void postTweet(String user, String tweet) {
        client.executeRequest();
    }
}
