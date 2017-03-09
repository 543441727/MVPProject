package com.qianmo.mvpproject.di.component;

import android.app.Activity;


import com.qianmo.mvpproject.di.ActivityScope;
import com.qianmo.mvpproject.di.module.ActivityModule;
import com.qianmo.mvpproject.ui.activity.CheckVersionActivity;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();

    void inject(CheckVersionActivity welcomeActivity);


}
