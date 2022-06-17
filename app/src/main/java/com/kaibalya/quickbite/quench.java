package com.kaibalya.quickbite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class quench extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelKathi> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quench);
        initData();
        initRecyclerView();
    }
    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelKathi("wrap" ,"₹","60"));
        userList.add(new ModelKathi("fries" ,"₹","80"));
        userList.add(new ModelKathi("burger" ,"₹","70"));
        userList.add(new ModelKathi("subway" ,"₹","80"));
        userList.add(new ModelKathi("wrap" ,"₹","60"));
        userList.add(new ModelKathi("fries" ,"₹","80"));
        userList.add(new ModelKathi("burger" ,"₹","70"));
        userList.add(new ModelKathi("subway" ,"₹","80"));
        userList.add(new ModelKathi("wrap" ,"₹","60"));
        userList.add(new ModelKathi("fries" ,"₹","80"));
        userList.add(new ModelKathi("burger" ,"₹","70"));
        userList.add(new ModelKathi("subway" ,"₹","80"));
        userList.add(new ModelKathi("wrap" ,"₹","60"));
        userList.add(new ModelKathi("fries" ,"₹","80"));
        userList.add(new ModelKathi("burger" ,"₹","70"));
        userList.add(new ModelKathi("subway" ,"₹","80"));
        userList.add(new ModelKathi("wrap" ,"₹","60"));
        userList.add(new ModelKathi("fries" ,"₹","80"));
        userList.add(new ModelKathi("burger" ,"₹","70"));
        userList.add(new ModelKathi("subway" ,"₹","80"));
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