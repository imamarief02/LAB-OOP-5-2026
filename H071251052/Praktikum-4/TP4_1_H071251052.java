import java.util.Scanner;

class Bangun{
    double hitungLuas(){
        return 0;
    }
}

class BangunRuang extends Bangun{
    double hitungVolume(){
        return 0;
    }
}

class BangunDatar extends Bangun{
    double hitungKeliling(){
        return 0;
    }
}

// Bangun Ruang
class Kubus extends BangunRuang{
    double s;
    Kubus(double s){
        this.s = s;
    }
    double hitungLuas(){
        return 6 * (s * s);
    }
    double hitungVolume(){
        return s * s * s;
    }
}

class Balok extends BangunRuang{
    double p, l, t;
    Balok (double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    double hitungLuas(){
        return 2 * (p*l + p*t + l*t);
    }
    double hitungVolume(){
        return p * l * t;
    }
}

class Kerucut extends BangunRuang{
    double r, t, s;
    Kerucut(double r, double t){
        this.r = r;
        this.t = t;
        this.s = s;
    }
    double hitungLuas(){
        return 3.14 * r * (r + s);
    }
    double hitungVolume(){
        return (1.0/3.0) * 3.14 * (r * r) * t;
    }
}

class Bola extends BangunRuang{
    double r;
    Bola (double r){
        this.r = r;
    }
    double hitungLuas(){
        return 4 * 3.14 * (r * r);
    }
    double hitungVolume(){
        return (4.0/3.0) * 3.14 * (r * r * r);
    }
}

class Tabung extends BangunRuang{
    double r, t;
    Tabung (double r, double t){
        this.r = r;
        this.t = t;
    }
    double hitungLuas(){
        return 2 * 3.14 * r * (r + t);
    }
    double hitungVolume(){
        return 3.14 * (r * r) * t;
    }
}

// Bangun Datar
class Persegi extends BangunDatar{
    double s;
    Persegi (double s){
        this.s = s;
    }
    double hitungLuas(){
        return s * s;
    }
    double hitungKeliling(){
        return 4 * s;
    }
}

class PersegiPanjang extends BangunDatar{
    double p, l;
    PersegiPanjang (double p, double l){
        this.p = p;
        this.l = l;
    }
    double hitungLuas(){
        return p * l;
    }
    double hitungKeliling(){
        return 2 * (p + l);
    }
}

class Segitiga extends BangunDatar{
    double s1, s2, s3, a, t;
    Segitiga (double s1, double s2, double s3, double a, double t){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.a = a;
        this.t = t;
    }
    double hitungLuas(){
        return (1.0/2.0) * a * t;
    }
    double hitungKeliling(){
        return s1 + s2 + s3;
    }
}

class Lingkaran extends BangunDatar{
    double r;
    Lingkaran (double r){
        this.r = r;
    }
    double hitungLuas(){
        return 3.14 * (r * r);
    }
    double hitungKeliling(){
        return 2 * 3.14 * r;
    }
}

class JajarGenjang extends BangunDatar{
    double a, t, sA, sM;
    JajarGenjang (double a, double t, double sA, double sM){
        this.a = a;
        this.t = t;
        this.sA = sA;
        this.sM = sM;
    }
    double hitungLuas(){
        return a * t;
    }
    double hitungKeliling(){
        return 2 * (sA + sM);
    }
}

class Trapesium extends BangunDatar{
    double s1, s2, s3, s4, t;
    Trapesium (double s1, double s2, double s3, double s4, double t){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.t = t;
    }
    double hitungLuas(){
        return 0.5 * (s1 + s2) * t;
    }
    double hitungKeliling(){
        return s1 + s2 + s3 + s4;
    }
}

public class TP4_1_H071251052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== BANGUN DATAR =====");
        System.out.println("1. PERSEGI");
        System.out.println("2. PERSEGI PANJANG");
        System.out.println("3. SEGITIGA");
        System.out.println("4. LINGKARAN");
        System.out.println("5. GANJAR");
        System.out.println("6. TRAPESIUM");
        System.out.println("\n===== BANGUN RUANG =====");
        System.out.println("7. KUDUS");
        System.out.println("8. BALOK");
        System.out.println("9. KERUCUT");
        System.out.println("10. BOLA");
        System.out.println("11. TABUNG");

