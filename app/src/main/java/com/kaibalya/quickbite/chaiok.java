package com.kaibalya.quickbite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class chaiok extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelKathi> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaiok);
        getSupportActionBar().hide();
        initData();
        initRecyclerView();
    }
    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelKathi("masala chai" ,"₹","60"));
        userList.add(new ModelKathi("sandwitch" ,"₹","80"));
        userList.add(new ModelKathi("coffee" ,"₹","70"));
        userList.add(new ModelKathi("lassi" ,"₹","60"));
        userList.add(new ModelKathi("masala chai" ,"₹","60"));
        userList.add(new ModelKathi("sandwitch" ,"₹","80"));
        userList.add(new ModelKathi("coffee" ,"₹","70"));
        userList.add(new ModelKathi("lassi" ,"₹","60"));
        userList.add(new ModelKathi("masala chai" ,"₹","60"));
        userList.add(new ModelKathi("sandwitch" ,"₹","80"));
        userList.add(new ModelKathi("coffee" ,"₹","70"));
        userList.add(new ModelKathi("lassi" ,"₹","60"));
        userList.add(new ModelKathi("masala chai" ,"₹","60"));
        userList.add(new ModelKathi("sandwitch" ,"₹","80"));
        userList.add(new ModelKathi("coffee" ,"₹","70"));
        userList.add(new ModelKathi("lassi" ,"₹","60"));



    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}