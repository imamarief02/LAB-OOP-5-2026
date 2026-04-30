package Bangun;

import java.util.Scanner;

class Bangun {
    double luas() { return 0; }
    double keliling() { return 0; }
    double volume() { return 0; }
}

// Bangun Datar
class Persegi extends Bangun {
    double sisi;

    Persegi(double sisi) { this.sisi = sisi; }

    double luas() { return sisi * sisi; }
    double keliling() { return 4 * sisi; }
}

class PersegiPanjang extends Bangun {
    double p, l;

    PersegiPanjang(double p, double l) {
        this.p = p; this.l = l;
    }

    double luas() { return p * l; }
    double keliling() { return 2 * (p + l); }
}

class Lingkaran extends Bangun {
    double r;

    Lingkaran(double r) { this.r = r; }

    double luas() { return Math.PI * r * r; }
    double keliling() { return 2 * Math.PI * r; }
}

class Trapesium extends Bangun {
    double a, b, c, d, t;

    Trapesium(double a, double b, double c, double d, double t) {
        this.a = a; this.b = b;
        this.c = c; this.d = d;
        this.t = t;
    }

    double luas() { return 0.5 * (a + b) * t; }
    double keliling() { return a + b + c + d; }
}

// Bangun Ruang

class Kubus extends Bangun {
    double sisi;

    Kubus(double sisi) { this.sisi = sisi; }

    double luas() { return 6 * sisi * sisi; }

    double volume() { return sisi * sisi * sisi; }
}

class Balok extends Bangun {
    double p, l, t;

    Balok(double p, double l, double t) {
        this.p = p; this.l = l; this.t = t;
    }

    double luas() { return 2 * (p * l + p * t + l * t); }

    double volume() { return p * l * t; }
}

class Bola extends Bangun {
    double r;

    Bola(double r) { this.r = r; }

    double luas() { return 4 * Math.PI * r * r; }

    double volume() {
        return (4.0/3) * Math.PI * r * r * r;
    }
}

class Tabung extends Bangun {
    double r, t;

    Tabung(double r, double t) {
        this.r = r; this.t = t;
    }

    double luas() {
        return 2 * Math.PI * r * (r + t);
    }

    double volume() {
        return Math.PI * r * r * t;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    menuDatar(input);
                    break;
                case 2:
                    menuRuang(input);
                    break;
            }

        } while (pilih != 3);
    }

    static void menuDatar(Scanner input) {
        System.out.println("\n1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.print("Pilih: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Sisi: ");
                double s = input.nextDouble();
                Persegi p = new Persegi(s);
                System.out.println("Luas: " + p.luas());
                System.out.println("Keliling: " + p.keliling());
                break;

            case 2:
                System.out.print("Panjang: ");
                double pa = input.nextDouble();
                System.out.print("Lebar: ");
                double l = input.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(pa, l);
                System.out.println("Luas: " + pp.luas());
                System.out.println("Keliling: " + pp.keliling());
                break;

            case 3:
                System.out.print("Jari-jari: ");
                double r = input.nextDouble();
                Lingkaran ling = new Lingkaran(r);
                System.out.println("Luas: " + ling.luas());
                System.out.println("Keliling: " + ling.keliling());
                break;

            case 4:
                System.out.print("Sisi atas: ");
                double a = input.nextDouble();
                System.out.print("Sisi bawah: ");
                double b = input.nextDouble();
                System.out.print("Sisi kiri: ");
                double c = input.nextDouble();
                System.out.print("Sisi kanan: ");
                double d = input.nextDouble();
                System.out.print("Tinggi: ");
                double t = input.nextDouble();

                Trapesium tr = new Trapesium(a, b, c, d, t);
                System.out.println("Luas: " + tr.luas());
                System.out.println("Keliling: " + tr.keliling());
                break;
        }
    }

    static void menuRuang(Scanner input) {
        System.out.println("\n1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");
        System.out.print("Pilih: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Sisi: ");
                double s = input.nextDouble();
                Kubus k = new Kubus(s);
                System.out.println("Luas Permukaan: " + k.luas());
                System.out.println("Volume: " + k.volume());
                break;

            case 2:
                System.out.print("Panjang: ");
                double p = input.nextDouble();
                System.out.print("Lebar: ");
                double l = input.nextDouble();
                System.out.print("Tinggi: ");
                double t = input.nextDouble();
                Balok b = new Balok(p, l, t);
                System.out.println("Luas Permukaan: " + b.luas());
                System.out.println("Volume: " + b.volume());
                break;

            case 3:
                System.out.print("Jari-jari: ");
                double r = input.nextDouble();
                Bola bo = new Bola(r);
                System.out.println("Luas Permukaan: " + bo.luas());
                System.out.println("Volume: " + bo.volume());
                break;

            case 4:
                System.out.print("Jari-jari: ");
                double r2 = input.nextDouble();
                System.out.print("Tinggi: ");
                double t2 = input.nextDouble();
                Tabung tb = new Tabung(r2, t2);
                System.out.println("Luas Permukaan: " + tb.luas());
                System.out.println("Volume: " + tb.volume());
                break;
        }
    }
}
