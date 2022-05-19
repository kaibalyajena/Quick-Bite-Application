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

public class restaurantFragment extends Fragment {
    private Button kathi;
    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View v = inflater.inflate(R.layout.fragment_restaurant,container,false);
//        kathi = v.findViewById(R.id.kathi);
//        kathi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(),kathiJunction.class);
//                startActivity(intent);
//            }
//        });
//        return v;
//    }
    private final View.OnClickListener mListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.kathi:
                    Intent intent = new Intent(getActivity(),kathiJunction.class);
                    startActivity(intent);
                    break;
                case R.id.maggi:
                    Intent intent2 = new Intent(getActivity(),maggi.class);
                    startActivity(intent2);
                    break;
                case R.id.chaiok:
                    Intent intent3 = new Intent(getActivity(),chaiok.class);
                    startActivity(intent3);
                    break;
                case R.id.quench:
                    Intent intent4 = new Intent(getActivity(),quench.class);
                    startActivity(intent4);
                    break;
            }
        }
    };
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_restaurant,container,false);
        v.findViewById(R.id.kathi).setOnClickListener(mListener);
        v.findViewById(R.id.maggi).setOnClickListener(mListener);
        v.findViewById(R.id.chaiok).setOnClickListener(mListener);
        v.findViewById(R.id.quench).setOnClickListener(mListener);
        return v;
    }
}
