package com.li.jacky.designpattern.Prototype;

import java.util.ArrayList;

/**
 * Created by Jacky on 2017/9/4.
 * 深浅拷贝
 */

public class ListB implements Cloneable{

    private ArrayList<String> mList = new ArrayList<>();

    public ListB() {
        mList.add("1");
        mList.add("2");
        mList.add("3");
        mList.add("4");
        mList.add("5");
    }

    public boolean add(String s) {
        return mList.add(s);
    }

    @Override
    protected ListB clone(){
        try {
            ListB clone = (ListB) super.clone();
            clone.mList = (ArrayList<String>)this.mList.clone();
            return clone;
        }catch (Exception e) {
        }
        return null;
    }

    @Override
    public String toString() {
        return mList.toString();
    }
}
