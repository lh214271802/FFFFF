package com.lightheart.commonsdk;

import android.app.Application;
import android.content.Context;

/**
 * @author LiaoHui
 * @date 2018/10/31
 * @desc
 */
public class BaseApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
