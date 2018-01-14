package com.yidont.xrecyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RVActivity extends AppCompatActivity {

    private List<String> mList;
    private XRecyclerView mRv;
    private BaseRVAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);
        initView();
    }

    private void initView() {
        mRv = findViewById(R.id.recycler_view);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new BaseRVAdapter(getList());
        mRv.setAdapter(mAdapter);
        mAdapter.setOnItemClick(new BaseRVAdapter.OnItemClick() {
            @Override
            public void onClick(int pos) {
                mAdapter.addBean(pos,"新增");
                mAdapter.notifyDataSetChanged();
            }
        });
    }

    private List<String> getList22() {
        List<String> mList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mList.add("move" + i);
        }
        return mList;
    }

    private List<String> getList() {
        mList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mList.add("这是一个item啊" + i);
        }
        return mList;
    }
}
