package com.nick.study.dagger2test.utils;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by yangjun1 on 2016/9/22.
 */
@Module
public class HttpHelperModule {
    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(){
        final OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                .readTimeout(60 * 1000, TimeUnit.MILLISECONDS);
        return builder.build();
    }
}
