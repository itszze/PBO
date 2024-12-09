package Praktikum.PraktikumPBO.sesi3;
import java.util.Scanner;

public class Hadiah {
    public static void main(String[] args) {
        // Membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner scan = new Scanner(System.in);
        
        // Mengambil input
        System.out.print("Total Belanja : Rp ");
        belanja = scan.nextInt();
        
        // Cek apakah dia belanja di atas 100.000
        if (belanja > 100000) {
            System.out.println("Selamat, Anda mendapatkan hadiah!");
        }
        System.out.println("Terima Kasih...");
    }
}
