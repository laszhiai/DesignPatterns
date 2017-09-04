package com.li.jacky.designpattern.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jacky on 2017/9/4.
 * 深浅拷贝
 */

public class ListA implements Cloneable{

    private List<String> mList = new ArrayList<>();

    public ListA() {
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
    protected ListA clone(){
        try {
            ListA clone = (ListA) super.clone();
            clone.mList = this.mList;
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
