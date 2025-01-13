package Praktikum.PraktikumPBO.Perkuliahan_Sesi_12;

// Class Dosen (Super Class)
class Dosen {
    private String nik;
    private String nama;

    // Constructor
    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    // Getter untuk NIK
    public String getNik() {
        return nik;
    }

    // Getter untuk Nama
    public String getNama() {
        return nama;
    }
}

// Class Rektor (Subclass dari Dosen)
class Rektor extends Dosen {
    private int tahunMasuk;

    // Constructor
    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama); // Memanggil constructor dari superclass (Dosen)
        this.tahunMasuk = tahunMasuk;
    }

    // Method untuk menampilkan informasi Rektor
    public void viewRektor() {
        System.out.println("Data Rektor:");
        System.out.println("NIK: " + getNik());
        System.out.println("Nama: " + getNama());
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}

// Class Dekan (Subclass dari Dosen)
class Dekan extends Dosen {
    private String fakultas;

    // Constructor
    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama); // Memanggil constructor dari superclass (Dosen)
        this.fakultas = fakultas;
    }

    // Method untuk menampilkan informasi Dekan
    public void viewDekan() {
        System.out.println("Data Dekan:");
        System.out.println("NIK: " + getNik());
        System.out.println("Nama: " + getNama());
        System.out.println("Fakultas: " + fakultas);
    }
}

// Main Class untuk menjalankan program
public class soal2 {
    public static void main(String[] args) {
        // Data ditentukan langsung
        Rektor rektor = new Rektor("101204", "Dr. fad", 2015);
        Dekan dekan = new Dekan("060505", "Prof. jeje", "Fakultas Teknik Informatika");

        // Menampilkan data Rektor
        rektor.viewRektor();
        System.out.println();

        // Menampilkan data Dekan
        dekan.viewDekan();
    }
}
