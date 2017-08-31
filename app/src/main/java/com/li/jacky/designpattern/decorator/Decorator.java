package com.li.jacky.designpattern.decorator;

/**
 * Created by Jacky on 2017/8/31.
 * 装饰者
 * 装饰原本的功能
 */

public abstract class Decorator extends Component {

    private Component mComponent;

    public Decorator(Component component) {
        mComponent = component;
    }

    @Override
    void operate() {
        mComponent.operate();
    }
}
