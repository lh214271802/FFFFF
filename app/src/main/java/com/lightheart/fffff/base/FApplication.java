package com.lightheart.fffff.base;

import com.lightheart.commonsdk.BaseApplication;
import com.lightheart.commonsdk.component.AppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

/**
 * @author liaohui
 * @date 2018/10/31
 */
public class FApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AndroidInjector<? extends DaggerApplication> injector = super.applicationInjector();
        DaggerFAppcomponent.builder().appComponent((AppComponent) injector).build();
        return injector;
    }
}
