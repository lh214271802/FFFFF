package com.lightheart.commonsdk.ui.main;


import com.lightheart.commonsdk.app.Person;
import com.lightheart.commonsdk.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author Lai
 * @time 2018/2/1 19:43
 * @describe 数据库管理仓库
 */
@Module
public class MainActivityModule {

    @Provides
    @ActivityScope
    Person provideCollectionDao() {
        Person person = new Person();
        person.age = 18;
        person.name = "jack";
        return person;
    }
}
