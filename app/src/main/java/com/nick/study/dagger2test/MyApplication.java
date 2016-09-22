package com.nick.study.dagger2test;

import android.app.Application;
import android.content.Context;

/**
 * Created by yangjun1 on 2016/9/22.
 */
public class MyApplication extends Application {
    AppComponent appComponent;

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initAppComponent();
    }

    private void initAppComponent(){
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
    public AppComponent getAppComponent(){
        return appComponent;
    }
}
