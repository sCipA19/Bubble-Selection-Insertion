//package Latihan6;

public class HotelService28 {
    private Hotel28[] hotels;
    private int idx;

    public HotelService28() {
        this.hotels = new Hotel28[10];
        idx = 0;
    }

    public void tambah(Hotel28 hotel) {
        if (idx < hotels.length) {
            hotels[idx] = hotel;
            idx++;
            System.out.println("Hotel berhasil ditambahkan!");
        } else {
            System.out.println("Hotel penuh");
        }
    }

    public void tampilAll() {
        System.out.println("+----------------------+------------+------------+---------+");
        System.out.println("| Nama Hotel           | Kota       | Harga (Rp) | Bintang |");
        System.out.println("+----------------------+------------+------------+---------+");
        for (Hotel28 h : hotels) {
            if (h != null) {
                h.printAsTableRow();
            }
        }
        System.out.println("+----------------------+------------+------------+---------+");
    }
}

