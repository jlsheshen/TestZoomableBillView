package com.edu.testzoomablebillview;

/**
 * 单据缩放监听
 * Created by Administrator on 2016/10/6.
 */
public interface BillZoomListener {

    /**
     * 缩放初始化方法
     *
     * @param zoomInEnable 是否可放大
     *
     * @param zoomOutEnable 是否看缩小
     */
    void onZoomInit(boolean zoomInEnable,boolean zoomOutEnable);

    /**
     * 放大开始
     * @param currentScaleTimes 当前缩放倍数
     */
    void onZoomInStart(int currentScaleTimes);

    /**
     * 放大结束
     * @param currentScaleTimes 当前缩放倍数
     * @param zoomInEnable 可否被放大
     * @param zoomOutEnable 可否被缩小
     */
    void onZoomInEnd(int currentScaleTimes,boolean zoomInEnable,boolean zoomOutEnable);
    /**
     * 缩小开始
     *
     * @param currentScaleTimes
     *            当前缩放倍数
     */
    void onZoomOutStart(int currentScaleTimes);

    /**
     * 缩小结束
     *
     * @param currentScaleTimes
     *            当前缩放倍数
     * @param zoomInEnable
     *            是否可放大
     * @param zoomOutEnable
     *            是否可缩小
     */
    void onZoomOutEnd(int currentScaleTimes, boolean zoomInEnable, boolean zoomOutEnable);


}
