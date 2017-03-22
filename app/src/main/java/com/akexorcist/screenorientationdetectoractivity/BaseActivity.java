package com.akexorcist.screenorientationdetectoractivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.akexorcist.screenorientationhelper.ScreenOrientationHelper;

/**
 * Created by Akexorcist on 3/22/2017 AD.
 */

public class BaseActivity extends AppCompatActivity implements ScreenOrientationHelper.ScreenOrientationChangeListener {
    private ScreenOrientationHelper helper = new ScreenOrientationHelper(this);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        helper.onCreate(savedInstanceState);
        helper.setScreenOrientationChangeListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        helper.onStart();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        helper.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        helper.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onScreenOrientationChanged(int orientation) {

    }
}
