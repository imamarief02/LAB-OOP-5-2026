import java.util.Scanner;

public class TP104 {
    public static int faktorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        return n * faktorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = a.nextInt();
        
        System.out.println("Hasil Faktorial: " + faktorial(angka));
        
        a.close();
    }
}

