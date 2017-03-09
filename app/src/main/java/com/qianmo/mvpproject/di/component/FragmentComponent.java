package com.qianmo.mvpproject.di.component;

import android.app.Activity;


import com.qianmo.mvpproject.di.FragmentScope;
import com.qianmo.mvpproject.di.module.FragmentModule;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {

    Activity getActivity();

//    void inject(DailyFragment dailyFragment);


}
