package com.example;

import android.app.Activity;
import android.os.Bundle;
import com.phonegap.*;

public class MyActivity extends DroidGap
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.loadUrl("file:///android_asset/www/device.html");
        setContentView(R.layout.main);
    }
}
