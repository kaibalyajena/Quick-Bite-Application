package com.kaibalya.quickbite;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class itemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itemdetail);
        TextView texttitle  = findViewById(R.id.titletext);
        String username = "item not listed";
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            username = extras.getString("username");
        }
        texttitle.setText(username);
    }

}
