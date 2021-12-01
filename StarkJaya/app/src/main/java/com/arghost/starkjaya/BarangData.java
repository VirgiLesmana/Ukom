package com.arghost.starkjaya;

public class BarangData {

    private String barang;
    private String hargaBarang;
    private Integer gambarBarang;
    private String alamat;

    public BarangData(String barang, String hargaBarang, Integer gambarBarang, String alamat) {
        this.barang = barang;
        this.hargaBarang = hargaBarang;
        this.gambarBarang = gambarBarang;
        this.alamat = alamat;
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public String getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(String hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public Integer getGambarBarang() {
        return gambarBarang;
    }

    public void setGambarBarang(Integer gambarBarang) {
        this.gambarBarang = gambarBarang;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
