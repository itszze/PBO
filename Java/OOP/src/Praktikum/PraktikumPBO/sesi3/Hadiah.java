package Praktikum.PraktikumPBO.sesi3;

import java.util.Scanner;
public class Hadiah {
    public static void main(String[] args) {
        // Membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner scan = new Scanner(System.in); // Membuka Scanner
        
        // Mengambil input dari pengguna
        System.out.print("Total Belanja : Rp ");
        belanja = scan.nextInt();
        
        // Mengecek apakah total belanja lebih dari 100.000
        if (belanja > 100000) {
            System.out.println("Selamat, Anda mendapatkan hadiah!");
        }
        
        // Pesan akhir untuk pengguna
        System.out.println("Terima Kasih...");
        
        // Menutup Scanner untuk mencegah kebocoran resource
        scan.close();
    }
}
