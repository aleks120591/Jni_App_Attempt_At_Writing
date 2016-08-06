package com.warlock.jniapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = new TextView(this);
        tv.setText(stringFromJNI());
        setContentView(tv);
    }
    public native String  stringFromJNI();
    public native String  unimplementedStringFromJNI();

    static {
        System.loadLibrary("hello-jni");
    }
}
