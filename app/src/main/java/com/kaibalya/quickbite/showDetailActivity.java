package com.kaibalya.quickbite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class showDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);
        getSupportActionBar().hide();

//        String title = getIntent().getStringExtra("title");
//        int price = Integer.parseInt(getIntent().getStringExtra("price"));

    }
}