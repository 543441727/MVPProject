package com.qianmo.mvpproject.base;

/**
 * Created by wangjitao on 2016/11/8 0008.
 * MVP框架的简单封装 P处理层
 */
public interface BasePresenter<T extends BaseView> {

    void attachView(T view);

    void detachView();
}
