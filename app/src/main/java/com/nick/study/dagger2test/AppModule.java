package com.nick.study.dagger2test;

import android.app.Application;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by yangjun1 on 2016/9/22.
 */
@Module
public class AppModule {
    MyApplication application;
    public AppModule(MyApplication application){
        this.application = application;
    }

    @Provides
    @Singleton
    public MyApplication provideApplication(){
        return application;
    }
}
