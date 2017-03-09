package com.qianmo.mvpproject.di.component;



import com.qianmo.mvpproject.App;

import javax.inject.Singleton;
import com.qianmo.mvpproject.di.ContextLife;
import com.qianmo.mvpproject.di.module.AppModule;

import dagger.Component;

/**
 * Created by wangjitao on 16/8/7.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    @ContextLife("Application")
    App getContext();  // 提供App的Context


}
