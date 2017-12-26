package com.terry.test;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by ${Terry} on 2017/12/26.
 */
public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
