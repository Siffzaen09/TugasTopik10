package com.vlaywry;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Driver> d = new ArrayList<>();
    static ArrayList<Customer> c = new ArrayList<>();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int opsi;
        do {
            System.out.println("1.Input Driver");
            System.out.println("2.Input Customer");
            System.out.println("3.Info Driver");
            System.out.println("4.Info Customer");
            System.out.println("5.Top up saldo Customer");
            System.out.println("6.Transaksi/Pembayaran Jasa Pengantaran");
            System.out.println("7.Keluar");
            System.out.println("Masukkan Pilihan \n");
            opsi = s.nextInt();

            switch (opsi) {
                case 1:
                    inputDriver();
                    break;
                case 2:
                    inputCustomer();
                    break;
                case 3:
                    infoUserDriver();
                    break;
                case 4:
                    infoUserCustomer();
                    break;
                case 5:
                    topUpSaldoCustomer();
                    break;
                case 6:
                    bayarDriver();
                    break;
                case 7:
                    System.out.println("===PROGRAM TELAH SELESAI===");
                    break;
                default:
                    System.out.println("!!! TIDAK ADA OPSI SILAHKAN DIULANGI!!!\n");
                    break;
            }
        } while (opsi != 7);
    }

    static void inputDriver() {
        String nik, nama, nomorTelepon, platKendaraan, jenisKendaraan;
        double saldo;

        System.out.println("NIK :");
        nik = s.next();
        System.out.println("Nama :");
        nama = s.next();
        System.out.println("Nomor Telepon :");
        nomorTelepon = s.next();
        System.out.println("Saldo :");
        saldo = s.nextDouble();
        System.out.println("Plat Kendaraan :");
        platKendaraan = s.next();
        System.out.println("Jenis Kendaraan :");
        jenisKendaraan = s.next();

        d.add(new Driver(nik, nama, nomorTelepon, saldo, platKendaraan, jenisKendaraan));
        System.out.println();
    }

    static void inputCustomer() {
        String nik, nama, nomorTelepon;
        double saldo;

        System.out.println("NIK :");
        nik = s.next();
        System.out.println("Nama :");
        nama = s.next();
        System.out.println("Nomor Telepon :");
        nomorTelepon = s.next();
        System.out.println("Saldo :");
        saldo = s.nextDouble();
        c.add(new Customer(nik, nama, nomorTelepon, saldo));
        System.out.println();
    }

    private static void
    infoUserDriver() {
        for (Driver driver : d) {
            System.out.println("NIK :" + driver.getNik()
                    + "\nNama : " + driver.getNama()
                    + "\nNomor Telepon :" + driver.getNomorTelp()
                    + "\nSaldo :" + driver.getSaldo()
                    + "\nNomor Plat Kendaraan :" + driver.getNoplatKendaraan()
                    + "\nJenis Kendaraan :" + driver.getJenisKendaraan());
        }
        System.out.println();
    }

    static void infoUserCustomer() {
        for (Customer customer : c) {
            System.out.println("NIK :" + customer.getNik()
                    + "\nNama :" + customer.getNama()
                    + "\nNomor Telepon :" + customer.getNomorTelp()
                    + "\nSaldo :" + customer.getSaldo() + "\n");
        }
        System.out.println();
    }

    static void topUpSaldoCustomer() {
        int indesxCustomer, indexDriver;
        double topUp;

        System.out.println("Masukkan index customer :");
        indesxCustomer = s.nextInt();
        System.out.println("Masukkan index driver :");
        indexDriver = s.nextInt();
        System.out.println("Total saldo yang akan ditop up :");
        topUp = s.nextDouble();

        d.get(indexDriver).saldo -= topUp;
        c.get(indesxCustomer).saldo += topUp;

        System.out.println("Transaksi berhasil \n");
    }

    static void bayarDriver() {
        int indexCustomer;
        int indexDriver;
        double bayar;

        System.out.println("Masukkan index driver : ");
        indexDriver = s.nextInt();
        System.out.println("Masukkan index customer : ");
        indexCustomer = s.nextInt();
        System.out.println("Jumlah saldo yang akan ditop up :");
        bayar = s.nextDouble();

        c.get(indexDriver).saldo -= bayar;
        d.get(indexCustomer).saldo += bayar;

        System.out.println("Transaksi berhasil!!. \n");
    }

}1