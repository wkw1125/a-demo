package com.wkw.ademo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Kw on 2018/5/18.
 */
public abstract class DemoActivity extends AppCompatActivity {
    private final String TAG = getClass().getSimpleName();

    public abstract String getName();

    @Override
    public String toString() {
        return getName();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getName());
    }

    private String format(String format, Object[] args) {
        return String.format(format, args);
    }

    public void toast(String format, Object... args) {
        Toast.makeText(this, format(format, args), Toast.LENGTH_SHORT).show();
    }

    public void toast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public void v(String text) {
        Log.v(TAG, text);
    }

    public void d(String text) {
        Log.d(TAG, text);
    }

    public void i(String text) {
        Log.i(TAG, text);
    }

    public void w(String text) {
        Log.w(TAG, text);
    }

    public void e(String text) {
        Log.e(TAG, text);
    }

    public void v(String format, Object... args) {
        Log.v(TAG, format(format, args));
    }

    public void d(String format, Object... args) {
        Log.d(TAG, format(format, args));
    }

    public void i(String format, Object... args) {
        Log.i(TAG, format(format, args));
    }

    public void w(String format, Object... args) {
        Log.w(TAG, format(format, args));
    }

    public void e(String format, Object... args) {
        Log.e(TAG, format(format, args));
    }
}
