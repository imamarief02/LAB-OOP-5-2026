package soal2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainaTokoElektronik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Product> daftarStok = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");
            int menu = input.nextInt();
            input.nextLine(); 

            if (menu == 1) { // Tambah Produk
                System.out.print("Masukkan nama produk: ");
                String brand = input.nextLine();
                System.out.print("Masukkan nomor seri: ");
                int sn = input.nextInt();
                System.out.print("Masukkan harga: ");
                double harga = input.nextDouble();
                
                System.out.println("Pilih tipe produk:\n1. Smartphone\n2. Laptop\n3. Camera");
                int tipe = input.nextInt();

                if (tipe == 1) {
                    System.out.print("Masukkan ukuran layar: ");
                    double size = input.nextDouble();
                    System.out.print("Masukkan kapasitas: ");
                    int cap = input.nextInt();
                    daftarStok.add(new Smartphone(brand, sn, harga, size, cap));
                } else if (tipe == 2) {
                    System.out.print("Masukkan RAM: ");
                    int ram = input.nextInt(); input.nextLine();
                    System.out.print("Masukkan Prosesor: ");
                    String proc = input.nextLine();
                    daftarStok.add(new Laptop(brand, sn, harga, ram, proc));
                } else if (tipe == 3) {
                    System.out.print("Masukkan Resolusi: ");
                    int res = input.nextInt(); input.nextLine();
                    System.out.print("Masukkan Lensa: ");
                    String lens = input.nextLine();
                    daftarStok.add(new Camera(brand, sn, harga, res, lens));
                }

            } else if (menu == 2) { // Tampilkan Produk
                System.out.println("\nDaftar Produk:");
                for (Product p : daftarStok) {
                    // Karena tidak pakai override, kita cek tipe objeknya
                    if (p instanceof Smartphone) {
                        ((Smartphone) p).tampilkanSmartphone();
                    } else if (p instanceof Laptop) {
                        ((Laptop) p).tampilkanLaptop();
                    } else if (p instanceof Camera) {
                        ((Camera) p).tampilkanCamera();
                    }
                    System.out.println("-------------------");
                }

            } else if (menu == 3) { // Beli Produk
                System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                int cari = input.nextInt();
                boolean ketemu = false;
                for (int i = 0; i < daftarStok.size(); i++) {
                    if (daftarStok.get(i).seriesNumber == cari) {
                        System.out.println("Anda telah membeli produk:");
                        Product p = daftarStok.get(i);
                        if (p instanceof Smartphone) ((Smartphone) p).tampilkanSmartphone();
                        else if (p instanceof Laptop) ((Laptop) p).tampilkanLaptop();
                        else if (p instanceof Camera) ((Camera) p).tampilkanCamera();
                        
                        daftarStok.remove(i);
                        ketemu = true;
                        break;
                    }
                }
                if (!ketemu) System.out.println("Produk tidak ditemukan.");

            } else if (menu == 4) { // Keluar
                System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                running = false;
            }
        }
    }
    
}
