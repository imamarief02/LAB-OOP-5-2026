package soal2;

public class Laptop extends Product {
    private int ramSize;
    private String processorType;

    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public void tampilkanLaptop() {
        cetakDataProduk(); // Memanggil metode dari induk
        System.out.println("Processor Type: " + processorType);
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}