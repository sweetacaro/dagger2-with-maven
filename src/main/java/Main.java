import models.DaggerTwitterComponent;
import models.Tweeter;
import models.TwitterApplication;
import models.TwitterComponent;
import modules.NetworkModule;
import modules.TwitterModule;

import javax.inject.Inject;

public class Main {
    public static void main(String[] args) {
        System.out.print("un simple projet Maven pour jouer avec Dagger2.");

        System.out.println("un simple projet Maven pour jouer avec Dagger2");

        //https://youtu.be/plK0zyRLIP8?t=269


        //https://youtu.be/plK0zyRLIP8?t=1254
        TwitterComponent component = DaggerTwitterComponent.builder()
                .networkModule(new NetworkModule())
                .twitterModule(new TwitterModule("JakeWharton"))
                .build();

        Tweeter tweeter = component.tweeter();
        tweeter.tweet("Does it work, Ducon?");

    }
}
