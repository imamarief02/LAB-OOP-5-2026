package Penggajian;

import java.util.Scanner;

abstract class Karyawan {
    private String nama;
    private String idKaryawan;
    protected int jumlahKehadiran = 0;

    public Karyawan(String nama, String idKaryawan) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
    }

    public void absen() {
        jumlahKehadiran++;
    }

    public abstract double hitungGaji();
} 

class KaryawanKontrak extends Karyawan {
    private double upahPerHari;

    public KaryawanKontrak(String nama, String id, double upahPerHari) {
        super(nama, id);
        this.upahPerHari = upahPerHari;
    }

    @Override
    public double hitungGaji() {
        double total = upahPerHari * jumlahKehadiran;

        if (jumlahKehadiran > 20) {
            total += 500000;
        }

        return total;
    }
}

class KaryawanTetap extends Karyawan {
    private double gajiPokok;
    private double tunjanganMakan = 300000;

    public KaryawanTetap(String nama, String id, double gajiPokok) {
        super(nama, id);
        this.gajiPokok = gajiPokok;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (tunjanganMakan * jumlahKehadiran);
    }

    // Overloading
    public double hitungGaji(double bonusKinerja) {
        return hitungGaji() + bonusKinerja;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan ID: ");
        String id = input.nextLine();

        System.out.println("Pilih Kategori:");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");
        int pilihan = input.nextInt();

        System.out.print("Masukkan jumlah kehadiran: ");
        int hadir = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan Gaji Pokok: ");
            double gajiPokok = input.nextDouble();

            System.out.print("Masukkan Bonus: ");
            double bonus = input.nextDouble();

            KaryawanTetap kt = new KaryawanTetap(nama, id, gajiPokok);

            for (int i = 0; i < hadir; i++) {
                kt.absen();
            }

            System.out.println("Total Gaji: " + kt.hitungGaji(bonus));

        } else if (pilihan == 2) {
            System.out.print("Masukkan Upah per Hari: ");
            double upah = input.nextDouble();

            KaryawanKontrak kk = new KaryawanKontrak(nama, id, upah);

            for (int i = 0; i < hadir; i++) {
                kk.absen();
            }

            System.out.println("Total Gaji: " + kk.hitungGaji());
        } else {
            System.out.println("Pilihan tidak valid!");
        }
        input.close();
    }
}