        System.out.print("\nPILIHAN : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sP = input.nextDouble();
                Persegi p = new Persegi(sP);
                System.out.println("Luas: " + p.hitungLuas());
                System.out.println("Keliling: " + p.hitungKeliling());
                break;
            case 2:
                System.out.print("Masukkan panjang persegi: ");
                double pP = input.nextDouble();
                System.out.print("Masukkan lebar persegi: ");
                double lP = input.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(pP, lP);
                System.out.println("Luas: " + pp.hitungLuas());
                System.out.println("Keliling: " + pp.hitungKeliling());
                break;
            case 3:
                System.out.print("Masukkan panjang sisi 1: ");
                double s1S = input.nextDouble();
                System.out.print("Masukkan panjang sisi 2: ");
                double s2S = input.nextDouble();
                System.out.print("Masukkan panjang sisi 3: ");
                double s3S = input.nextDouble();
                System.out.print("Masukkan panjang alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tS = input.nextDouble();
                Segitiga s = new Segitiga(s1S, s2S, s3S, a, tS);
                System.out.println("Luas: " + s.hitungLuas());
                System.out.println("Keliling: " + s.hitungKeliling());
                break;
            case 4:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double rL = input.nextDouble();
                Lingkaran L = new Lingkaran(rL);
                System.out.println("Luas: " + L.hitungLuas());
                System.out.println("Keliling: " + L.hitungKeliling());
                break;
            case 5:
                System.out.print("Masukkan panjang alas jajar genjang: ");
                double aJ = input.nextDouble();
                System.out.print("Masukkan tinggi jajar genjang: ");
                double tJ = input.nextDouble();
                System.out.print("Masukkan sisi alas jajar genjang: ");
                double sAJ = input.nextDouble();
                System.out.print("Masukkan sisi miring jajar genjang: ");
                double sMJ = input.nextDouble();
                JajarGenjang jg = new JajarGenjang(aJ, tJ, sAJ, sMJ);
                System.out.println("Luas: " + jg.hitungLuas());
                System.out.println("Keliling: " + jg.hitungKeliling());
                break;
            case 6:
                System.out.print("Masukkan sisi 1 trapesium: ");
                double s1T = input.nextDouble();
                System.out.print("Masukkan sisi 2 trapesium: ");
                double s2T = input.nextDouble();
                System.out.print("Masukkan sisi 3 trapesium: ");
                double s3T = input.nextDouble();
                System.out.print("Masukkan sisi 4 trapesium: ");
                double s4T = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double tT = input.nextDouble();
                Trapesium trap = new Trapesium(s1T, s2T, s3T, s4T, tT);
                System.out.println("Luas: " + trap.hitungLuas());
                System.out.println("Keliling: " + trap.hitungKeliling());
                break;
            case 7:
                System.out.print("Masukkan sisi kubus: ");
                double sK = input.nextDouble();
                Kubus k = new Kubus(sK);
                System.out.println("Luas Permukaan: " + k.hitungLuas());
                System.out.println("Volume: " + k.hitungVolume());
                break;
            case 8:
                System.out.print("Masukkan panjang balok: ");
                double pB = input.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lB = input.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tB = input.nextDouble();
                Balok b = new Balok(pB, lB, tB);
                System.out.println("Luas Permukaan: " + b.hitungLuas());
                System.out.println("Volume: " + b.hitungVolume());
                break;
            case 9:
                System.out.print("Masukkan jari-jari kerucut: ");
                double rK = input.nextDouble();
                System.out.print("Masukkan tinggi kerucut: ");
                double tK = input.nextDouble();
                Kerucut kerucut = new Kerucut(rK, tK);
                System.out.println("Luas Permukaan: " + kerucut.hitungLuas());
                System.out.println("Volume: " + kerucut.hitungVolume());
                break;
            case 10:
                System.out.print("Masukkan jari-jari bola: ");
                double rBo = input.nextDouble();
                Bola bola = new Bola(rBo);
                System.out.println("Luas Permukaan: " + bola.hitungLuas());
                System.out.println("Volume: " + bola.hitungVolume());
                break;
            case 11:
                System.out.print("Masukkan jari-jari tabung: ");
                double rTab = input.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tTab = input.nextDouble();
                Tabung tabung = new Tabung(rTab, tTab);
                System.out.println("Luas Permukaan: " + tabung.hitungLuas());
                System.out.println("Volume: " + tabung.hitungVolume());
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
    }
    
}
