package com.arghost.starkjaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Opening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);
        getSupportActionBar().hide();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Opening.this, Produk.class));
                finish();
            }
        };

        Handler h = new Handler();
        h.postDelayed(r,3000);
    }
}