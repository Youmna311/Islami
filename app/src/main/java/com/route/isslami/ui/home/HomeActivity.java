package com.route.isslami.ui.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.route.isslami.R;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomnavi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentscontainer,new QuranFragment()).commit();
        bottomnavi = findViewById(R.id.mainbottomnavigation);
        bottomnavi.setOnItemSelectedListener(item -> {

            if(item.getItemId() == R.id.ahadethic)
            {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentscontainer,new AhadethFragment()).commit();
            }
            else if(item.getItemId() == R.id.sebhaic)
            {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentscontainer,new SebhaFragment()).commit();
            }
            else if(item.getItemId() == R.id.quranic)
            {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentscontainer,new QuranFragment()).commit();
            }
            return true;
        });

    }

}