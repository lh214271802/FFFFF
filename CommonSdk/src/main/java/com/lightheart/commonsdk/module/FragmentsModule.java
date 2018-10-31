package com.lightheart.commonsdk.module;

import com.lightheart.commonsdk.scope.FragmentScope;
import com.lightheart.commonsdk.ui.newfrag.NewFragment;
import com.lightheart.commonsdk.ui.newfrag.NewFragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author LiaoHui
 * @date 2018/8/9
 * @desc
 */
@Module
public abstract class FragmentsModule {

    @ContributesAndroidInjector(modules = NewFragmentModule.class)
    @FragmentScope
    abstract NewFragment newFragmentInjector();
}
