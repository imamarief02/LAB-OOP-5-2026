import java.util.Scanner;

public class TP1_2_H071251070{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("input tanggal (dd-mm-yy): ");
        String tanggal = input.nextLine();

        String[] data = tanggal.split("-");

        int hari = Integer.parseInt(data[0]);
        int bulan = Integer.parseInt(data[1]);
        int tahun = Integer.parseInt(data[2]);

        String bulanString = "";

        switch (bulan){
            case 1:bulanString = "Januari";break;
            case 2:bulanString = "Februari";break;
            case 3:bulanString = "Maret";break;
            case 4:bulanString = "April";break;
            case 5:bulanString = "Mei";break;
            case 6:bulanString = "Juni";break;
            case 7:bulanString= "Juli";break;
            case 8:bulanString = "Agustus";break;
            case 9:bulanString = "September";break;
            case 10:bulanString = "Oktober";break;
            case 11:bulanString = "November";break;
            case 12:bulanString = "Desember";break;
        }
        if (tahun <= 26) {
            tahun += 2000;
        }else{
            tahun += 1900;
        }
        System.out.println(hari + " " + bulanString + " " + tahun);
    }
}