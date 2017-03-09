package com.qianmo.mvpproject.di.module;

import android.app.Activity;
import android.content.Context;


import com.qianmo.mvpproject.base.BaseRxPresenter;
import com.qianmo.mvpproject.di.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by codeest on 16/8/7.
 */

@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityScope
    public Activity provideActivity() {
        return mActivity;
    }

    @Provides
    public Context provideContext() {
        return mActivity;
    }

}
