package com.arghost.starkjaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Register extends AppCompatActivity {

    Button btnregis;
    EditText edUsername, edEmail, edpassword, edPhone, edAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_register);
        getSupportActionBar().hide();

//        btnregis = findViewById(R.id.btnregis);
//        edEmail = findViewById(R.id.edEmail);
//        edpassword = findViewById(R.id.edPassword);
//        edPhone = findViewById(R.id.edPhone);
//        edUsername = findViewById(R.id.edUsername);
//        edAlamat = findViewById(R.id.edAlamat);
//
//
//        btnregis.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (TextUtils.isEmpty(edEmail.getText().toString()) || TextUtils.isEmpty(edUsername.getText().toString()) || TextUtils.isEmpty(edpassword.getText().toString()) || TextUtils.isEmpty(edPhone.getText().toString()) || TextUtils.isEmpty(edAlamat.getText().toString())){
//                    String message = "Ada yang belum terisi!";
//                    Toast.makeText(Register.this,message,Toast.LENGTH_LONG).show();
//
//                }else {
//                    RegisterRequest registerRequest = new RegisterRequest();
//                    registerRequest.setEmail(edEmail.getText().toString());
//                    registerRequest.setPassword(edpassword.getText().toString());
//                    registerRequest.setNotelphone(edUsername.getText().toString());
//                    registerRequest.setNotelphone(edPhone.getText().toString());
//                    registerRequest.setNotelphone(edAlamat.getText().toString());
//                    registerUser(registerRequest);
//                }
//            }
//        });
//
//
//    }
//
//    public void registerUser(RegisterRequest registerRequest){
//        Call<RegisterResponse> registerResponseCall = ApiClientLogin.getLogin().registerUser(registerRequest);
//        registerResponseCall.enqueue(new Callback<RegisterResponse>() {
//            @Override
//            public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {
//
//                if (response.isSuccessful()){
//
//
//                    startActivity(new Intent(Register.this,MainActivity.class));
//                    finish();
//
//                }else {
//                    String message = "Gagal registrasi coba ulang nanti...";
//                    Toast.makeText(Register.this,message,Toast.LENGTH_LONG).show();
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<RegisterResponse> call, Throwable t) {
//
//
//
            }
//        }
//        );
//    }


    public void btnregis(View view) {
        Intent intent = new Intent(this,KataRegister.class);
        startActivity(intent);
    }
}