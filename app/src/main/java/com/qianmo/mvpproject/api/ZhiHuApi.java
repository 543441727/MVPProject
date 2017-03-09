package com.qianmo.mvpproject.api;



import com.qianmo.mvpproject.model.bean.CommentBean;
import com.qianmo.mvpproject.model.bean.DailyBeforeListBean;
import com.qianmo.mvpproject.model.bean.DailyListBean;
import com.qianmo.mvpproject.model.bean.DetailExtraBean;
import com.qianmo.mvpproject.model.bean.HotListBean;
import com.qianmo.mvpproject.model.bean.SectionChildListBean;
import com.qianmo.mvpproject.model.bean.SectionListBean;
import com.qianmo.mvpproject.model.bean.ThemeChildListBean;
import com.qianmo.mvpproject.model.bean.ThemeListBean;
import com.qianmo.mvpproject.model.bean.WelcomeBean;
import com.qianmo.mvpproject.model.bean.ZhihuDetailBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by wangjitao on 2016/11/9 0009.
 * 知乎Api
 */
public interface ZhiHuApi {
    /**
     * 启动界面图片
     */
    @GET("start-image/{res}")
    Observable<WelcomeBean> getWelcomeInfo(@Path("res") String res);

    /**
     * 最新日报
     */
    @GET("news/latest")
    Observable<DailyListBean> getDailyList();

    /**
     * 往期日报
     */
    @GET("news/before/{date}")
    Observable<DailyBeforeListBean> getDailyBeforeList(@Path("date") String date);

    /**
     * 主题日报
     */
    @GET("themes")
    Observable<ThemeListBean> getThemeList();

    /**
     * 主题日报详情
     */
    @GET("theme/{id}")
    Observable<ThemeChildListBean> getThemeChildList(@Path("id") int id);

    /**
     * 专栏日报
     */
    @GET("sections")
    Observable<SectionListBean> getSectionList();

    /**
     * 专栏日报详情
     */
    @GET("section/{id}")
    Observable<SectionChildListBean> getSectionChildList(@Path("id") int id);

    /**
     * 热门日报
     */
    @GET("news/hot")
    Observable<HotListBean> getHotList();

    /**
     * 日报详情
     */
    @GET("news/{id}")
    Observable<ZhihuDetailBean> getDetailInfo(@Path("id") int id);

    /**
     * 日报的额外信息
     */
    @GET("story-extra/{id}")
    Observable<DetailExtraBean> getDetailExtraInfo(@Path("id") int id);

    /**
     * 日报的长评论
     */
    @GET("story/{id}/long-comments")
    Observable<CommentBean> getLongCommentInfo(@Path("id") int id);

    /**
     * 日报的短评论
     */
    @GET("story/{id}/short-comments")
    Observable<CommentBean> getShortCommentInfo(@Path("id") int id);
}
