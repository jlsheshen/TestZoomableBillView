package com.edu.testzoomablebillview;

/**
 * 支持缩放控件的接口
 * Created by Administrator on 2016/10/7.
 */
public interface IScaleable {


    /**
     * 按指定的比例对控件进行缩放
     * @param scale  缩放比例
     * @param scaleTimes  缩放倍数
     */
    void postScale(float scale,int scaleTimes);
}
