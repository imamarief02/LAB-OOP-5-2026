import java.util.Scanner;

public class TP1_3_H071251070 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        boolean besar = false;
        boolean kecil = false;
        boolean angka = false;

        if (password.length() < 8) {
            System.out.println("Password tidak valid");
            return;
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                besar = true;
            }

            if (c >= 'a' && c <= 'z') {
                kecil = true;
            }

            if (c >= '0' && c <= '9') {
                angka = true;
            }
        }

        if (besar && kecil && angka) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }
    }
}
