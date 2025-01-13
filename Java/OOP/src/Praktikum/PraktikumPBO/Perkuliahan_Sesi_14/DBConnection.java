package Praktikum.PraktikumPBO.Perkuliahan_Sesi_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/officeboy";  // URL ke database Anda
    private static final String USER = "root";  // Username MySQL Anda
    private static final String PASSWORD = "123";  // Password MySQL Anda

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Memuat JDBC driver MySQL
            return DriverManager.getConnection(URL, USER, PASSWORD);  // Mengembalikan koneksi
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Database connection failed.", e);  // Jika gagal memuat driver
        }
    }
}
