import java.util.Scanner; 

public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Masukkan password: ");
        String p = input.nextLine();

        boolean besar = false, kecil = false, angka = false;

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
//0=A, 1=b, 3=1
            if (Character.isUpperCase(c)) besar = true;
            if (Character.isLowerCase(c)) kecil = true;
            if (Character.isDigit(c)) angka = true;
        }

        if (p.length() >= 8 && besar && kecil && angka) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }
    }
}