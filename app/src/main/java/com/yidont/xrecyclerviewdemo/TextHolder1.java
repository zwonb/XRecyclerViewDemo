package com.yidont.xrecyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;

import com.yidont.xrecyclerviewdemo.bean.Bean1;

/**
 * 测试holder1
 * Created by zwonb on 2018/1/15.
 */

public class TextHolder1 extends SuperViewHolder<Bean1> {

    public TextHolder1(Context context) {
        super(LayoutInflater.from(context).inflate(R.layout.item1_text,null));
    }

    @Override
    protected void setDate(Bean1 bean) {
        setText(R.id.item1_text, bean.getStr());
    }

    @Override
    protected int getItemType() {
        return 0;
    }
}
