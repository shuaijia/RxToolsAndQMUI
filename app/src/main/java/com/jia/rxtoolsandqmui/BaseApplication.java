package com.jia.rxtoolsandqmui;

import android.app.Application;

import com.vondear.rxtools.RxTool;

/**
 * Description:
 * Created by jia on 2017/12/9.
 * 人之所以能，是相信能
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RxTool.init(this);
    }
}
