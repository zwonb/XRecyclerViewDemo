package com.yidont.xrecyclerviewdemo;

import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yidont.xrecyclerviewdemo.bean.SuperItemType;

/**
 * RecyclerView ViewHolder 的超类
 * Created by zwonb on 2018/1/15.
 */

public abstract class SuperViewHolder<E extends SuperItemType> extends RecyclerView.ViewHolder {

    private SparseArray<View> mSparseArray;

    public SuperViewHolder(View itemView) {
        super(itemView);
        if (mSparseArray == null) {
            mSparseArray = new SparseArray<>();
        }
    }

    /**
     * 查找 itemView 的id
     * {@link #itemView}
     */
    @SuppressWarnings("unchecked cast")
    protected <V extends View> V getView(@IdRes int id) {
        View view = mSparseArray.get(id);
        if (view == null) {
            view = itemView.findViewById(id);
            mSparseArray.put(id, view);
        }
        return (V) view;
    }

    /**
     * 设置 textView 的数据
     */
    protected SuperViewHolder<E> setText(@IdRes int id, CharSequence text) {
        ((TextView) getView(id)).setText(text);
        return this;
    }

    /**
     * 设置 ImageView 的图片
     */
    public SuperViewHolder<E> setImageResource(@IdRes int id, @DrawableRes int resId) {
        ((ImageView) getView(id)).setImageResource(resId);
        return this;
    }

    protected abstract void setDate(E bean);

    protected abstract int getItemType();
}
