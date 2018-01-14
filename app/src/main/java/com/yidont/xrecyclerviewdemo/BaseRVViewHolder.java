package com.yidont.xrecyclerviewdemo;

import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/**
 * RecyclerView 通用的 ViewHolder
 * Created by zwonb on 2018/1/9.
 */

public class BaseRVViewHolder extends RecyclerView.ViewHolder {

    private SparseArray<View> mSparseArray;

    public BaseRVViewHolder(View itemView) {
        super(itemView);
        mSparseArray = new SparseArray<>();
    }

    /**
     * 查找 itemView 的id
     * {@link #itemView}
     */
    @SuppressWarnings("unchecked cast")
    protected <T extends View> T getView(@IdRes int id) {
        View view = mSparseArray.get(id);
        if (view == null) {
            view = itemView.findViewById(id);
            mSparseArray.put(id, view);
        }
        return (T) view;
    }

    /**
     * 设置 textView 的数据
     */
    protected void setText(@IdRes int id, String text) {
        ((TextView) getView(id)).setText(text);
    }

    protected void setDate(String bean) {
        TextView view = getView(R.id.item_text);
        view.setText(bean);
    }

}
