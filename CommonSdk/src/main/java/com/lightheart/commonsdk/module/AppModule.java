package com.lightheart.commonsdk.module;



import android.app.Application;

import com.lightheart.commonsdk.BaseApplication;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Lai
 * @time 2017/12/11 11:43
 * @describe 将会提供Application 的context引用
 */
@Module
public class AppModule {
    @Provides
    @Singleton
    Application provideContext(BaseApplication application) {
        return application;
    }

    @Named("jk")
    @Provides
    @Singleton
    String provideName(String name) {
        return name;
    }
}
