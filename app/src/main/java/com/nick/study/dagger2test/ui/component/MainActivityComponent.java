package com.nick.study.dagger2test.ui.component;

import com.nick.study.dagger2test.MainActivityModule;
import com.nick.study.dagger2test.ui.activity.MainActivity;

import dagger.Subcomponent;

/**
 * Created by yangjun1 on 2016/9/22.
 */
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
