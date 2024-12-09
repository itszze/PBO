package Praktikum.PraktikumPBO.sesi1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bioskop {
    // Menyimpan data member dalam HashMap
    private static Map<String, Member> memberList = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menampilkan Judul Program
        System.out.println(" ========================================= ");
        System.out.println("        Selamat Datang di Bioskop        ");
        System.out.println(" ========================================= ");

        // Menu utama
        while (true) {
            System.out.println(" Menu: ");
            System.out.println(" 1. Buat Member ");
            System.out.println(" 2. Pesan Tiket ");
            System.out.println(" 3. Keluar ");
            System.out.print(" Pilih menu (1-3): ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    // Membuat member baru
                    buatMember(scanner);
                    break;
                case 2:
                    // Memesan tiket
                    pesanTiket(scanner);
                    break;
                case 3:
                    System.out.println(" Terima kasih telah menggunakan layanan bioskop kami! ");
                    scanner.close();
                    return;
                default:
                    System.out.println(" Pilihan tidak valid! Silakan pilih lagi. ");
            }
        }
    }

    private static void buatMember(Scanner scanner) {
        System.out.print(" Masukkan nama member: ");
        String nama = scanner.next();
        
        System.out.print(" Masukkan nomor telepon (12 angka): ");
        String nomorTelepon = scanner.next();

        // Memeriksa apakah nomor telepon memiliki panjang 12 angka
        if (nomorTelepon.length() != 12 || !nomorTelepon.matches("\\d+")) {
            System.out.println(" Nomor telepon harus terdiri dari 12 angka. Proses pembuatan member dibatalkan. ");
            return;
        }

        // Membuat objek Member baru dan menyimpannya dalam HashMap
        Member member = new Member(nama, nomorTelepon);
        memberList.put(nomorTelepon, member);

        System.out.println(" Member berhasil dibuat! ");
    }

    private static void pesanTiket(Scanner scanner) {
        // Menampilkan pilihan film
        System.out.println(" Pilih Film: ");
        System.out.println(" 1. Petualangan Sang Pahlawan - Rp 50.000 ");
        System.out.println(" 2. Cinta di Ujung Waktu - Rp 60.000 ");
        System.out.println(" 3. Komedi Keluarga - Rp 70.000 ");
        System.out.print(" Nomor film (1-3): ");
        int pilihanFilm = scanner.nextInt();

        // Menentukan harga tiket
        int hargaTiket = 0;
        switch (pilihanFilm) {
            case 1: hargaTiket = 50000; break;
            case 2: hargaTiket = 60000; break;
            case 3: hargaTiket = 70000; break;
            default:
                System.out.println(" Pilihan tidak valid! ");
                return;
        }

        // Meminta jumlah tiket
        System.out.print(" Jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        // Menghitung total harga
        int totalHarga = hargaTiket * jumlahTiket;

        // Memeriksa apakah pengguna adalah member
        System.out.print(" Apakah Anda member? (y/n): ");
        String isMember = scanner.next();
        if (isMember.equalsIgnoreCase("y")) {
            System.out.print(" Nomor telepon member: ");
            String nomorTelepon = scanner.next();
            if (memberList.containsKey(nomorTelepon)) {
                totalHarga *= 0.9; // Diskon 10%
                System.out.println(" Diskon 10% diterapkan! ");
            } else {
                System.out.println(" Nomor telepon tidak terdaftar sebagai member. ");
            }
        }

        // Menampilkan total harga
        System.out.println(" Total harga: Rp " + totalHarga);

        // Memilih metode pembayaran
        System.out.println(" Pilih metode pembayaran: ");
        System.out.println(" 1. Tunai ");
        System.out.println(" 2. Kartu Kredit ");
        System.out.println(" 3. Kartu Debit ");
        System.out.print(" Metode pembayaran (1-3): ");
        int metodePembayaran = scanner.nextInt();

        // Menangani pembayaran tunai
        if (metodePembayaran == 1) {
            System.out.print(" Masukkan uang tunai: Rp ");
            int uangTunai = scanner.nextInt();

            if (uangTunai < totalHarga) {
                System.out.println(" Uang tunai tidak cukup. ");
                return;
            }

            int kembalian = uangTunai - totalHarga;

            // Menampilkan struk pembayaran
            tampilkanStruk(getFilmName(pilihanFilm), jumlahTiket, totalHarga, uangTunai, kembalian);
        } else {
            System.out.println(" Pembayaran dengan kartu diterima. ");
            // Tambahkan logika untuk memproses kartu kredit/debit jika perlu
            tampilkanStruk(getFilmName(pilihanFilm), jumlahTiket, totalHarga, 0, 0);
        }

        // Loop untuk menampilkan pilihan menonton ulang
        String ulang;
        do {
            System.out.print(" Menonton film lain? (y/n): ");
            ulang = scanner.next();
            if (ulang.equalsIgnoreCase("y")) {
                pesanTiket(scanner);
            }
        } while (ulang.equalsIgnoreCase("y"));

    }

    private static void tampilkanStruk(String film, int jumlahTiket, int totalHarga, int uangTunai, int kembalian) {
        System.out.println(" ========================================= ");
        System.out.println("               STRUK TIKET                ");
        System.out.println(" ========================================= ");
        System.out.println(" Film: " + film);
        System.out.println(" Jumlah Tiket: " + jumlahTiket);
        System.out.println(" Total Harga: Rp " + totalHarga);
        if (uangTunai > 0) {
            System.out.println(" Uang Tunai: Rp " + uangTunai);
            System.out.println(" Kembalian: Rp " + kembalian);
        }
        System.out.println(" ========================================= ");
        System.out.println(" Terima kasih telah memesan tiket! ");
    }

    private static String getFilmName(int pilihanFilm) {
        switch (pilihanFilm) {
            case 1: return " Petualangan Sang Pahlawan ";
            case 2: return " Cinta di Ujung Waktu ";
            case 3: return " Komedi Keluarga ";
            default: return " Tidak diketahui ";
        }
    }
}

class Member {
    private String nama;
    private String nomorTelepon;

    public Member(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }
}
