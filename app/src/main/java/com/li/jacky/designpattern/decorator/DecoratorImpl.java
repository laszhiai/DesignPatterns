package com.li.jacky.designpattern.decorator;

/**
 * Created by Jacky on 2017/8/31.
 * 装饰者的具体实现
 * 装饰原本的功能
 */

public class DecoratorImpl extends Decorator {

    public DecoratorImpl(Component component) {
        super(component);
    }

    @Override
    void operate() {
        operateA();
        super.operate();
        operateB();
    }

    private void operateB() {

    }

    private void operateA() {
    }

}
