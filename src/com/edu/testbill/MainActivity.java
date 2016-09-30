package com.edu.testbill;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

import com.edu.library.EduBaseActivity;
import com.edu.library.adapter.EduArrayAdapter;
import com.edu.library.data.BaseListItemData;
import com.edu.library.data.DbVersionData;
import com.edu.library.data.DbVersionDataDao;
import com.edu.library.util.DoubleClickExitUtil;
import com.edu.library.util.VersionUtil;
import com.edu.testbill.data.MenuItemData;

/**
 * 公用控件演示主界面
 * 
 * @author lucher
 * 
 */
public class MainActivity extends EduBaseActivity implements OnItemClickListener {

	// 功能列表
	private ListView listView;
	// 简单定制的adapter
	private EduArrayAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 根据自己的需求是否取消全屏
		getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);

		initData();
		initView();

	}

	@Override
	public void initData() {
		adapter = new EduArrayAdapter(mContext, R.layout.edu_list_item);
		List<BaseListItemData> datas = new ArrayList<BaseListItemData>();
		datas.add(new MenuItemData("练习模式"));
		datas.add(new MenuItemData("测试模式"));
		datas.add(new MenuItemData("查看详情模式"));
		adapter.setDatas(datas);
	}

	@Override
	public void initView() {
		// 功能列表
		listView = (ListView) findViewById(R.id.listview);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		MenuItemData data = (MenuItemData) view.getTag();
		if (data.getText().equals("练习模式")) {
			startActivity(PracticeContentActivity.class);
		} else if (data.getText().equals("测试模式")) {
			startActivity(ExamContentActivity.class);
		} else if (data.getText().equals("查看详情模式")) {
			startActivity(ShowDetailsContentActivity.class);
		}
	}

	@Override
	public void onBackPressed() {
		DoubleClickExitUtil.doubleClickExit(this);
	}
}
