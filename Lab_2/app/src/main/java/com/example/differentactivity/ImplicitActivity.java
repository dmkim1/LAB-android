package com.example.differentactivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ImplicitActivity extends AppCompatActivity {
    // работаем с неявным намерением
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit); // устанавливаем xml-макет для данной активности
    }
}
