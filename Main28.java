import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi28 daftar = new DaftarMahasiswaBerprestasi28();
        daftar.tambah(new Mahasiswa28("Nusa", 2017, 25, 3));
        daftar.tambah(new Mahasiswa28("Rara", 2012, 19, 4));
        daftar.tambah(new Mahasiswa28("Dompu", 2018, 19, 3.5));
        daftar.tambah(new Mahasiswa28("Abdul", 2017, 23, 2));
        daftar.tambah(new Mahasiswa28("Ummi", 2019, 21, 3.75));

        System.out.println("Data mahasiswa sebelum sorting:");
        daftar.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan IPK:");
        daftar.bubbleSort();
        daftar.tampil();
    }
}

class Mahasiswa28 {
    String nama;
    int tahunMasuk;
    int umur;
    double ipk;

    Mahasiswa28(String nama, int tahunMasuk, int umur, double ipk) {
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.umur = umur;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk);
        System.out.println("--------------------");
    }
}

class DaftarMahasiswaBerprestasi28 {
    Mahasiswa28 listMhs[] = new Mahasiswa28[5];
    int idx;

    // Method tambah untuk menambahkan mahasiswa ke dalam array
    void tambah(Mahasiswa28 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    // Method tampil untuk menampilkan daftar mahasiswa
    void tampil() {
        for (Mahasiswa28 m : listMhs) {
            if (m != null) {
                m.tampil();
            }
        }
    }

    // Method bubbleSort untuk mengurutkan mahasiswa berdasarkan IPK secara descending
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j] != null && listMhs[j - 1] != null) {
                    if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                        // Proses swap atau penukaran
                        Mahasiswa28 tmp = listMhs[j];
                        listMhs[j] = listMhs[j - 1];
                        listMhs[j - 1] = tmp;
                    }
                }
            }
        }
    }
}
