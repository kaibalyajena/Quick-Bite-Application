package com.kaibalya.quickbite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class yourOrders extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<orderModel> userList1;
    orderAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_orders);
        initData();
        initRecyclerView2();
    }

    private void initData() {
        userList1 = new ArrayList<>();
        userList1.add(new orderModel("Egg roll" ,"₹","60","orderid: 4434"));
        userList1.add(new orderModel("Egg roll" ,"₹","60","orderid: 4434"));
        userList1.add(new orderModel("Egg roll" ,"₹","60","orderid: 4434"));
        userList1.add(new orderModel("Egg roll" ,"₹","60","orderid: 4434"));
        userList1.add(new orderModel("Egg roll" ,"₹","60","orderid: 4434"));
        userList1.add(new orderModel("Egg roll" ,"₹","60","orderid: 4434"));
    }


    private void initRecyclerView2() {
        recyclerView = findViewById(R.id.recyclerView2);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new orderAdapter(userList1);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}