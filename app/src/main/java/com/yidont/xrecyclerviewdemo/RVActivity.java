package com.yidont.xrecyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.yidont.xrecyclerviewdemo.bean.Bean1;

import java.util.ArrayList;
import java.util.List;

public class RVActivity extends AppCompatActivity {

    private RecyclerView mRv;
//    private BaseRVAdapter mAdapter;
    private int mPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);
        initView();
    }

    private void initView() {
        mRv = findViewById(R.id.recycler_view);
        mRv.setLayoutManager(new LinearLayoutManager(this));
//        mAdapter = new BaseRVAdapter(getList());
//        mRv.setAdapter(mAdapter);
//        mAdapter.setOnItemClick(new BaseRVAdapter.OnItemClick() {
//            @Override
//            public void onClick(int pos) {
//                mAdapter.addBeanLast(getAddBean());
//                mRv.notifyItemInserted(mAdapter.getListData().size());
////                mAdapter.notifyDataSetChanged();
//            }
//        });
        mRv.setAdapter(new SuperAdapter(getList(),new TextHolder1(this),new TextHolder2(this)));
    }

    private List<Bean1> getList() {
        List<Bean1> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Bean1 bean1 = new Bean1();
            if (i % 2 == 0) {
                bean1.setImg(R.mipmap.ic_launcher);
                bean1.setType(1);
            }else {
                bean1.setType(0);
                bean1.setStr("数据" + i);
            }
            list.add(bean1);
        }
        return list;
    }
}
