package Tugas3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Aplikasi Dompet Digital ===");
        System.out.println("Silahkan buat akun terlebih dahulu");

        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.println("Masukkan ID: ");
        int id = input.nextInt();
        input.nextLine(); // Clear inputan

        System.out.println("Masukkan PIN: ");
        String pin = input.nextLine();

        DompetDigital dompet = new DompetDigital(nama, id, pin);

        int pilihan = -1;

        while (pilihan != 0) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Lihat Identitas");
            System.out.println("2. Ubah PIN");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Tarik Tunai");
            System.out.println("5. Cek Saldo");
            System.out.println("0. Keluar");
            System.out.println("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine(); // Clear inputan

            if (pilihan == 1) {
                System.out.println(dompet.getIdentitas());
            }
            else if (pilihan == 2) {
                System.out.print("Masukkan PIN Lama: ");
                String Lama = input.nextLine();

                System.out.print("Masukkan PIN Baru (6 digit): ");
                String Baru = input.nextLine();

                dompet.ubahPin(Lama, Baru);
            }
            else if (pilihan == 3) {
                System.out.print("Masukkan jumlah yang akan disetor: ");
                double s = input.nextDouble();
                dompet.getSetor(s);
            }
            else if (pilihan == 4) {
                System.out.print("Masukkan jumlah yang akan ditarik: ");
                double t = input.nextDouble();
                input.nextLine(); // Clear inputan

                System.out.print("Masukkan PIN: ");
                String p = input.nextLine();
                dompet.tarik(t, p);
            }
            else if (pilihan == 5) {
                System.out.println("Saldo Anda: "  + dompet.getSaldo());
            }
            else if (pilihan == 0) {
                System.out.println("Terima Kasih");
            }
            else {
                System.out.println("Pilihan tidak valid");
            }

        }
        input.close();
    }
}
