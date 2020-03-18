package com.example.belonfa;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ShopListOfferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list_offer);
        getSupportActionBar().hide(); //hide the title bar
    }
}
