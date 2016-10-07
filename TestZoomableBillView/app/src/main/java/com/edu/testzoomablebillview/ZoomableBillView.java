package com.edu.testzoomablebillview;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;

import java.util.List;

/**
 * 支持缩放，自由滚动，智能滚动等功能的单据视图
 * Created by Administrator on 2016/10/2.
 */
public class ZoomableBillView extends ViewGroup implements View.OnTouchListener,ISubject ,View.OnFocusChangeListener{

    private static final String TAG = ZoomableBillView.class.getSimpleName();

    // 支持的最大缩放倍数
    public static int MAX_SCALE_TIMES = 2;
    // 初始化缩放比例，根据图片和当前控件的实际尺寸计算出，如果图片宽大于实际尺寸，此值将小于0
    private float mInitScale = -1;
    // 当前缩放比例
    private float mScale = mInitScale;
    // 缩放比重
    private float mScaleWeight = 1.2f;
    // 缩放监听
    private BillZoomListener mZoomListener;
    // 当前是否可放大，缩小
    private boolean mZoomInEnable, mZoomOutEnable;
    // 缩放标识，true：放大，false：缩小
    private boolean mZoomFlag;
    // 当前缩放倍数
    private int mCurrentScaleTimes = 0;

    // 控件的宽度
    private int mWidth;
    // 控件的高度
    private int mHeight;
    // 单据内容区的宽度
    private int mBillWidth;
    // 单据内容区的高度
    private int mBillHeight;

    // Test数据
    private TestBillData mBillData;
    // 单据模板
    private BillTemplate mTemplate;

    // 滑动相关
    private Scroller mScroller;
    // 定义手势检测器实例
    private GestureDetectorCompat mDetector;
    // 阻力系数基数，值越大，阻力越大（如果单据出界，手指滑动距离与单据滑动距离比例系数基数，用于模拟滑动阻力）
    private float mScrollRadio = 5;

    // 背景图
    private BackgroudView mBackgroud;
    private Bitmap mBitmap;
    private Context mContext;

    // 所有空对应的编辑框
    private List<BlankEditText> mEtBlanks;
//    // 所有印章对应的视图
//    private List<SignView> mSignViews;
//    // 所有闪电符对应的视图
//    private List<FlashView> mFlashViews;
//
//    // 盖章状态
//    private DragState mDragState = DragState.INITIAL;
//    // 拖拽用坐标
//    private float oldX = 0;
//    private float oldY = 0;
//    // 当前正在拖拽的印章视图
//    private SignView mDraggingSignView;
//    // 半透明视图
//    private TranslucentView mTransView;
//    // 盖章监听
//    private SignViewListener mSignListener;

    // 焦点处理事件
 //   private FocusHandler mFocusHandler;


    public ZoomableBillView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    /**
     * 获得焦点
     */
    public void gainFocus() {
        mEtBlanks.get(0).requestFocus();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
       switch (event.getAction()){


       }

        return super.onTouchEvent(event);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }


    @Override
    public void applyData(BaseTestData data) {

    }

    @Override
    public void saveAnswer() {

    }

    @Override
    public float submit() {
        return 0;
    }

    @Override
    public void showDetails() {

    }

    @Override
    public void reset() {

    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {

    }
}
