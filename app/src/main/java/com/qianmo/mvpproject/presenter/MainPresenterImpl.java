package com.qianmo.mvpproject.presenter;

import android.content.Context;


import com.qianmo.mvpproject.api.AppVersionService;
import com.qianmo.mvpproject.base.BaseRxPresenter;
import com.qianmo.mvpproject.contract.MainContract;
import com.qianmo.mvpproject.model.bean.VersionBean;
import com.qianmo.mvpproject.network.HttpResultFunc;
import com.qianmo.mvpproject.network.ProgressSubscriber;
import com.qianmo.mvpproject.network.RetrofitManager;
import com.qianmo.mvpproject.network.SubscriberOnNextListenter;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;


/**
 * Created by MVPHelper on 2016/11/08
 */

public class MainPresenterImpl extends BaseRxPresenter<MainContract.View> implements MainContract.Presenter {

    private Context context;

    @Inject
    public MainPresenterImpl(Context context) {
        this.context = context;
    }

    @Override
    public void checkVersion(final String currentVersion) {

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(Constant.BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .build();
//        AppVersionService movieService = retrofit.create(AppVersionService.class);
//
//        movieService.getVersion()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<BaseResponse<VersionBean>>() {
//                    @Override
//                    public void onStart() {
//                        mView.showProgressDialog();
//                    }
//
//                    @Override
//                    public void onCompleted() {
//                        mView.DissProgressDialog();
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        mView.DissProgressDialog();
//                        mView.ShowToast("请求出错");
//                    }
//
//                    @Override
//                    public void onNext(BaseResponse<VersionBean> versionBeanBaseResponse) {
//                        if (Integer.valueOf(currentVersion.replace(".", "")) < Integer.valueOf(versionBeanBaseResponse.getData().getCode().replace(".", ""))) {
//                            // mView.showUpdateDialog(versionBean);
//                            //这里表示发现新版本
//                            mView.ShowToast("发现最新版本");
//                        } else {
//                            //表示这就是最新版本
//                            mView.ShowToast("已经是最新版本");
//                        }
//                    }
//                });


        Observable observable = RetrofitManager.getInstace()
                .create(AppVersionService.class).getVersion()
                .map(new HttpResultFunc<VersionBean>());
        Subscription rxSubscription = new ProgressSubscriber<>(new SubscriberOnNextListenter<VersionBean>() {
            @Override
            public void next(VersionBean versionBean) {
                mView.setUpdateText(versionBean.getDes());
            }
        }, context);
        RetrofitManager.getInstace().toSubscribe(observable, (Subscriber) rxSubscription);
        addSubscrebe(rxSubscription);
    }


}