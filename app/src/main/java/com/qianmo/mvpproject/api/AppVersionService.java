package com.qianmo.mvpproject.api;



import com.qianmo.mvpproject.model.bean.VersionBean;
import com.qianmo.mvpproject.response.BaseResponse;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by wangjitao on 2016/11/8 0008.
 * App检测更新类
 */
public interface AppVersionService {
    /**
     * 获取到最新版本信息
     */
    @GET("version")
    Observable<BaseResponse<VersionBean>> getVersion();
}
