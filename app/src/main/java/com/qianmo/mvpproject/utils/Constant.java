package com.qianmo.mvpproject.utils;


import com.qianmo.mvpproject.App;

import java.io.File;

/**
 * Created by Administrator on 2016/11/8 0008.
 */
public class Constant {
    /**
     * 这里是值本App更新的地址接口
     */
    public static final String BASE_URL = "http://codeest.me/api/geeknews/";
    /**
     * 获取知乎接口信息的基本数据
     */
//    public static final String BASE_URL = "http://news-at.zhihu.com/api/4/";

    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";
    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

}
