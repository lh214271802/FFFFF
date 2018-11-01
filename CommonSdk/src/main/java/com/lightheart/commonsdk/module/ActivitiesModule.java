package com.lightheart.commonsdk.module;


import com.lightheart.commonsdk.scope.ActivityScope;
import com.lightheart.commonsdk.ui.main.MyTestsActivity;
import com.lightheart.commonsdk.ui.main.MainActivityModule;
import com.lightheart.commonsdk.ui.newact.NewActivity;
import com.lightheart.commonsdk.ui.newact.NewActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author Lai
 * @time 2017/12/12 16:54
 * @describe Activity 统一注入
 */
@Module
public abstract class ActivitiesModule {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    @ActivityScope
    abstract MyTestsActivity mainActivityInjector();

    @ContributesAndroidInjector(modules = NewActivityModule.class)
    @ActivityScope
    abstract NewActivity newActivityInjector();

}
