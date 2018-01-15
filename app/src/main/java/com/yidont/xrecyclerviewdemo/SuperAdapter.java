package com.yidont.xrecyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.yidont.xrecyclerviewdemo.bean.SuperItemType;

import java.util.List;

/**
 * RecyclerView Adapter 的超类
 * Created by zwonb on 2018/1/15.
 */

public class SuperAdapter<E extends SuperItemType, VH extends SuperViewHolder> extends RecyclerView.Adapter<VH> {

    protected Context mContext;
    private List<E> mList;
    private VH[] mVHs;

    public SuperAdapter(List<E> list, VH... VHs) {
        mList = list;
        mVHs = VHs;
    }

    @Override
    public int getItemViewType(int position) {
        return getData().get(position).getItemViewType();
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mContext == null) {
            mContext = parent.getContext();
        }
        for (VH vh : mVHs) {
            if (vh.getItemType() == viewType) {
                return vh;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked cast")
    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.setDate(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public List<E> getData() {
        return mList;
    }
}
