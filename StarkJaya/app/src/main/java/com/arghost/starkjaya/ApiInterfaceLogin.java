package com.arghost.starkjaya;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterfaceLogin {

    @POST("/api/login")
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);

    @POST("user/")
    Call<RegisterResponse> registerUser(@Body RegisterRequest registerRequest);

}
