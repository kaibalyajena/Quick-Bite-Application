package com.kaibalya.quickbite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class maggi extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelKathi> userList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maggi);
        getSupportActionBar().hide();
        initData();
        initRecyclerView();
    }
    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelKathi("simple maggi" ,"₹","60"));
        userList.add(new ModelKathi("double masala" ,"₹","80"));
        userList.add(new ModelKathi("Chilli potato" ,"₹","70"));
        userList.add(new ModelKathi("simple maggi" ,"₹","60"));
        userList.add(new ModelKathi("double masala" ,"₹","80"));
        userList.add(new ModelKathi("Chilli potato" ,"₹","70"));
        userList.add(new ModelKathi("simple maggi" ,"₹","60"));
        userList.add(new ModelKathi("double masala" ,"₹","80"));
        userList.add(new ModelKathi("Chilli potato" ,"₹","70"));
        userList.add(new ModelKathi("simple maggi" ,"₹","60"));
        userList.add(new ModelKathi("double masala" ,"₹","80"));
        userList.add(new ModelKathi("Chilli potato" ,"₹","70"));
        userList.add(new ModelKathi("simple maggi" ,"₹","60"));
        userList.add(new ModelKathi("double masala" ,"₹","80"));
        userList.add(new ModelKathi("Chilli potato" ,"₹","70"));
        userList.add(new ModelKathi("simple maggi" ,"₹","60"));
        userList.add(new ModelKathi("double masala" ,"₹","80"));
        userList.add(new ModelKathi("Chilli potato" ,"₹","70"));


    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList,this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

}