public class DaftarMahasiswaBerprestasi28 {
    Mahasiswa28 listMhs[] = new Mahasiswa28[5];
    int idx;

    void tambah(Mahasiswa28 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Mahasiswa28 m : listMhs) {
            m.tampil();
            System.out.println("---------------------------------------");
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            // Melakukan sorting secara ascending
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            // Proses swap
            Mahasiswa28 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi28 dmb = new DaftarMahasiswaBerprestasi28();
        dmb.tambah(new Mahasiswa28("A", 3.5));
        dmb.tambah(new Mahasiswa28("B", 3.8));
        dmb.tambah(new Mahasiswa28("C", 3.7));
        dmb.tambah(new Mahasiswa28("D", 4.0));
        dmb.tambah(new Mahasiswa28("E", 3.9));

        dmb.tampil();

        dmb.selectionSort();

        System.out.println("Data setelah diurutkan: ");
        dmb.tampil();
    }
}

class Mahasiswa28 {
    String nama;
    double ipk;

    Mahasiswa28(String nama, double ipk) {
        this.nama = nama;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("IPK: " + ipk);
    }
}