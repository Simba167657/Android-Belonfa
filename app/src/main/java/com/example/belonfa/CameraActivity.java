package com.example.belonfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
    }

    public void onBtnScanToOffers(View view) {
        Intent intent = new Intent(this, ShopListActivity.class);
        startActivity(intent);
    }
}
