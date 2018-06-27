package models;

import dagger.Component;
import modules.NetworkModule;
import modules.TwitterModule;

import javax.inject.Singleton;

@Singleton
@Component( modules = {
        NetworkModule.class,
        TwitterModule.class
})
public interface TwitterComponent {
    Tweeter tweeter();

    Timeline timeline();
}
