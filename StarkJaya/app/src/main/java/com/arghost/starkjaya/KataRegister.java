package com.arghost.starkjaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KataRegister extends AppCompatActivity {

    Button btnkmbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_register);
        getSupportActionBar().hide();
    }

    public void btnkmbl(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}