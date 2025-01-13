package Praktikum.PraktikumPBO.Perkuliahan_Sesi_14;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Tes Koneksi ke Database
        try {
            Connection conn = DBConnection.getConnection();
            if (conn != null) {
                System.out.println("Koneksi ke database berhasil!");
                conn.close();  // Menutup koneksi setelah berhasil
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Koneksi ke database gagal.");
        }

        // Menambahkan barang ke database
        try {
            Barang barang = new Barang("Sapu", 10, "Tersedia");  // Membuat objek barang
            BarangDAO barangDAO = new BarangDAO();
            barangDAO.tambahBarang(barang);  // Menambahkan barang ke database
            System.out.println("Barang berhasil ditambahkan!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal menambahkan barang.");
        }
    }
}
