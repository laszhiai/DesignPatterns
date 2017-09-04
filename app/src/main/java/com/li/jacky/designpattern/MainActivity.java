package com.li.jacky.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.li.jacky.designpattern.Prototype.Sample;
import com.li.jacky.designpattern.singleton.SingletonEnum;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //原型模型
        new Sample();
    }

}
