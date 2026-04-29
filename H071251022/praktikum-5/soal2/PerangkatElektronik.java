package soal2;

abstract class PerangkatElektronik {
    String merk;
    int dayalistrik;

    PerangkatElektronik(String merk, int dayalistrik){
        this.merk = merk;
        this.dayalistrik = dayalistrik;
    }

    abstract void cekFungsi();

    void infoPower(){
        System.out.println(merk + " sedang menyedot daya sebesar "+ dayalistrik + "Watt");
    }

}
