package com.example.devmob;

import android.os.Bundle;
import android.util.Log;


import androidx.appcompat.app.AppCompatActivity;

public class HelloWorldActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedBundle) {
        super.onCreate(savedBundle);
        Log.i("Hello World", "Activity Hello World aberta");
        setContentView(R.layout.helloworld_activity);
    }
}