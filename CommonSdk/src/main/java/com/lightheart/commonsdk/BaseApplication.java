package com.lightheart.commonsdk;

import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.Utils;
import com.lightheart.commonsdk.component.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

/**
 * @author LiaoHui
 * @date 2018/10/31
 * @desc
 */
public class BaseApplication extends DaggerApplication {
    private static BaseApplication app;

    @Override
    public void onCreate() {
        app = this;
        super.onCreate();
        Utils.init(this);
        if (BuildConfig.DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(app); // 尽可能早，推荐在Application中初始化
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).baseUrl("i am jack").build();
    }

    public static Context getApp() {
        return app;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
    }

}
