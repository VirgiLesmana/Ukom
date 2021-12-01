package com.arghost.starkjaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Akun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);
    }

    public void imgpengaturan(View view) {
        Intent intent = new Intent(this,Pengaturan_Akun.class);
        startActivity(intent);
    }

    public void tvpengaturanakun(View view) {
        Intent intent = new Intent(this,Pengaturan_Akun.class);
        startActivity(intent);
    }

    public void imgnext(View view) {
        Intent intent = new Intent(this,Pengaturan_Akun.class);
        startActivity(intent);
    }

    public void imgsetting(View view) {
        Intent intent = new Intent(this,Pengaturan_Akun.class);
        startActivity(intent);
    }

    public void imginfoakun(View view) {
        Intent intent = new Intent(this,Info_Akun.class);
        startActivity(intent);
    }

    public void imglogoakun(View view) {
        Intent intent = new Intent(this,Info_Akun.class);
        startActivity(intent);
    }

    public void tvinfoakun(View view) {
        Intent intent = new Intent(this,Info_Akun.class);
        startActivity(intent);
    }

    public void imgselanjutnya(View view) {
        Intent intent = new Intent(this,Info_Akun.class);
        startActivity(intent);
    }

    public void imgberanda(View view) {
        Intent intent = new Intent(this,Produk.class);
        startActivity(intent);
    }

    public void tvberanda(View view) {
        Intent intent = new Intent(this,Produk.class);
        startActivity(intent);
    }


    public void imgkeranjang(View view) {
        Intent intent = new Intent(this,Keranjang.class);
        startActivity(intent);
    }

    public void tvkeranjang2(View view) {
        Intent intent = new Intent(this,Keranjang.class);
        startActivity(intent);
    }
}