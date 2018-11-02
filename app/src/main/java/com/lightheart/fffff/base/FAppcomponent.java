package com.lightheart.fffff.base;

import com.lightheart.commonsdk.component.AppComponent;
import com.lightheart.commonsdk.scope.AppScope;


import dagger.Component;

/**
 * @author LiaoHui
 * @date 2018/11/2
 * @desc
 */
@AppScope
@Component(dependencies = AppComponent.class, modules = {FTestModule.class})
public interface FAppcomponent{
}
