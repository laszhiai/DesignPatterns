package com.li.jacky.designpattern.decorator;

/**
 * Created by Jacky on 2017/8/31.
 * 使用介绍
 */

public class Sample {

    public void test(){

        Component component = new ComponentImpl();

        DecoratorImpl decorator = new DecoratorImpl(component);
        decorator.operate();

    }
}
