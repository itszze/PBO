package Praktikum.PraktikumPBO.Perkuliahan_Sesi_14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BarangDAO {

    // Menambahkan barang ke database
    public void tambahBarang(Barang barang) throws SQLException {
        String sql = "INSERT INTO barang (nama_barang, stok, status) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, barang.getNamaBarang());
            stmt.setInt(2, barang.getStok());
            stmt.setString(3, barang.getStatus());
            stmt.executeUpdate();  // Menjalankan query untuk menambahkan barang
        }
    }
}
