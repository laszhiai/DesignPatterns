package com.li.jacky.designpattern.decorator;

/**
 * Created by Jacky on 2017/8/31.
 * 抽象组件
 * 定义基本操作
 */

public abstract class Component {

    public static final String TAG = "Decorator Mode";

    abstract void operate();
}
