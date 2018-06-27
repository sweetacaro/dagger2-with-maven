package modules;

import dagger.Module;
import dagger.Provides;
import models.Timeline;
import models.Tweeter;
import models.TwitterApi;

import javax.inject.Singleton;

@Module
public class TwitterModule {

    private final String user;

    public TwitterModule(String user) {
        this.user = user;
    }

    @Provides @Singleton
    Tweeter provideTweeter(TwitterApi api) {
        return new Tweeter(api, user);
    }

    @Provides @Singleton
    Timeline provideTimeline(TwitterApi api) {
        return new Timeline(api, user);
    }

}
