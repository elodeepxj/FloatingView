package com.jokerpeng.demo.floatingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;


public class MainActivity extends AppCompatActivity {
    private FloatingView floatingView;
    private WindowManager windowManager;
    private LayoutParams layoutParams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        floatingView = new FloatingView(getApplicationContext());
        floatingView.setImageResource(R.mipmap.ic_launcher_round);
        windowManager = (WindowManager) getApplicationContext().getSystemService(WINDOW_SERVICE);
    }

    private void initData() {

    }
}
