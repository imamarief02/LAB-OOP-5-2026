public class MainDompet {
    public static void main(String[] args) {
        DompetDigital dompet = new DompetDigital("123456", "3650348","Reguler");
        System.out.println("ID Nasabah: " + dompet.getIdNasabah());
        System.out.println("Saldo: " + dompet.getSaldo());
        System.out.println("Status Rekening: " + dompet.jenisNasabah);
        System.out.println("0============0");

        dompet.ubahPin("123456", "123456");
        dompet.ubahPin("123456", "234675");
       
        dompet.setorTunai("234675", 5000000);
        dompet.setorTunai("234675",-30000);
       
        dompet.tarikTunai("123456", 300000);
        dompet.tarikTunai("234675", 300000); 
       
        System.out.println("ID Nasabah: " + dompet.getIdNasabah());
        System.out.println("Saldo: " + dompet.getSaldo());
        System.out.println("Status Rekening: " + dompet.jenisNasabah);

    }
} //akhir
