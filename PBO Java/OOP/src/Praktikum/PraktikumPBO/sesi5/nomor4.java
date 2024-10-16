package Praktikum.PraktikumPBO.sesi5;

public class nomor4 {
    public static void main(String[] args) {
        int jumlahGenap = 0;

        // Looping dari 1 hingga 100
        for (int i = 1; i <= 100; i++) {
            // Memeriksa apakah bilangan tersebut genap
            if (i % 2 == 0) {
                jumlahGenap += i; // Menambahkan bilangan genap ke jumlah
            }
        }

        // Menampilkan hasil jumlah bilangan genap
        System.out.println("Jumlah bilangan genap dari 1 hingga 100 adalah: " + jumlahGenap);
    }
}
