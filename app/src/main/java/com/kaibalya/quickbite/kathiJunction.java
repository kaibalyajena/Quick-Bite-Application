package com.kaibalya.quickbite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class kathiJunction extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelKathi> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kathi_junction);
        initData();
        initRecyclerView();

    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelKathi("Egg roll" ,"₹","60"));
        userList.add(new ModelKathi("Paneer roll" ,"₹","80"));
        userList.add(new ModelKathi("Chilli potato" ,"₹","70"));
        userList.add(new ModelKathi("chole kulche" ,"₹","80"));
        userList.add(new ModelKathi("chole bhature" ,"₹","75"));
        userList.add(new ModelKathi("panner paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));
        userList.add(new ModelKathi("aloo paratha" ,"₹","60"));

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