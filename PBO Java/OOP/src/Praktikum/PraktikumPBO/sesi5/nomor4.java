package Praktikum.PraktikumPBO.sesi5;

public class nomor4 {
    public static void main(String[] args) {
        // Variabel untuk menyimpan jumlah bilangan genap
        int jumlahGenap = 0;

        // Menampilkan pesan awal kepada pengguna
        System.out.println("Program untuk menghitung jumlah bilangan genap antara 1 hingga 100.");

        // Memulai perulangan dari 1 hingga 100
        for (int i = 1; i <= 100; i++) {
            // Mengecek apakah i adalah bilangan genap
            if (i % 2 == 0) {
                // Jika genap, tambahkan nilai i ke variabel jumlahGenap
                jumlahGenap += i;

                // Menampilkan bilangan genap yang ditemukan
                System.out.println("Bilangan genap yang ditemukan: " + i);
            }
        }

        // Setelah perulangan selesai, tampilkan hasil akhir
        System.out.println("Jumlah total bilangan genap dari 1 hingga 100 adalah: " + jumlahGenap);
    }
}