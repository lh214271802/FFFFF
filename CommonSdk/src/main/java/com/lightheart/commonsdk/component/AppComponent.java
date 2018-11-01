package com.lightheart.commonsdk.component;


import com.lightheart.commonsdk.BaseApplication;
import com.lightheart.commonsdk.module.ActivitiesModule;
import com.lightheart.commonsdk.module.ApiModule;
import com.lightheart.commonsdk.module.AppModule;
import com.lightheart.commonsdk.module.FragmentsModule;
import com.lightheart.commonsdk.module.NetModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author Lai
 * @time 2017/12/12 16:52
 * @describe describe
 */
@Component(modules = {
        AppModule.class,
        ActivitiesModule.class,
        FragmentsModule.class,
        NetModule.class,
        ApiModule.class,
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class
})
@Singleton
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(BaseApplication application);

        @BindsInstance
        Builder baseUrl(String url);

        AppComponent build();
    }

    void inject(BaseApplication app);
}
