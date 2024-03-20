//package Latihan6;

public class Hotel28 {
    private String nama;
    private String kota;
    private double harga;
    private int bintang;

    public Hotel28(String nama, String kota, double harga, int bintang) {
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }

    public String getNama() {
        return nama;
    }

    public String getKota() {
        return kota;
    }

    public double getHarga() {
        return harga;
    }

    public int getBintang() {
        return bintang;
    }

    public void printAsTableRow() {
        System.out.printf("| %-25s | %-12s | %10.2f | %5d |\n", 
                nama, kota, harga, bintang);
    }
}

