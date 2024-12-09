package Praktikum.PraktikumPBO.sesi2;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            
            // Meminta pengguna memilih operasi yang diinginkan
            System.out.println("\nPilih operasi Aritmatika: ");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)"); 
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan : ");
            int pilihan = scanner.nextInt(); // Membaca pilihan pengguna
            
            // Menyelesaikan program jika pilihan adalah 5
            if (pilihan == 5) {
                System.out.println("Keluar dari program...");
                scanner.close(); // Menutup scanner sebelum keluar dari program
                return; // Menghentikan eksekusi program
            }

            // Menyimpan dua angka
            int angka1; // Angka pertama
            int angka2; // Angka kedua

            // Meminta pengguna memasukkan angka pertama
            System.out.print("Masukkan angka pertama: ");
            angka1 = scanner.nextInt(); // Membaca input angka pertama
            
            // Meminta pengguna memasukkan angka kedua
            System.out.print("Masukkan angka kedua: ");
            angka2 = scanner.nextInt(); // Membaca input angka kedua

            // Variabel untuk menyimpan hasil
            double hasil = 0;
            
            switch(pilihan) {
                case 1:
                    hasil = angka1 + angka2; // Penjumlahan
                    System.out.println("Hasil Penjumlahan: " + hasil);
                    break;
                case 2:
                    hasil = angka1 - angka2; // Pengurangan
                    System.out.println("Hasil Pengurangan: " + hasil);
                    break;
                case 3:
                    hasil = angka1 * angka2; // Perkalian
                    System.out.println("Hasil Perkalian: " + hasil);
                    break;
                case 4:
                    if (angka2 != 0) {
                        hasil = (double) angka1 / angka2; // Pembagian
                        System.out.println("Hasil Pembagian: " + hasil);
                    } else {
                        System.out.println("Tidak dapat membagi dengan nol.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}