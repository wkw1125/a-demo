package com.wkw.ademo.test;

import android.os.Bundle;

import com.wkw.ademo.DemoActivity;
import com.wkw.ademo.R;

public class TestActivity extends DemoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        i("wkw");
        toast("wkw %s", "love you");
    }

    @Override
    public String getName() {
        return "Test";
    }

}
