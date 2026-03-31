import java.util.Scanner;

public class TP101 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("Masukkan judul Film: ");
        String kalimat = a.nextLine();

        String[] judul = kalimat.split(" ");
        String judulbaru = "";

        for (int i = 0; i < judul.length; i++){
            String kata = judul[i];
            judulbaru += Character.toUpperCase(kata.charAt(0)) + kata.substring(1).toLowerCase() + " ";}

            System.out.println("Judul yang benar: " + judulbaru);
            
        a.close();
    }
}
