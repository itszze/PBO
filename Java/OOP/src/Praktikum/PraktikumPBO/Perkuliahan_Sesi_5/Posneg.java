package Praktikum.PraktikumPBO.Perkuliahan_Sesi_5;

import java.util.Scanner;
public class Posneg {
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan sebuah angka
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        // Memeriksa apakah angka positif, negatif, atau nol
        if (angka > 0) {
            System.out.println("Angka positif.");
        } else if (angka < 0) {
            System.out.println("Angka negatif.");
        } else {
            System.out.println("Angka nol.");
        }
    }
}