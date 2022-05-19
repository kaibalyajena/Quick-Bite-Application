package com.kaibalya.quickbite;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new restaurantFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selected_fragment = null;
            switch (item.getItemId())
            {
                case R.id.restaurant:
                    selected_fragment =  new restaurantFragment();
                    break;
                case R.id.cart:
                    selected_fragment =  new cartFragment();
                    break;
                case R.id.profile:
                    selected_fragment =  new profileFragment();
                    break;
                case R.id.settings:
                    selected_fragment =  new settingsFragment();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selected_fragment).commit();
            return true;
        }
    };
}