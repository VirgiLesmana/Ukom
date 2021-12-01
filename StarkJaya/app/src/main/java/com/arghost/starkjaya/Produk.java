package com.arghost.starkjaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Produk extends AppCompatActivity {

    ApiInterface apiInterface;
    private RecyclerView recyclerview;
    private RecyclerView.Adapter produkAdapter;
    private RecyclerView.LayoutManager layoutManager;
    public static Produk ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk);
        getSupportActionBar().hide();

//        recyclerview = findViewById(R.id.Produk);
//        recyclerview.setHasFixedSize(true);
//        recyclerview.setLayoutManager(new LinearLayoutManager(this));

//        BarangData[] barangData = new BarangData[]{
//                new BarangData("Velg RCB", "Rp.1.300.00", R.drawable.velg_rcb, "Jl.Raya Bhizer, Sidoarjo, Sukodono Z-100"),
//                new BarangData("Velg VROSSI", "Rp.850.000", R.drawable.velg_vrossi, "Jl.Raya Bhizer, Sidoarjo, Sukodono Z-100"),
//                new BarangData("Shock CMZ", "Rp.340.000", R.drawable.shock_cmz, "Jl.Raya Bhizer, Sidoarjo, Sukodono Z-100"),
//                new BarangData("Shock SCARLET", "Rp.400.000", R.drawable.shock_scarlet, "Jl.Raya Bhizer, Sidoarjo, Sukodono Z-100"),
//                new BarangData("Shock GP", "Rp.1.689.000", R.drawable.shock_gp, "Jl.Raya Bhizer, Sidoarjo, Sukodono Z-100"),
//                new BarangData("Shock OHLINS", "Rp.1.500.00", R.drawable.shock_ohlins, "Jl.Raya Bhizer, Sidoarjo, Sukodono Z-100"),
//                new BarangData("Shock KTC", "Rp.535.000", R.drawable.shock_ktc, "Jl.Raya Bhizer, Sidoarjo, Sukodono Z-100"),
//        };
//
//        BarangSayaAdapter barangSayaAdapter = new BarangSayaAdapter(barangData, Produk.this);
//        recyclerView.setAdapter(barangSayaAdapter);

        recyclerview = (RecyclerView) findViewById(R.id.Produk);
        layoutManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutManager);
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        ma=this;

        panggilRetrofit();

    }

    public void panggilRetrofit(){
        Call<GetMenu> menuCall = apiInterface.getMenu();
        menuCall.enqueue(new Callback<GetMenu>() {
            @Override
            public void onResponse(Call<GetMenu> call, Response<GetMenu>
                    response) {
                List<Menu> menuList = response.body().getData();
                Log.d("Retrofit Get", "Jumlah data Kontak: " +
                        String.valueOf(menuList.size()));
                produkAdapter = new ProdukAdapter(menuList);
                recyclerview.setAdapter(produkAdapter);
            }

            @Override
            public void onFailure(Call<GetMenu> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }

    public void imgakun(View view) {
        Intent intent = new Intent(this,Akun.class);
        startActivity(intent);
    }

    public void tvakun(View view) {
        Intent intent = new Intent(this,Akun.class);
        startActivity(intent);
    }

    public void imgkeranjang(View view) {
        Intent intent = new Intent(this,Keranjang.class);
        startActivity(intent);
    }

    public void tvkeranjang(View view) {
        Intent intent = new Intent(this,Keranjang.class);
        startActivity(intent);
    }
}