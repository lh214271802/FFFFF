package com.lightheart.commonsdk.ui.newfrag;


import com.lightheart.commonsdk.app.Person;
import com.lightheart.commonsdk.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author LiaoHui
 * @date 2018/8/10
 * @desc
 */
@Module
public class NewFragmentModule {
    @Provides
    @FragmentScope
    Person providesTeacher() {
        Person person = new Person();
        person.name = "风云无极";
        person.age = 33232;
        return person;
    }
}
