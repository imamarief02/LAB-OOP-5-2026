import java.util.Scanner;

public class TP103 {
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.print("Masukkan password: ");
    String password = a.nextLine();

    boolean besar = false, kecil = false, ada_angka = false;

        if (password.length() >= 8){
            for (int i = 0; i < password.length(); i++) {
                char cek = password.charAt(i);

                if (cek >= 'A' && cek <= 'Z'){
                    besar = true;
                }else if (cek >= 'a' && cek <= 'z'){
                    kecil = true;
                }else if (cek >= '0' && cek <= '9'){
                    ada_angka = true;}
            }

            if (besar && kecil && ada_angka){
                    System.out.println("Password benar");
                }else{
                System.out.println("Password salah");}

        } else{
            System.out.println("Password salah");}
        
        a.close();
    }
}
