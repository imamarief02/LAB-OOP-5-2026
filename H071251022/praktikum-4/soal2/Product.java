package soal2;

public class Product {
    protected String brand;
    protected int seriesNumber;
    protected double price;

    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    // Nama metode dibuat umum
    public void cetakDataProduk() {
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + seriesNumber);
        System.out.println("Price: $" + price);
    }
    
}
