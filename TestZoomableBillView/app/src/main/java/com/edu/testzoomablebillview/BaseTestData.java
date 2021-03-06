package com.edu.testzoomablebillview;

/**
 * 题目测试数据基类
 * Created by Administrator on 2016/10/6.
 */
public abstract class BaseTestData extends BaseData{
    /**
     * 问题显示的index
     */
    String subjectIndex;
    /**
     * 预置标识
     *
     */
    int flag;
    /**
     * 题目类别
     */
    int subjectType;
    // 题目id
    protected int subjectId;
    // 用户答案
    protected String uAnswer;
    // 用户得分
    protected float uScore;
    /**
     * 作答状态
     */
    protected int state;

    /**
     * 测试模式
     */
    protected int testMode;

    public abstract BaseSubjectData getSubjectData();

    public abstract void setSubjectData(BaseSubjectData subjectData);

    public int getTestMode() {
        return testMode;
    }

    public void setTestMode(int testMode) {
        this.testMode = testMode;
    }

    public void setSubjectIndex(String subjectIndex) {
        this.subjectIndex = subjectIndex;
    }

    public String getSubjectIndex() {
        return subjectIndex;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(int subjectType) {
        this.subjectType = subjectType;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getuAnswer() {
        return uAnswer;
    }

    public void setuAnswer(String uAnswer) {
        this.uAnswer = uAnswer;
    }

    public float getuScore() {
        return uScore;
    }

    public void setuScore(float uScore) {
        this.uScore = uScore;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }



}
