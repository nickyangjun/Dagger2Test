package com.nick.study.dagger2test;

import com.nick.study.dagger2test.utils.HttpHelper;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yangjun1 on 2016/9/22.
 */
@Module
public class MainActivityModule {
    @Provides
    HttpHelper provideHttpHelper(){
        return HttpHelper.getInstance();
    }
}
