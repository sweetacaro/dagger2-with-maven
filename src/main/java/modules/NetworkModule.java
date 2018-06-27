package modules;

import dagger.Module;
import dagger.Provides;
import models.OkHttpClient;
import models.TwitterApi;

import javax.inject.Singleton;

@Module
public class NetworkModule {

    @Provides @Singleton
    OkHttpClient provideOkHttpClient() {
        return new OkHttpClient();
    }

    /*@Provides @Singleton
    TwitterApi provideTweeterApi(OkHttpClient okHttpClient) {
        return new TwitterApi(okHttpClient);
    }*/
}
