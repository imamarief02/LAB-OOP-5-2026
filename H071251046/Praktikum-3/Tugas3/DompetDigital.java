package Tugas3;

class DompetDigital {
    private String pin;
    private double saldo;
    protected int id;
    String nama;

    public DompetDigital (String nama, int id, String pin) {
        this.nama = nama;
        this.id = id;
        this.pin = pin;
        this.saldo = 0;
        System.out.println("Akun berhasil dibuat atas nama " + nama + " dengan ID: " + id);
    }

    public String getIdentitas () {
        return "Nama: " + nama + ", ID: " + id;
    }

    public double getSaldo () {
        return saldo;
    }

    public void ubahPin (String pinLama, String pinBaru) {
        if (this.pin.equals(pinLama) && pinBaru.length() == 6) {
            this.pin = pinBaru;
            System.out.println("PIN berhasil diubah");
            LogTransaksi("Ubah PIN berhasil");
        }
        else {
            System.out.println("PIN lama salah, perubahan PIN gagal");
            LogTransaksi("Ubah PIN gagal");
        }
    }

    private void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor berhasil");
            LogTransaksi("Setor: " + jumlah);
        }
        else {
            System.out.println("Setor gagal, jumlah harus positif");
            LogTransaksi("Setor gagal");
        }
    }

    public void getSetor (double jumlah) {
        setor(jumlah);
    }
    public void tarik (double jumlah, String pin) {
        if (!this.pin.equals(pin)) {
            System.out.println("PIN salah, tarik tunai gagal");
            LogTransaksi("Tarik gagal");
        }
        else if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup, tarik tunai gagal");
            LogTransaksi("Tarik gagal");
        }
        else {
            saldo -= jumlah;
            System.out.println("Tarik tunai sebesar " + jumlah + " berhasil");
            LogTransaksi("Tarik: " + jumlah);
        }
    }

    private void LogTransaksi(String pesan) {
        System.out.println("LOG: " + pesan);
    }
}
