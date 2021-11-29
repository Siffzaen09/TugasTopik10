package com.vlaywry;

public class Member {
    String nik;
    String nama;
    String nomorTelp;
    double saldo=0;

    public Member(String nik, String nama, String nomorTelp, double saldo) {
        this.nik = nik;
        this.nama = nama;
        this.nomorTelp = nomorTelp;
        this.saldo = saldo;
    }

    public Member () {

    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelp() {
        return nomorTelp;
    }

    public void setNomorTelp(String nomorTelp) {
        this.nomorTelp = nomorTelp;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
