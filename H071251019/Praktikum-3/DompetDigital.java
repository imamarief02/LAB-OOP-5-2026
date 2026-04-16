public class DompetDigital {
    private String pin;
    private int saldo;

    protected String IdNasabah;

    String jenisNasabah;

    public DompetDigital(String pin, String IdNasabah, String jenisNasabah){
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
        if (!this.pin.equals(pinInputan) && jumlah <= 0){
            System.out.println("Pin salah");
            logTransaksi("Setor gagal");
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
            System.out.println("Pin salah");
            logTransaksi("Tarik gagal - pin salah");
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
        }
        System.out.println("0============0");
    }

} //akhir
