package com.jokerpeng.demo.floatingview;

import android.content.Context;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;


/**
 * Created by PengXiaoJie on 2017/5/27.14 05..
 */

public class FloatingView extends ImageView {
    private WindowManager windowManager;
    private LayoutParams layoutParams;
    public FloatingView(Context context) {
        super(context);
        initData();
    }

    private void initData() {
        windowManager = (WindowManager) getContext().getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        layoutParams = ((MyApplication)getContext().getApplicationContext()).getMyWindowParams();
    }

}
