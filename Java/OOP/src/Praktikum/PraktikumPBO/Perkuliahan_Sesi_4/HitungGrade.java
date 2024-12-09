package Praktikum.PraktikumPBO.Perkuliahan_Sesi_4;
import java.util.Scanner;

public class HitungGrade {
    public static void main(String[] args) {
        //Membuat variabel dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("Inputkan Nilai: ");
        nilai = scan.nextInt();

        //menghitung gradenya
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C+";
        } else if (nilai >= 60) { // Catatan: Kondisi ini redundan
            grade = "C";
        } else if (nilai >= 60) { // Catatan: Kondisi ini juga redundan
            grade = "D";
        } else {
            grade = "E";
        }

        //cetak hasilnya
        System.out.println("Grade: " + grade);

        // Tutup Scanner
        scan.close(); // Tambahkan baris ini
    }
}
