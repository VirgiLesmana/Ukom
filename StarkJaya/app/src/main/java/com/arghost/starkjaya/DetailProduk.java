package com.arghost.starkjaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailProduk extends AppCompatActivity {

    TextView tvNamaProduk, tvHargaProduk, tvAlamatToko;
    ImageView imgProduk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_produk);

        tvNamaProduk = findViewById(R.id.namaProdukDetail);
        tvHargaProduk = findViewById(R.id.hargaProdukDetail);
        imgProduk = findViewById(R.id.imgDetail);

        Glide.with(DetailProduk.this)
                .load(""+getIntent().getStringExtra("imgProduk"))
                .apply(new RequestOptions().override(2000,1000))
                .into(imgProduk);
        tvNamaProduk.setText(getIntent().getExtras().getString("namaProduk"));
        tvHargaProduk.setText(Integer.toString(getIntent().getIntExtra("hargaProduk",0)));
    }

    public void btnbeli(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}