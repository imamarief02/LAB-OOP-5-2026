package Elektronik;
import java.util.ArrayList;
import java.util.Scanner;

class Produk {
    String merek;
    String nomorSeri;
    double harga;

    Produk(String merek, String nomorSeri, double harga) {
        this.merek = merek;
        this.nomorSeri = nomorSeri;
        this.harga = harga;
    }

    void tampilkan() {
        System.out.println("Merek: " + merek);
        System.out.println("No Seri: " + nomorSeri);
        System.out.println("Harga: " + harga);
    }
}

class Smartphone extends Produk {
    double layar;
    int storage;

    Smartphone(String merek, String nomorSeri, double harga, double layar, int storage) {
        super(merek, nomorSeri, harga);
        this.layar = layar;
        this.storage = storage;
    }

    void tampilkan() {
        super.tampilkan();
        System.out.println("Ukuran Layar: " + layar + " inch");
        System.out.println("Storage: " + storage + " GB");
    }
}

class Laptop extends Produk {
    int ram;
    String processor;

    Laptop(String merek, String nomorSeri, double harga, int ram, String processor) {
        super(merek, nomorSeri, harga);
        this.ram = ram;
        this.processor = processor;
    }

    void tampilkan() {
        super.tampilkan();
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Tipe Processor: " + processor);
    }
}

class Kamera extends Produk {
    int resolusi;
    String tipeLensa;

    Kamera(String merek, String nomorSeri, double harga, int resolusi, String tipeLensa) {
        super(merek, nomorSeri, harga);
        this.resolusi = resolusi;
        this.tipeLensa = tipeLensa;
    }

    void tampilkan() {
        super.tampilkan();
        System.out.println("Resolusi: " + resolusi + " MP");
        System.out.println("Tipe Lensa: " + tipeLensa);
    }
}

public class Main {
    static ArrayList<Produk> list = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;

        do {
            System.out.println("\n1. Tambah Produk");
            System.out.println("2. Tampilkan Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    tambahProduk();
                    break;
                case 2:
                    tampilkanProduk();
                    break;
                case 3:
                    beliProduk();
                    break;
            }

        } while (pilih != 4);
    }

    static void tambahProduk() {
    System.out.print("Merek: ");
    String merek = input.nextLine();

    System.out.print("No Seri: ");
    String seri = input.nextLine();

    System.out.print("Harga: ");
    double harga = input.nextDouble();
    input.nextLine();

    System.out.println("Pilih jenis produk:");
    System.out.println("1. Smartphone");
    System.out.println("2. Laptop");
    System.out.println("3. Kamera");
    System.out.print("Pilih: ");
    int jenis = input.nextInt();
    input.nextLine();

    if (jenis == 1) {
        System.out.print("Ukuran Layar: ");
        double layar = input.nextDouble();
        input.nextLine();

        System.out.print("Storage: ");
        int storage = input.nextInt();
        input.nextLine();

        list.add(new Smartphone(merek, seri, harga, layar, storage));

    } else if (jenis == 2) {
        System.out.print("RAM (GB): ");
        int ram = input.nextInt();
        input.nextLine();

        System.out.print("Tipe Processor: ");
        String processor = input.nextLine();

        list.add(new Laptop(merek, seri, harga, ram, processor));

    } else if (jenis == 3) {
        System.out.print("Resolusi (MP): ");
        int resolusi = input.nextInt();
        input.nextLine();

        System.out.print("Tipe Lensa: ");
        String tipeLensa = input.nextLine();

        list.add(new Kamera(merek, seri, harga, resolusi, tipeLensa));
    }

    System.out.println("Produk berhasil ditambahkan!");
}

    static void tampilkanProduk() {
        for (Produk p : list) {
            p.tampilkan();
            System.out.println("----------------");
        }
    }

    static void beliProduk() {
        System.out.print("Masukkan No Seri: ");
        String cari = input.nextLine();

        boolean ditemukan = false;

        for (Produk p : list) {
            if (p.nomorSeri.equals(cari)) {
                p.tampilkan();
                System.out.println("Pembelian berhasil!");
                ditemukan = true;
                list.remove(p);
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Produk tidak ditemukan!");
        }
    }
}
