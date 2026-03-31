import java.util.Scanner;

public class TP1_4_H071251070 {

    
    public static int faktorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * faktorial(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int x = input.nextInt();

        int hasil = faktorial(x);

        System.out.println("Hasil: " + hasil);
    }
}
