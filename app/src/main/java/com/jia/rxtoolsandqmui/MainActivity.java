package com.jia.rxtoolsandqmui;

import android.app.ActivityManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getMaxMemoryInfo();

    }

    private void getMaxMemoryInfo(){
        Runtime rt = Runtime.getRuntime();
        long maxMemory = rt.maxMemory();
        Log.e("MaxMemory:", Long.toString(maxMemory/(1024*1024)));
        ActivityManager activityManager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        Log.e("MemoryClass:", Long.toString(activityManager.getMemoryClass()));
        Log.e("LargeMemoryClass:", Long.toString(activityManager.getLargeMemoryClass()));

        System.out.println();
        Toast.makeText(this,Long.toString(maxMemory/(1024*1024))+"  "+ Long.toString(activityManager.getLargeMemoryClass()),Toast.LENGTH_LONG).show();
    }

}
