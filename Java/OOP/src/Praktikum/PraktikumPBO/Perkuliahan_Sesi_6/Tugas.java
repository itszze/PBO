package Praktikum.PraktikumPBO.Perkuliahan_Sesi_6;

// Kelas utama
public class Tugas {
    public static void main(String[] args) {
        // Membuat objek berdasarkan class Produk
        Produk produk1 = new Produk("Tote Bag", 120000, true);
        Produk produk2 = new Produk("Jaket Denim", 250000, false);

        // Menampilkan informasi produk
        produk1.tampilkanInfo();
        produk2.tampilkanInfo();
    }
}

// Kelas Produk
class Produk {
    // Atribut
    private String nama;
    private int harga;
    private boolean stokTersedia;

    // Konstruktor
    public Produk(String nama, int harga, boolean stokTersedia) {
        this.nama = nama;
        this.harga = harga;
        this.stokTersedia = stokTersedia;
    }

    // Method untuk menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Stok Tersedia: " + (stokTersedia ? "Ya" : "Tidak"));
        System.out.println("---------------------------");
    }
}
