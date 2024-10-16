package Praktikum.PraktikumPBO.sesi5;

import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        // Membuat scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        int angka;

        // Perulangan terus meminta input hingga pengguna memasukkan angka 0
        do {
            // Meminta pengguna memasukkan angka
            System.out.print("Masukkan sebuah angka (masukkan 0 untuk berhenti): ");
            angka = scanner.nextInt();

            // Menampilkan angka yang dimasukkan (selain 0)
            if (angka != 0) {
                System.out.println("Anda memasukkan angka: " + angka);
            }
        } while (angka != 0); // Berhenti jika angka yang dimasukkan adalah 0

        System.out.println("Program berhenti. Anda telah memasukkan angka 0.");
        
        // Menutup scanner
        scanner.close();
    }
}
