package com.sendbird.android.sample.main;


import android.app.Application;

import com.sendbird.android.SendBird;

public class BaseApplication extends Application {

    private static final String APP_ID = "A74F4A06-E186-4338-9DD0-6E57AB4F303E"; // US-1 Demo
    public static final String VERSION = "3.0.39";

    @Override
    public void onCreate() {
        super.onCreate();
        SendBird.init(APP_ID, getApplicationContext());
    }
}
