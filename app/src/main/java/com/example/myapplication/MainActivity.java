package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("System.out输出");
        System.err.println("err输出");
        Log.v("MainActivity","Log.v输出");
        Log.d("MainActivity","Log.d输出");
        Log.i("MainActivity","Log.i输出");
        Log.w("MainActivity","Log.w输出");
        Log.e("MainActivity","Log.e输出");
    }
}