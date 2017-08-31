package com.li.jacky.designpattern.decorator;

import android.util.Log;

/**
 * Created by Jacky on 2017/8/31.
 * 组件的具体实现
 *
 */

public class ComponentImpl extends Component {

    @Override
    void operate() {
        Log.i(TAG, "operate:  ");
    }
}
