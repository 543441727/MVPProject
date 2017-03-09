package com.qianmo.mvpproject.api;

import org.json.JSONObject;

import java.util.Map;

import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * 用户相关API
 */
public interface UserApi {

    /**
     * 登录
     */
    @FormUrlEncoded
    @POST("noa/login")
    Observable<JSONObject> login(@Field("account") String username, @Field("pwd") String pwd);

    /**
     * 注册
     */
    @FormUrlEncoded
    @POST("noa/register")
    Observable<JSONObject> register(@FieldMap Map<String, Object> user);

    /**
     * 发送验证码
     */
    @FormUrlEncoded
    @POST("noa/send/code")
    Observable<JSONObject> sendCode(@Field("op") int op, @Field("phone") String phone);

    /**
     * 检查验证码是否正确
     */
    @FormUrlEncoded
    @POST("noa/check_code")
    Observable<JSONObject> checkCode(@Field("code") String code, @Field("phone") String phone, @Field("op") int op);

    /**
     * 重置密码
     */
    @FormUrlEncoded
    @POST("noa/reset_pwd")
    Observable<JSONObject> resetPwd(@Field("pwd") String pwd, @Field("confirm_pwd") String rePwd, @Field("token") String token);

    /**
     * 修改密码
     */
    @FormUrlEncoded
    @POST("api/chpwd")
    Observable<JSONObject> chpwd(@Field("new_pwd") String new_pwd, @Field("old_pwd") String old_pwd);

}
