package com.kaibalya.quickbite;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private final Context context;
    private List<ModelKathi> userList;
    public Adapter(List<ModelKathi>userList,Context context){
        this.userList = userList;
        this.context = context;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kathi_junction_food_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        String tv1 = userList.get(position).getTextview1();
        String tv2 = userList.get(position).getTextview2();
        String tv3 = userList.get(position).getTextview3();
        holder.setData(tv1,tv2,tv3);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, showDetailActivity.class);
                //intent.putExtra("name",ModelKathi.get);
                //intent.putExtra("price",ModelKathi.getTextview3());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textview1;
        private TextView textview2;
        private TextView textview3;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textview1 = itemView.findViewById(R.id.textview1);
            textview2 = itemView.findViewById(R.id.textview2);
            textview3 = itemView.findViewById(R.id.textview3);
        }

        public void setData(String tv1, String tv2, String tv3) {
            textview1.setText(tv1);
            textview2.setText(tv2);
            textview3.setText(tv3);
        }
}
}



//package com.kaibalya.quickbite;
//
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
//
//    private List<ModelKathi> userList;
//    private final Context context;
//    public Adapter(List<ModelKathi>userList,Context context){
//        this.userList = userList;
//        this.context=context;
//    }
//
//    @NonNull
//    @Override
//    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kathi_junction_food_list,parent,false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
//        String tv1 = userList.get(position).getTextview1();
//        String tv2 = userList.get(position).getTextview2();
//        String tv3 = userList.get(position).getTextview3();
//        holder.setData(tv1,tv2,tv3);
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(context,showDetailActivity.class);
//                context.startActivity(intent);
//            }
//        });
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return userList.size();
//    }
//    public class ViewHolder extends RecyclerView.ViewHolder{
//
//        private TextView textview1;
//        private TextView textview2;
//        private TextView textview3;
//
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            textview1 = itemView.findViewById(R.id.textview1);
//            textview2 = itemView.findViewById(R.id.textview2);
//            textview3 = itemView.findViewById(R.id.textview3);
//        }
//
//        public void setData(String tv1, String tv2, String tv3) {
//            textview1.setText(tv1);
//            textview2.setText(tv2);
//            textview3.setText(tv3);
//        }
//    }
//}