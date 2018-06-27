package models;

public class Timeline {

    private TwitterApi api;
    private String user;

    //https://youtu.be/plK0zyRLIP8?t=241

    public Timeline(TwitterApi api, String user) {
        this.api = api;
        this.user = user;
    }
}
