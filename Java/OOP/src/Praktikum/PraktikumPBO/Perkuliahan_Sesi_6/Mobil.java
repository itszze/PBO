package Praktikum.PraktikumPBO.Perkuliahan_Sesi_6;

public class Mobil {
    // Atribut
    String aktifitas;
    String warna;
    int kecepatan;

    // Konstruktor
    public Mobil(String aktifitas, String warna, int kecepatan) {
        this.aktifitas = aktifitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    // Method untuk mengecek kecepatan
    void cekKecepatan() {
        if (kecepatan == 0) {
            aktifitas = "parkir";
        } else if (kecepatan > 0 && kecepatan <= 40) {
            aktifitas = "berjalan lambat";
        } else if (kecepatan > 40) {
            aktifitas = "berjalan cepat";
        }
    }

    // Method untuk mencetak atribut
    void cetakAtribut() {
        System.out.println("Aktifitas = " + aktifitas);
        System.out.println("Warna = " + warna);
        System.out.println("Kecepatan = " + kecepatan);
        System.out.println("---------------------------");
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek dari class Mobil
        Mobil mobil1 = new Mobil("berjalan", "Merah", 0);
        Mobil mobil2 = new Mobil("berjalan", "Biru", 30);
        Mobil mobil3 = new Mobil("berjalan", "Hitam", 60);

        // Mengecek kecepatan setiap mobil
        mobil1.cekKecepatan();
        mobil2.cekKecepatan();
        mobil3.cekKecepatan();

        // Mencetak atribut setiap mobil
        mobil1.cetakAtribut();
        mobil2.cetakAtribut();
        mobil3.cetakAtribut();
    }
}
