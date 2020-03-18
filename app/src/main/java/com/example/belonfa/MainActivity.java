package com.example.belonfa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onBtnScan(View view) {
                Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);


    }

    public void onBtnOffers(View view) {
        Intent intent = new Intent(this, ShopListActivity.class);
        startActivity(intent);
    }
}
