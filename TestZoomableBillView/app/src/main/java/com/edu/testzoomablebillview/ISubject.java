package com.edu.testzoomablebillview;

/**
 * 题目视图对象接口
 * Created by Administrator on 2016/10/6.
 */
public interface ISubject {
    /**
     * 申请数据
     * 产品美国object恢复视图状态
     * @param data
     */
    void applyData(BaseTestData data);

    /**
     * 保存答案
     */
    void saveAnswer();

    /**
     * 提交
     * @return 得分
     */
    float submit();

    /**
     * 显示详情
     */
    void showDetails();

    /**
     * 重置该题
     */
    void reset();



}
