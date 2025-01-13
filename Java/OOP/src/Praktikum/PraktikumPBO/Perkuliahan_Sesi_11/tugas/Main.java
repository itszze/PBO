package Praktikum.PraktikumPBO.Perkuliahan_Sesi_11.tugas;


// Abstract Class Kendaraan
abstract class Kendaraan {
    protected String nama;
    protected int kecepatanMaksimal;

    public Kendaraan(String nama, int kecepatanMaksimal) {
        this.nama = nama;
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    public void info() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan Maksimal: " + kecepatanMaksimal + " km/jam");
    }

    // Metode abstrak yang harus diimplementasikan oleh subclass
    public abstract void jenisKendaraan();
}

// Interface Perawatan
interface Perawatan {
    void jadwalServis();
}

// Class Mobil (Inheritance + Interface)
class Mobil extends Kendaraan implements Perawatan {
    private int jumlahPintu;

    public Mobil(String nama, int kecepatanMaksimal, int jumlahPintu) {
        super(nama, kecepatanMaksimal);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void jenisKendaraan() {
        System.out.println("Ini adalah jenis kendaraan: Mobil");
    }

    @Override
    public void jadwalServis() {
        System.out.println("Jadwal servis mobil setiap 6 bulan sekali.");
    }

    public final void fiturKeamanan() {
        System.out.println("Fitur keamanan: Airbag, ABS, dan Sensor Parkir.");
    }
}

// Class Motor (Inheritance + Interface)
class Motor extends Kendaraan implements Perawatan {
    private String jenisRoda;

    public Motor(String nama, int kecepatanMaksimal, String jenisRoda) {
        super(nama, kecepatanMaksimal);
        this.jenisRoda = jenisRoda;
    }

    @Override
    public void jenisKendaraan() {
        System.out.println("Ini adalah jenis kendaraan: Motor");
    }

    @Override
    public void jadwalServis() {
        System.out.println("Jadwal servis motor setiap 3 bulan sekali.");
    }
}

// Final Class Teknisi
final class Teknisi {
    public void periksaKendaraan() {
        System.out.println("Teknisi sedang memeriksa kendaraan...");
    }
}

// Program Utama (Main Class)
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Toyota Fortuner", 200, 4);
        mobil1.info();
        mobil1.jenisKendaraan();
        mobil1.jadwalServis();
        mobil1.fiturKeamanan();
        System.out.println();

        // Membuat objek Motor
        Motor motor1 = new Motor("Honda CBR", 180, "Roda Dua");
        motor1.info();
        motor1.jenisKendaraan();
        motor1.jadwalServis();
        System.out.println();

        // Membuat objek Teknisi
        Teknisi teknisi = new Teknisi();
        teknisi.periksaKendaraan();
    }
}
