package com.nick.study.dagger2test.utils;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yangjun1 on 2016/9/22.
 */
@Component(modules = HttpHelperModule.class)
@Singleton
public interface HttpHelperComponent {
    void inject(HttpHelper helper);
}
