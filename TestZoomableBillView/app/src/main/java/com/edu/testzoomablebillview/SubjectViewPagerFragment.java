package com.edu.testzoomablebillview;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

/**
 * ViewPager中存放的fragment
 * Created by Administrator on 2016/10/6.
 */
public class SubjectViewPagerFragment extends Fragment implements View.OnClickListener,BillZoomListener{

    /**
     * 题目内容数据
     */
    private BaseTestData mData;

    //控制对应视图
    private ISubject subjectView;
    /**
     * 对应的视图
     */
    private View mView;


    //是否初始化
    private boolean prepared;
    // 缩放按钮
    private Button btnZoomIn, btnZoomOut;

    private Context mContext;

    public static SubjectViewPagerFragment newInstance(BaseTestData data){
        SubjectViewPagerFragment fragment = new SubjectViewPagerFragment();
        fragment.mData = data;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContext = container.getContext();
        switch (mData.getSubjectType()) {
            case SubjectType.SUBJECT_BILL:
                mView = View.inflate(mContext, R.layout.fragment_bill, null);
                initBill();
                break;
            default:
                break;
        }
        subjectView.applyData(mData);
        prepared = true;

        return mView;

    }

    /**
     * 判断当前fragment是否可见
     * @param isVisibleToUser
     */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (getUserVisibleHint()){
            onVisible();
        }else {
            onInvisible();
        }
        
    }

    /**
     * 在onCreat结束时调用
     *
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //延期
        int delay = 0;
        //即时触发的定时器,内部使用handler.postDelayed
        mView.postDelayed(new Runnable() {
            @Override
            public void run() {
                onVisible();
            }
        },delay);
    }

    private void onInvisible() {
    }

    /**
     * fragment可见时的回调
     */

    private void onVisible() {
        if (getUserVisibleHint()&&prepared&&mData.getSubjectType() == SubjectType.SUBJECT_BILL){
            ((ZoomableBillView)subjectView).gainFocus();

        }
    }

    /**
     *
     * 初始化单据相关控件
     */

    private void initBill() {
        btnZoomIn = (Button) mView.findViewById(R.id.btnZoomIn);
        btnZoomOut = (Button) mView.findViewById(R.id.btnZoomOut);
        btnZoomIn.setOnClickListener(this);
        btnZoomOut.setOnClickListener(this);
        subjectView = (ISubject) mView.findViewById(R.id.billView);
      //  ((ZoomableBillView)subjectView).setB

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onZoomInit(boolean zoomInEnable, boolean zoomOutEnable) {

    }

    @Override
    public void onZoomInStart(int currentScaleTimes) {

    }

    @Override
    public void onZoomInEnd(int currentScaleTimes, boolean zoomInEnable, boolean zoomOutEnable) {

    }

    @Override
    public void onZoomOutStart(int currentScaleTimes) {

    }

    @Override
    public void onZoomOutEnd(int currentScaleTimes, boolean zoomInEnable, boolean zoomOutEnable) {

    }
}
