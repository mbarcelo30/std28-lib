package com.std28.lib.app;

import android.content.Context;


public class BaseMultidexApp
    extends BaseApp
{
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        androidx.multidex.MultiDex.install(this);
    }
}
