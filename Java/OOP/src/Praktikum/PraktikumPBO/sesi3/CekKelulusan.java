package Praktikum.PraktikumPBO.sesi3;
import java.util.Scanner;
// Program IF dengan dua kondisi
public class CekKelulusan {
    public static void main(String[] args) {
        // Membuat variabel dan scanner
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);
        
        // Mengambil input
        System.out.print("Nama : "); nama = scan.nextLine();
        System.out.print("Nilai : "); nilai = scan.nextInt();
        
        // Cek apakah dia lulus atau tidak
        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + nama + ", Anda Gagal");
        }

        // Menutup scanner
        scan.close();
    }
}
