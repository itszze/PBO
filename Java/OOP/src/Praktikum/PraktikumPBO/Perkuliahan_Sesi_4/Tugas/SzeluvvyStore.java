package Praktikum.PraktikumPBO.Perkuliahan_Sesi_4.Tugas;

import java.util.Scanner;

public class SzeluvvyStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueOrder = true;

        // Menu baju tersedia
        String[] baju = {"Kaos Oversize", "Dress Floral", "Hoodie Unisex", "Kemeja Kasual"};
        int[] harga = {75000, 120000, 150000, 100000};

        System.out.println("=== Selamat Datang di szeluvvy.store ===");

        do {
            // Menampilkan daftar baju
            System.out.println("\nPilihan Baju:");
            for (int i = 0; i < baju.length; i++) {
                System.out.println((i + 1) + ". " + baju[i] + " - Rp" + harga[i]);
            }
            
            // Memilih baju
            System.out.print("Masukkan nomor pilihan baju (1-4): ");
            int pilihan = scanner.nextInt();
            
            // Validasi pilihan menggunakan switch
            if (pilihan >= 1 && pilihan <= 4) {
                System.out.println("Anda memilih: " + baju[pilihan - 1] + " seharga Rp" + harga[pilihan - 1]);
                System.out.print("Masukkan jumlah yang ingin dipesan: ");
                int jumlah = scanner.nextInt();

                // Validasi jumlah menggunakan if-else
                if (jumlah > 0) {
                    int total = harga[pilihan - 1] * jumlah;
                    System.out.println("Total harga: Rp" + total);

                    // Konfirmasi pesanan
                    System.out.print("Apakah Anda ingin melanjutkan pesanan? (ya/tidak): ");
                    String konfirmasi = scanner.next();
                    if (konfirmasi.equalsIgnoreCase("ya")) {
                        System.out.println("Pesanan Anda berhasil dibuat!");
                    } else {
                        System.out.println("Pesanan dibatalkan.");
                    }
                } else {
                    System.out.println("Jumlah harus lebih dari 0!");
                }
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            // Menanyakan apakah pengguna ingin memesan lagi
            System.out.print("\nApakah Anda ingin memesan lagi? (ya/tidak): ");
            String ulang = scanner.next();
            if (!ulang.equalsIgnoreCase("ya")) {
                continueOrder = false;
            }
        } while (continueOrder);

        System.out.println("\nTerima kasih telah berbelanja di szeluvvy.store!");
        scanner.close();
    }
}
