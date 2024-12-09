package Praktikum.PraktikumPBO.sesi5;

import java.util.Scanner;
public class nomor1 {
    public static void main(String[] args) {
        // Membuat scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah angka
        System.out.print("Masukkan sebuah angka: ");
        double angka = scanner.nextDouble();

        // Memeriksa apakah angka positif, negatif, atau nol
        if (angka > 0) {
            System.out.println("Angka yang Anda masukkan adalah positif.");
        } else if (angka < 0) {
            System.out.println("Angka yang Anda masukkan adalah negatif.");
        } else {
            System.out.println("Angka yang Anda masukkan adalah nol.");
        }

        // Menutup scanner
        scanner.close();
    }
}
