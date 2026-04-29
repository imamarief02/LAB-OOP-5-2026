package soal2;
class SmartLamp extends PerangkatElektronik implements KontrolSuara{

    SmartLamp(String merk, int dayalistrik) {
        super(merk, dayalistrik);
    }

    @Override
    public void ProsesPerintah(String Perintah) {
        if (Perintah.equals("NYALA")){
            System.out.println("Lampu berpijar");
        } else {
            System.out.println("kau ngapain KOCAKK...");
        }
    }

    @Override
    void cekFungsi() {
        System.out.println("Memeriksa sistem pencahayaan...");
    }
}

class CCTV extends PerangkatElektronik implements InteraksiListrik{

    CCTV(String merk, int dayalistrik) {
        super(merk, dayalistrik);
    }

    @Override
    public void HubungkanWifi() {
        System.out.println("Mengirim data ke server...");
    }

    @Override
    void cekFungsi() {
        System.out.println("Cek jaringan internet...");
    }
}

class SmartSpeaker extends PerangkatElektronik implements InteraksiListrik, KontrolSuara{

    SmartSpeaker(String merk, int dayalistrik) {
        super(merk, dayalistrik);
    }

    @Override
    public void HubungkanWifi() {
        System.out.println("speaker kok pke wifi...");
        System.out.println("otakmu error kocak...");
    }

    @Override
    public void ProsesPerintah(String Perintah) {
        System.out.println("Memutar lagu "+ Perintah);
    }

    @Override
    void cekFungsi() {
        System.out.println("The bluetooth is not connect...");
    }
}