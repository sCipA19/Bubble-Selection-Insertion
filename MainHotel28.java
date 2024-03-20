//package Latihan6;

public class MainHotel28 {
    public static void main(String[] args) {
        HotelService28 hotelService = new HotelService28();

        hotelService.tambah(new Hotel28("Grand Hotel", "Malang", 500000, 5));
        hotelService.tambah(new Hotel28("Pesona Alam", "Batu", 300000, 4));

        hotelService.tampilAll();
    }
}
