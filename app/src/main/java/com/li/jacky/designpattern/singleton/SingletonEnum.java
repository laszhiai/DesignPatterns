package com.li.jacky.designpattern.singleton;

import android.util.Log;
import java.io.Serializable;

/**
 * Created by Jacky on 2017/9/1.
 * 枚举法
 * POJO
 */

public enum SingletonEnum implements Serializable{
    INSTANCE;

    private static final String TAG = "SingletonEnum";

    private String filed;

    private void doSomething() {
        Log.i(TAG, "doSomething: ");
    }

    public String getFiled() {
        return filed;
    }

    public void setFiled(String filed) {
        this.filed = filed;
    }
}
