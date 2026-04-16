public class LCdompetdigital {
    private String pin;
    private int saldo;

    protected String IdNasabah;

    String jenisNasabah;
    String tujuan;
    int nominal;
    int coba = 0;
    boolean isTerblokir = false;

    public LCdompetdigital(String pin, String IdNasabah, String jenisNasabah){
        this.pin = pin;
        this.IdNasabah = IdNasabah;
        this.saldo = 0;
        this.jenisNasabah = jenisNasabah;
    }

    public String getIdNasabah(){
        return IdNasabah;
    }

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int nominal){
       this.saldo = nominal;
    }

    private void logTransaksi(String pesan){ //internal method
        System.out.println("Log: " + pesan);
    }
    
    public void ubahPin(String pinlama, String pinbaru){
        if(!this.pin.equals(pinlama)){
            System.out.println("Pin salah");
        } else if (pinlama.equals(pinbaru)){
            System.out.println("Pin salah");
        }else if (pinbaru.length() != 6){
            System.out.println("Pin harus 6 karakter");
        } else{
            this.pin = pinbaru;
            System.out.println("Pin berhasil diubah");
        }
        System.out.println("0============0");
    }

    public void setorTunai(String pinInputan, int jumlah){
        if (!this.pin.equals(pinInputan)){
           handleSalahPin();
        } else if (this.pin == pinInputan && jumlah <= 0){
            System.out.println("gk ada uang minus kawan, kec u dukun dan pakai uang gaib");
            logTransaksi("Setor gagal");
        }else{
            saldo += jumlah;
            System.out.println("Setor berhasil: " + jumlah);
            logTransaksi("Setor berhasil");
        }
        System.out.println("0============0");
    }

    public void tarikTunai(String pinInputan, int jumlah){
        if(!this.pin.equals(pinInputan)){
            handleSalahPin();
        } else if (this.pin == pinInputan && jumlah <= 0){
            System.out.println("gk ada uang minus kawan, kec u dukun dan pakai uang gaib");
            logTransaksi("Tarik gagal - Saldo minus");
        } else if (jumlah > saldo){
            System.out.println("Saldo tidak cukup");
            logTransaksi("Tarik gagal - Saldo tidak cukup");
        }else{
            saldo -= jumlah;
            System.out.println("Tarik berhasil: " + jumlah);
            logTransaksi("Tarik berhasil");
            this.coba = 0;
        }
        System.out.println("0============0");
    }

    public void transfer(LCdompetdigital tujuan, int nominal, String pinInputan){
        if(!this.pin.equals(pinInputan)){
            handleSalahPin();
            } else if(this.pin.equals(pin) && nominal > saldo){
             System.out.println("Saldo kurang");
         } else{
             this.saldo -= nominal;
             System.out.println("Transfer berhasil");
             this.coba = 0;
            tujuan.setSaldo(nominal);
             logTransaksi("transfer: "+ tujuan.IdNasabah +" nominal: " + nominal);
            }
    }
    
    private void handleSalahPin() {
        this.coba++;
        System.out.println("Gagal: PIN salah! (Percobaan: " + coba + ")");
        if (this.coba >= 3) {
            this.isTerblokir = true;
            System.out.println("PERINGATAN: Akun telah terblokir karena salah PIN 3x.");
        }
    }

} //akhir

