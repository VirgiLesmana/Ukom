package com.arghost.starkjaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Keranjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keranjang);
        getSupportActionBar().hide();
    }

    public void imgakun(View view) {
        Intent intent = new Intent(this,Akun.class);
        startActivity(intent);
    }

    public void imghome(View view) {
        Intent intent = new Intent(this,Produk.class);
        startActivity(intent);
    }

    public void tvhome(View view) {
        Intent intent = new Intent(this,Produk.class);
        startActivity(intent);
    }

    public void tvakun(View view) {
        Intent intent = new Intent(this,Akun.class);
        startActivity(intent);
    }
}