package Praktikum.PraktikumPBO.sesi5;

public class ClassBintangFilm {
    public static void main(String[] args) {
        // Membuat dua objek BintangFilm
        BintangFilm siA = new BintangFilm("Budi", true);
        BintangFilm siB = new BintangFilm("Hani", false);

        // Menampilkan informasi siA dan siB
        System.out.println("siA => Nama: " + siA.perolehNama() + ", Jenis Kelamin: " + siA.perolehJenisKelamin());
        System.out.println("siB => Nama: " + siB.perolehNama() + ", Jenis Kelamin: " + siB.perolehJenisKelamin());

        // Menggunakan metode isikan untuk mengubah data objek
        siA.isikan("Budi Santoso", true);
        siB.isikan("Hani Sari", false);

        // Menampilkan informasi setelah perubahan
        System.out.println("siA setelah perubahan => Nama: " + siA.perolehNama() + ", Jenis Kelamin: " + siA.perolehJenisKelamin());
        System.out.println("siB setelah perubahan => Nama: " + siB.perolehNama() + ", Jenis Kelamin: " + siB.perolehJenisKelamin());
    }
}
