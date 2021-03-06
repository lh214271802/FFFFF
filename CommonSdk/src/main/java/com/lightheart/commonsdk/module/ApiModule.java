package com.lightheart.commonsdk.module;


import com.lightheart.commonsdk.app.Teacher;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * @author Lai
 * @time 2017/12/12 15:11
 * @describe 专门提供api仓库
 */
@Module
public class ApiModule {


    @Provides
    @Singleton
    Teacher provideComicApi(Retrofit retrofit) {
        Teacher teacher = new Teacher();
        teacher.name = retrofit.toString();
        teacher.age = 11;
        return teacher;
    }
}
