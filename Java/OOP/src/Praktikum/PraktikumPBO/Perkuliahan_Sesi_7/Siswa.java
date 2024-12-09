package Praktikum.PraktikumPBO.Perkuliahan_Sesi_7;

public class Siswa {
    private String nama;
    private int nilaiUjian;

    // Constructor
    public Siswa(String nama, int nilaiUjian) {
        this.nama = nama;
        setNilaiUjian(nilaiUjian); // Gunakan setter untuk validasi
    }

    // Getter for nama
    public String getNama() {
        return nama;
    }

    // Setter for nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter for nilaiUjian
    public int getNilaiUjian() {
        return nilaiUjian;
    }

    // Setter for nilaiUjian
    public void setNilaiUjian(int nilaiUjian) {
        // Validate nilai (0-100)
        if (nilaiUjian >= 0 && nilaiUjian <= 100) {
            this.nilaiUjian = nilaiUjian;
        } else {
            System.out.println("Nilai harus antara 0 dan 100.");
        }
    }

    // Method to display student information
    public void tampilkanInfo() {
        System.out.println("Nama Siswa: " + nama);
        System.out.println("Nilai Ujian: " + nilaiUjian);
    }
}

// Main class to run the program
class SiswaTester {
    public static void main(String[] args) {
        // Membuat objek Siswa
        Siswa siswa1 = new Siswa("Andi", 85);
        siswa1.tampilkanInfo();

        // Gunakan setter untuk mengubah nama dan nilai ujian
        siswa1.setNama("Budi");
        siswa1.setNilaiUjian(95);

        // Menampilkan informasi yang diperbarui
        System.out.println("\nSetelah Diubah:");
        siswa1.tampilkanInfo();

        // Uji validasi dengan memasukkan nilai yang tidak valid
        siswa1.setNilaiUjian(105); // Output: Nilai harus antara 0 dan 100.
    }
}
