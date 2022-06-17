package com.kaibalya.quickbite;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class cartFragment extends Fragment {
    private Button help;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cart,container,false);
        help = v.findViewById(R.id.button2);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),yourOrders.class);
                startActivity(intent);
            }
        });
        return v;
    }

//    RecyclerView recyclerView;
//    LinearLayoutManager layoutManager;
//    List<orderModel> userList;
//    orderAdapter adapter;

//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        //initdata();
//        //initRecyclerView();
//
//        return inflater.inflate(R.layout.fragment_cart,container,false);
//    }

//    private void initdata() {
//        userList = new ArrayList<>();
//        userList.add(new orderModel("Egg roll" ,"₹","60","orderid: 4434"));
//        userList.add(new orderModel("Egg roll" ,"₹","60","orderid: 4434"));
//        userList.add(new orderModel("Egg roll" ,"₹","60","orderid: 4434"));
//        userList.add(new orderModel("Egg roll" ,"₹","60","orderid: 4434"));
//        userList.add(new orderModel("Egg roll" ,"₹","60","orderid: 4434"));
//        userList.add(new orderModel("Egg roll" ,"₹","60","orderid: 4434"));
//    }
//
//    private void initRecyclerView() {
//        recyclerView = recyclerView.findViewById(R.id.recyclerView2);
//        layoutManager.setOrientation(RecyclerView.VERTICAL);
//        recyclerView.setLayoutManager(layoutManager);
//        adapter = new orderAdapter(userList);
//        recyclerView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();
//    }
}
