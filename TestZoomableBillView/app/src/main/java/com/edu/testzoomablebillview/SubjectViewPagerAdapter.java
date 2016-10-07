package com.edu.testzoomablebillview;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
public class SubjectViewPagerAdapter extends FragmentPagerAdapter{
    private static final String TAG = "SubjectTestViewPagerAdapter";
    /**
     * 对应界面的集合
     */
    private List<SubjectViewPagerFragment> mPagerList = new ArrayList<>();

    private List<BaseTestData> mSubjectList = new ArrayList<>();

    private Context context;

    public SubjectViewPagerAdapter(FragmentManager fm,List<BaseTestData> datas,Context context) {
        super(fm);
        this.context  = context;
        if (datas != null){
            for (BaseTestData data : datas) {
                mPagerList.add(null);
                mSubjectList.add(data);
            }

        }
    }

    @Override
    public int getItemPosition(Object object) {
//        意思是如果item的位置如果没有发生变化，则返回POSITION_UNCHANGED。
//        如果返回了POSITION_NONE，表示该位置的item已经不存在了。
//        默认的实现是假设item的位置永远不会发生变化，而返回POSITION_UNCHANGED
//        让getItemPosition方法人为的返回POSITION_NONE，从而达到强迫viewpager重绘所有item的目的。
        return POSITION_NONE;
    }

    @Override
    public Fragment getItem(int position) {
        Log.d(TAG, "get item..." + position);
        if (mPagerList.get(position) == null){
            mPagerList.set(position,new  SubjectViewPagerFragment());
        }


        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
