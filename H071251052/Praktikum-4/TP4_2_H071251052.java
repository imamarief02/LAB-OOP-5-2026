import java.util.Scanner;

class Produk {
    String merek;
    int nomorSeri;
    double harga;

    Produk(String merek, int nomorSeri, double harga) {
        this.merek = merek;
        this.nomorSeri = nomorSeri;
        this.harga = harga;
    }

    void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Nomor Seri: " + nomorSeri);
        System.out.println("Harga: " + harga);
    }
}

// Subclass Smartphone
class Smartphone extends Produk {
    double ukuranLayar;
    int kapasitasPenyimpanan;

    Smartphone(String merek, int nomorSeri, double harga, double layar, int memori) {
        super(merek, nomorSeri, harga);
        this.ukuranLayar = layar;
        this.kapasitasPenyimpanan = memori;
    }

    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
        System.out.println("Kapasitas Penyimpanan: " + kapasitasPenyimpanan + "GB");
    }
}

// Subclass Laptop
class Laptop extends Produk {
    int ukuranRam;
    String tipeProsesor;

    Laptop(String merek, int nomorSeri, double harga, int ram, String prosesor) {
        super(merek, nomorSeri, harga);
        this.ukuranRam = ram;
        this.tipeProsesor = prosesor;
    }

    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tipe Prosesor: " + tipeProsesor);
        System.out.println("Ukuran RAM: " + ukuranRam + "GB");
    }
}

// Subclass Kamera
class Kamera extends Produk {
    int resolusi;
    String tipeLensa;

    Kamera(String merek, int nomorSeri, double harga, int res, String lensa) {
        super(merek, nomorSeri, harga);
        this.resolusi = res;
        this.tipeLensa = lensa;
    }

    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Resolusi: " + resolusi + "MP");
        System.out.println("Tipe Lensa: " + tipeLensa);
    }
}

public class TP4_2_H071251052 {
    public static void main(String[] args) {
        Produk[] daftarStok = new Produk[100];
        int jumlahProduk = 0;
        
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print("\nPilih menu (1-4): ");
            menu = input.nextInt();
            input.nextLine(); 
            System.out.println();

            switch (menu) {
                case 1:
                    if (jumlahProduk >= 100) {
                        System.out.println("Maaf, gudang penuh!");
                        break;
                    }
                    System.out.print("Masukkan nama produk: ");
                    String mrk = input.nextLine();
                    System.out.print("Masukkan nomor seri: ");
                    int ns = input.nextInt();
                    System.out.print("Masukkan harga: ");
                    double hrg = input.nextDouble();
                    System.out.println("\nTipe produk: ");
                    System.out.println("1. Smartphone");
                    System.out.println("2. Laptop");
                    System.out.println("3. Kamera");

                    System.out.print("Pilih tipe produk (1-3): ");
                    int tipe = input.nextInt();
                    
                    if (tipe == 1) {
                        System.out.print("Masukkan ukuran layar (inci): ");
                        double layar = input.nextDouble();
                        System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                        int memori = input.nextInt();
                        daftarStok[jumlahProduk] = new Smartphone(mrk, ns, hrg, layar, memori);
                    } else if (tipe == 2) {
                        System.out.print("Masukkan ukuran RAM (GB): ");
                        int ram = input.nextInt();
                        input.nextLine();
                        System.out.print("Masukkan tipe prosesor: ");
                        String proc = input.nextLine();
                        daftarStok[jumlahProduk] = new Laptop(mrk, ns, hrg, ram, proc);
                    } else if (tipe == 3) {
                        System.out.print("Masukkan resolusi (MP): ");
                        int res = input.nextInt();
                        input.nextLine();
                        System.out.print("Masukkan tipe lensa: ");
                        String lensa = input.nextLine();
                        daftarStok[jumlahProduk] = new Kamera(mrk, ns, hrg, res, lensa);
                    }
                    jumlahProduk++;
                    break;

                case 2:
                    System.out.println("\n===== Daftar Produk =====");
                    System.out.println();
                    for (int i = 0; i < jumlahProduk; i++) {
                        daftarStok[i].tampilkanInfo();
                        System.out.println("--------------------");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                    int cariSN = input.nextInt();
                    int indeksDitemukan = -1;

                    for (int i = 0; i < jumlahProduk; i++) {
                        if (daftarStok[i].nomorSeri == cariSN) {
                            indeksDitemukan = i;
                            break;
                        }
                    }

                    if (indeksDitemukan != -1) {
                        System.out.println("Anda membeli: ");
                        daftarStok[indeksDitemukan].tampilkanInfo();

                        for (int i = indeksDitemukan; i < jumlahProduk - 1; i++) {
                            daftarStok[i] = daftarStok[i + 1];
                        }
                        daftarStok[jumlahProduk - 1] = null;
                        jumlahProduk--;
                    } else {
                        System.out.println("Produknya gaada bjir");
                    }
                    break;

                case 4:
                    System.out.println("SIPPPPPPPPP");
                    break;
            }
        } while (menu != 4);
    }
}