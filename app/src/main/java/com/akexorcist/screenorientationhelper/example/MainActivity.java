package com.akexorcist.screenorientationhelper.example;

import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onScreenOrientationChanged(int orientation) {
        // Do something when screen orientation changed
    }
}
