package com.example.belonfa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ShopListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list);
        getSupportActionBar().hide(); //hide the title bar
    }
}
