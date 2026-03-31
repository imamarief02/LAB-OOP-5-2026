import java.util.Scanner;

public class TP1_1_H071251070{

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input kalimat: ");
        String kalimat = input.nextLine();

        String[] kata = kalimat.split(" ");
        String hasil = "";

        for (int i = 0; i < kata.length; i++) {
            String k = kata[i];

            String hurufAwal = k.substring(0,1).toUpperCase();
            String sisa = k.substring(1).toLowerCase();

            hasil += hurufAwal + sisa + " " ;
          

          }
        input.close();

    System.out.println("Hasil ubah: " + hasil);
  }
}