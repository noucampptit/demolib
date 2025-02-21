package com.iccom.firstappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.iccom.demolib.Helper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Helper.printLog("abc","adfdf");
    }
}