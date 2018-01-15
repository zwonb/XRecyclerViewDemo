package com.yidont.xrecyclerviewdemo.bean;

/**
 * RecyclerView 多种布局的bean需要实现这个接口
 * Created by zwonb on 2018/1/15.
 */

public interface SuperItemType {

    /**
     * @return 默认从0开始 {@link com.yidont.xrecyclerviewdemo.SuperAdapter}
     * 0 对应第一个 ViewHolder
     * 1 对应第二个 ViewHolder
     * ...
     */
    int getItemViewType();
}
