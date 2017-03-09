package com.qianmo.mvpproject.contract;


import com.qianmo.mvpproject.base.BasePresenter;
import com.qianmo.mvpproject.base.BaseView;

/**
 * Created by wangjitao on 2016/11/8 0008.
 * 首页逻辑处理
 */
public class MainContract {

    public interface View extends BaseView {
        //View效果就是展示下载进度框
        void ShowToast(String message);
        void setUpdateText(String message);
    }

    public interface Presenter extends BasePresenter<View> {
        //一般在首页我们会进行一个版本的更新（功能）
        void checkVersion(String currentVersion);
    }

}