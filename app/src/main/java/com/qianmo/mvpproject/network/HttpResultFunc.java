package com.qianmo.mvpproject.network;


import com.qianmo.mvpproject.response.BaseResponse;

import rx.functions.Func1;

/**
 * Created by Administrator on 2016/11/9 0009.
 */
public class HttpResultFunc<T> implements Func1<BaseResponse<T>, T> {

    @Override
    public T call(BaseResponse<T> httpResult) {
        if (httpResult.getCode() != 200) {
            throw new ApiException(httpResult.getCode());
        }
        return httpResult.getData();
    }
}

