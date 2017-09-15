package com.li.jacky.designpattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by Jacky on 2017/9/1.
 * 使用静态内部类来实现
 * 饿汉：耗费资源
 * 懒汉：getInstance时会造成同步开销
 * DCL:java内存模型问题，存在创建失败的可能性
 * 单例持有context，容易造成内存泄漏（强引用的关系，无法回收）
 * activity级别的使用context, application级别的使用applicationContext
 * <a herf="http://blog.csdn.net/ecjtuhq/article/details/53999582"></a>
 */

public class Singleton implements Serializable{


    private Singleton() {
    }

    public Singleton getInstance() {
        return SingletonHolder.instance;
    }

    //线程安全,同时做到了延迟加载
    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }

    //反序列化
    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.instance;
    }

}
