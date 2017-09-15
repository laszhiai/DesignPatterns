package com.li.jacky.designpattern.Prototype;

import android.util.Log;

/**
 * Created by Jacky on 2017/9/4.
 * compare
 */

public class Sample {

    private static final String TAG = "Sample";

    public Sample() {
        ListA listA = new ListA();
        ListB listB = new ListB();

        Log.i(TAG, "Sample:  A  " + listA.toString());

        ListA cloneA = listA.clone();
        cloneA.add("a!!!");
        Log.i(TAG, "Sample:  A  " + cloneA.toString());
        Log.i(TAG, "Sample:  A  " + listA.toString());

        Log.i(TAG, "Sample:  B  " + listB.toString());

        ListB cloneB = listB.clone();
        cloneB.add("b!!!");
        Log.i(TAG, "Sample:  B  " + cloneB.toString());
        Log.i(TAG, "Sample:  B  " + listB.toString());
    }
}
