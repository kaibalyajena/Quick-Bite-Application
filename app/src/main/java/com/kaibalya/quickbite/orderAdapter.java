package com.kaibalya.quickbite;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class orderAdapter extends RecyclerView.Adapter<orderAdapter.viewHolder>{

    ArrayList<orderModel> list;
    private List<orderModel> userList;
    public orderAdapter(List<orderModel>userList){
        this.userList = userList;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_sample,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        String tv1 = userList.get(position).getFooditem();
        String tv2 = userList.get(position).getSymbol();
        String tv3 = userList.get(position).getPrice();
        String tv4 = userList.get(position).getOrderid();
        holder.setData(tv1,tv2,tv3,tv4);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView fooditem,symbol,price,orderid;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fooditem = itemView.findViewById(R.id.fooditem);
            symbol = itemView.findViewById(R.id.symbol);
            price = itemView.findViewById(R.id.price);
            orderid = itemView.findViewById(R.id.orderid);
        }

        public void setData(String tv1, String tv2, String tv3, String tv4) {
            fooditem.setText(tv1);
            symbol.setText(tv2);
            price.setText(tv3);
            orderid.setText(tv4);
        }
    }
}
