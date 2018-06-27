package models;

import javax.inject.Inject;

public class TwitterApplication {

    private Tweeter tweeter;
    private Timeline timeline;

    @Inject
    public TwitterApplication(Tweeter tweeter, Timeline timeline) {
        this.tweeter = tweeter;
        this.timeline = timeline;
    }
}
