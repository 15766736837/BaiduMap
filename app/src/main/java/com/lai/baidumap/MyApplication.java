package com.lai.baidumap;

import android.app.Application;

/**
 * Created by Lai on 2017/6/29.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
       // SDKInitializer.initialize(getApplicationContext());
    }
}
