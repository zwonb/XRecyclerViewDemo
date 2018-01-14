package com.yidont.xrecyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * 通用的 RecyclerView 适配器
 * Created by zwonb on 2018/1/9.
 */

public class BaseRVAdapter extends RecyclerView.Adapter<BaseRVViewHolder> {

    protected Context mContext;
    private List<String> mListData;
    private OnItemClick mOnItemClick;

    public BaseRVAdapter(List<String> listData) {
        mListData = listData;
    }

    @SuppressWarnings("unchecked cast")
    @Override
    public BaseRVViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mContext == null) {
            mContext = parent.getContext();
        }
        return new BaseRVViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_text, parent, false));
    }

    @Override
    public void onBindViewHolder(final BaseRVViewHolder holder, final int position) {
        holder.setDate(mListData.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClick != null) {
                    mOnItemClick.onClick(position);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mListData.size();
    }

    public void setBean(int pos, String s) {
        mListData.set(pos, s);
    }

    public void removeBean(int pos) {
        mListData.remove(pos);
    }

    public List<String> getListData() {
        return mListData;
    }

    public void setListData(List<String> listData) {
        mListData = listData;
    }

    public void addBean(int pos, String s) {
        mListData.add(pos, s);
    }

    public void addBeanLast(String s) {
        mListData.add(mListData.size(), s);
    }

    public void setOnItemClick(OnItemClick onItemClick) {
        mOnItemClick = onItemClick;
    }

    interface OnItemClick {
        void onClick(int pos);
    }

}
