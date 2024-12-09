package Praktikum.PraktikumPBO.Perkuliahan_Sesi_6;

public class BintangFilm {
    // atribut
    private String nama;
    private Boolean pria;

    // konstruktor
    public BintangFilm(String nama, Boolean pria) {
        this.nama = nama;
        this.pria = pria;
    }

    // Method untuk mengisi data
    public void isikan(String nama, Boolean pria) {
        this.nama = nama; // this adalah objek sekarang
        this.pria = pria;
    }

    // Method untuk memperoleh nama
    public String perolehNama() {
        return nama;
    }

    // Method untuk memperoleh jenis kelamin
    public String perolehJenisKelamin() {
        if (pria) {
            return "Pria";
        } else {
            return "Wanita";
        }
    }
}

// Kelas utama untuk menguji
class ClassBintangFilm {
    public static void main(String[] args) {
        // buat dua objek BintangFilm siA dan siB
        BintangFilm siA = new BintangFilm("Budi", true);
        BintangFilm siB = new BintangFilm("Hani", false);

        // Menampilkan objek siA dan siB
        System.out.println("siA => " + siA.perolehNama() + ", " + siA.perolehJenisKelamin());
        System.out.println("siB => " + siB.perolehNama() + ", " + siB.perolehJenisKelamin());
    }
}
