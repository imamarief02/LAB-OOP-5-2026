package Shome;

abstract class PerangkatElektronik {
    protected String merk;
    protected int dayaListrik;

    public PerangkatElektronik(String merk, int dayaListrik) {
        this.merk = merk;
        this.dayaListrik = dayaListrik;
    }

    public abstract void cekFungsi();

    public void infoPower() {
        System.out.println("Menggunakan daya " + dayaListrik + " Watt");
    }
}

interface InteraksiInternet {
    void hubungkanWiFi();
}

interface KontrolSuara {
    void prosesPerintah(String perintah);
}

class SmartLamp extends PerangkatElektronik implements KontrolSuara {

    public SmartLamp(String merk, int daya) {
        super(merk, daya);
    }

    @Override
    public void cekFungsi() {
        System.out.println("Lampu pintar siap digunakan");
    }

    @Override
    public void prosesPerintah(String perintah) {
        if (perintah.equalsIgnoreCase("NYALA")) {
            System.out.println("Lampu berpijar!");
        }
        else {
            System.out.println("input tidak valid");
        }
    }
}

class SmartCCTV extends PerangkatElektronik implements InteraksiInternet {

    public SmartCCTV(String merk, int daya) {
        super(merk, daya);
    }

    @Override
    public void cekFungsi() {
        System.out.println("CCTV aktif");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println("Mengirim data ke server...");
    }
}

class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, KontrolSuara {

    public SmartSpeaker(String merk, int daya) {
        super(merk, daya);
    }

    @Override
    public void cekFungsi() {
        System.out.println("Speaker siap digunakan");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println("Terhubung ke WiFi");
    }

    @Override
    public void prosesPerintah(String perintah) {
        System.out.println("Memproses perintah: " + perintah);
    }
}

public class Main {
    public static void main(String[] args) {

        SmartLamp lamp = new SmartLamp("Philips", 10);
        lamp.cekFungsi();
        lamp.prosesPerintah("NYALA");
        lamp.infoPower();

        System.out.println();

        SmartCCTV cctv = new SmartCCTV("Xiaomi", 20);
        cctv.cekFungsi();
        cctv.hubungkanWiFi();
        cctv.infoPower();

        System.out.println();

        SmartSpeaker speaker = new SmartSpeaker("Google", 15);
        speaker.cekFungsi();
        speaker.hubungkanWiFi();
        speaker.prosesPerintah("Putar musik");
        speaker.infoPower();
    }
}
