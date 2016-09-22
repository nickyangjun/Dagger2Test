package com.nick.study.dagger2test;

import com.nick.study.dagger2test.ui.component.MainActivityComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yangjun1 on 2016/9/22.
 */
@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {
    MainActivityComponent plus(MainActivityModule module);
}
