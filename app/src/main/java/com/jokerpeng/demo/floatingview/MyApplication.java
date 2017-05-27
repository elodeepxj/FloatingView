package com.jokerpeng.demo.floatingview;

import android.app.Application;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

/**
 * Created by PengXiaoJie on 2017/5/27.14 13..
 */

public class MyApplication extends Application {
    private LayoutParams layoutParams;
    @Override
    public void onCreate() {
        super.onCreate();
        layoutParams = new WindowManager.LayoutParams();
    }

    public LayoutParams getMyWindowParams() {
        return layoutParams;
    }
}
