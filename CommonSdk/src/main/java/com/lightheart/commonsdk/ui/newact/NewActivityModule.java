package com.lightheart.commonsdk.ui.newact;


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
public class NewActivityModule {

    @Provides
    @ActivityScope
    Person provideCollectionDao() {
        Person person = new Person();
        person.age = 16;
        person.name = "jerry";
        return person;
    }
}
