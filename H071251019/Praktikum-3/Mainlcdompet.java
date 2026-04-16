public class Mainlcdompet {
    public static void main(String[] args) {
        LCdompetdigital me = new LCdompetdigital("123456", "3650348", "Prioritas");
        LCdompetdigital yu = new LCdompetdigital("654321", "9756421", "Reguler");

        me.setorTunai("999999", 5000000);
        System.out.println("0==================0");
        me.setorTunai("123456", 5000000);


        me.transfer(yu, 300000, "123456");
        
        System.out.println("0==================0");
        System.out.println("ID Nasabah: " + yu.getIdNasabah());
        System.out.println("Saldo: " + yu.getSaldo());
        System.out.println("Status Rekening: " + yu.jenisNasabah);

    }
}
