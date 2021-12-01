package com.arghost.starkjaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class CheckOut extends AppCompatActivity {

    ImageView imgdetail;
    TextView tv1, tv2, tv3, tv4, tv5, tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);

        Intent intent = getIntent();
        imgdetail = (ImageView) findViewById(R.id.imgsj);
        tv1 = (TextView) findViewById(R.id.tvProduk);
        tv2 = (TextView) findViewById(R.id.tvHarga);
        tv3 = (TextView) findViewById(R.id.tvalamat);
        tv4 = (TextView) findViewById(R.id.tvOriginal);
        tv5 = (TextView) findViewById(R.id.tvketerangan);
        tv6 = (TextView) findViewById(R.id.tvwa);

        tv1.setText(intent.getStringExtra("tvProduk"));
        tv2.setText(intent.getStringExtra("TvHarga"));
        tv3.setText(intent.getStringExtra("tvAlamat"));

        Glide.with(CheckOut.this)
                .load("" + intent.getStringExtra("imgbarang"))
                .apply(new RequestOptions().override(350, 550))
                .into(imgdetail);
    }
}