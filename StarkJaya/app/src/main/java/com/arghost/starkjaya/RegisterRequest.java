package com.arghost.starkjaya;

public class RegisterRequest {

    private String email;
    private String password;
    private String notelphone;
    private String username;
    private String alamat;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNotelphone() {
        return notelphone;
    }

    public void setNotelphone(String notelphone) {
        this.notelphone = notelphone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
