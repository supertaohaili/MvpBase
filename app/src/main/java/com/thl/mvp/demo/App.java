package com.thl.mvp.demo;

import android.app.Application;
import android.content.Context;

import com.thl.mvp.MvpApplication;


/**
 * Created on 2016/12/31.
 */

public class App extends MvpApplication {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;


    }

    @Override
    protected void initConfig() throws Exception {

    }

    @Override
    protected void initConfigThread() throws Exception {

    }

    public static Context getContext() {
        return context;
    }
}
