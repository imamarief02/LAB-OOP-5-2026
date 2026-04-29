package soal1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Syahdan = new Scanner(System.in);
//        KARYAWAN KONTRAK
        KaryawanKontrak dan = new KaryawanKontrak("rizo", "I345", 500000);
        System.out.print("how much present : ");int absenKK = Syahdan.nextInt();
        for (int i = 0; i < absenKK; i++ ){
            dan.hadir();
        }
        dan.tampilkanInfo();

//        KARYAWAN TETAP
        KaryawanTetap syhdn = new KaryawanTetap("Eriz","H0712", 2000000, 500000);
        System.out.print("how much present : ");int absenKT = Syahdan.nextInt();
        for (int i = 0; i < absenKT; i++ ){
            syhdn.hadir();
        }
        syhdn.tampilkanInfo();

    }
}