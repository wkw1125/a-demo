package com.wkw.ademo;

import android.app.Activity;

/**
 * Created by Kw on 2017/10/30.
 */

public class Catalog {
    private String mName;
    private Class<? extends Activity> mClass;

    public Catalog(Class<? extends DemoActivity> catalogClass, String name) {
        mClass = catalogClass;
        mName = name;
    }

    @Override
    public String toString() {
        return mName;
    }

    public Class<? extends Activity> getCatalogClass() {
        return mClass;
    }
}
