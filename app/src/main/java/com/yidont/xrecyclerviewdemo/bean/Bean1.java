package com.yidont.xrecyclerviewdemo.bean;

/**
 * 第一种类型的bean
 * Created by zwonb on 2018/1/15.
 */

public class Bean1 implements SuperItemType {

    private String str;
    private int img;
    private int type;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int getItemViewType() {
        return getType();
    }
}
