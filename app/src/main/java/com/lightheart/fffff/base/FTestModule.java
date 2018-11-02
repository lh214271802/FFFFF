package com.lightheart.fffff.base;

import com.lightheart.commonsdk.app.Teacher;
import com.lightheart.commonsdk.scope.AppScope;


import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * @author LiaoHui
 * @date 2018/11/2
 * @desc
 */
@Module
public class FTestModule {

    @Provides
    @AppScope
    Teacher provideComicApi(Retrofit retrofit) {
        Teacher teacher = new Teacher();
        teacher.name = retrofit.toString();
        teacher.age = 11;
        return teacher;
    }
}
