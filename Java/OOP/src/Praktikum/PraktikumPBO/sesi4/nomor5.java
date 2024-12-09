package Praktikum.PraktikumPBO.sesi5;

import java.util.Scanner;
public class nomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas bawah: ");
        int batasBawah = input.nextInt();

        System.out.print("Masukkan batas atas: ");
        int batasAtas = input.nextInt();

        System.out.println("Bilangan genap:");
        for (int i = batasBawah; i <= batasAtas; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}