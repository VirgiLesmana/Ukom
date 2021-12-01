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

public class MainActivity extends AppCompatActivity {
    Button btnca, btnlogin;
    Button btnLog;
    EditText etId, etPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        load();

        btnLog = findViewById(R.id.btnlogin);
        etId = findViewById(R.id.etid);
        etPass = findViewById(R.id.etpassword);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etId.getText().toString()) || TextUtils.isEmpty(etPass.getText().toString())){
                    String message = "Ada yang belum terisi!";
                    Toast.makeText(MainActivity.this,message,Toast.LENGTH_LONG).show();

                }else {
                    LoginRequest loginRequest = new LoginRequest();
                    loginRequest.setEmail(etId.getText().toString());
                    loginRequest.setPassword(etPass.getText().toString());
                    String message = "Kata Sandi Atau Email yang anda masukkan salah";
                    Toast.makeText(MainActivity.this,message,Toast.LENGTH_LONG).show();
//                    registerRequest.setNotelphone(edUsername.getText().toString());
//                    registerRequest.setNotelphone(edPhone.getText().toString());
//                    registerRequest.setNotelphone(edAlamat.getText().toString());
                    loginUser(loginRequest);
            }
        }
        });


    }

    public void loginUser(LoginRequest loginRequest){
        Call<LoginResponse> loginResponseCall = ApiClientLogin.getLogin().loginUser(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                if (response.isSuccessful()){
                    startActivity(new Intent(MainActivity.this,CheckOut.class));
                    finish();

                }else {
                    String message = "Gagal login coba ulang nanti...";
                    Toast.makeText(MainActivity.this,message,Toast.LENGTH_LONG).show();
                }

            }
            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
    }
        }
        );
    }

    public void load(){
        btnLog=findViewById(R.id.btnlogin);
    }
    public void Register(){
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }

    public void btnlogin(View view) {
        Intent intent = new Intent(this,Produk.class);
        startActivity(intent);
    }

    public void tvlupapassword(View view) {
        Intent intent = new Intent(this,LupaPassword.class);
        startActivity(intent);
    }
}