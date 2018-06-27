package models;

public class Tweeter {

    private TwitterApi api;
    private String user;

    public Tweeter(TwitterApi api, String user) {
        this.api = api;
        this.user = user;
    }

    public void tweet(String tweet) {
        api.postTweet(user, tweet);
        System.out.println("POST by "+user+": \""+tweet+"\"");
    }


}
