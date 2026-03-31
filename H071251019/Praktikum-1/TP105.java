import java.util.Scanner;

public class TP105 {
    public static void main(String[] args) {
        int[][] nums = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        try{
            Scanner a = new Scanner(System.in);
            System.out.print("Masukkan angka yang ingin dicari: ");
            int dicari = a.nextInt();
            boolean ketemu = false;
            for (int baris = 0; baris < nums.length; baris++){
                for (int kolom = 0; kolom < nums[baris].length; kolom ++){
                    if (dicari == nums[baris][kolom]){
                        System.out.println("Found " + dicari +  " at [" + baris + "][" + kolom + "]");
                        ketemu = true;}
                } if (ketemu) {
                    break;} // tdk ada else disini krn dia di dalam loop, jadi dia Setiap kali belum ketemu langsung print banyak
            } 
            if (!ketemu){ 
                System.out.println("Angka tidak ditemukan!"); //jadi ini pengganti else, biar setelah di cek kalau tidk ketemu cmn print skali
            }
            a.close();
        } catch (Exception e){
            System.out.println("ERRORNYAINI YA: " + e.toString());
            System.out.println("Singkatnya inputannya salah kk, harusnya angka");
        } finally {
            System.out.println("SELESAIII");
        }
    }
}
