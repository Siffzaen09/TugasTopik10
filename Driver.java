package com.vlaywry;

public class Driver extends Member{
    String noplatKendaraan;
    String jenisKendaraan;

    public Driver(String nik, String nama, String nomorTelp, double saldo, String noplatKendaraan, String jenisKendaraan) {
        super(nik, nama, nomorTelp, saldo);
        this.noplatKendaraan = noplatKendaraan;
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getNoplatKendaraan() {
        return noplatKendaraan;
    }

    public void setNoplatKendaraan(String noplatKendaraan) {
        this.noplatKendaraan = noplatKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }
}
