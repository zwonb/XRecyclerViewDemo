package com.yidont.xrecyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;

import com.yidont.xrecyclerviewdemo.bean.Bean1;

/**
 * Created by zwonb on 2018/1/15.
 */

public class TextHolder2 extends SuperViewHolder<Bean1> {

    public TextHolder2(Context context) {
        super(LayoutInflater.from(context).inflate(R.layout.item2_img, null));
    }

    @Override
    protected void setDate(Bean1 bean) {
        setImageResource(R.id.item2_img, bean.getImg());
    }

    @Override
    protected int getItemType() {
        return 1;
    }
}
