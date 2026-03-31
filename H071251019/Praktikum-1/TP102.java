import java.util.Scanner;

public class TP102 {
    public static String namabulan(int month) {
    String [] bulan = {
        "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

    if (month < 1 || month > 12){
       return("Bulan tidak Valid");
    } else{
        return bulan[month-1];}
    };

    public static int tahun(int year){
    if (year <= 26){
        return year += 2000;
    } else{
       return year += 1900;}
    };

    // public static String hari(int day){
    // if (day > 31){
    //     return("Tanggal tidak Valid");
    // } else {
    //     return hari(day);}
    // }
        
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan tanggal: ");
        String input = a.nextLine();

        String[] date = input.split("-");

        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);

        String Bulan = namabulan(month);
        int Tahun = tahun(year);

        if (month == 2 && day > 28 || day > 31) {
            System.out.println("Tidak valid");
        } else {
            System.out.println(day + " " + Bulan + " " + Tahun);}

        a.close();
    }
}
    
