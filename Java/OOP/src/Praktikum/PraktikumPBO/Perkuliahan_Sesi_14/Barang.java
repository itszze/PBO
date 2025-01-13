package Praktikum.PraktikumPBO.Perkuliahan_Sesi_14;

public class Barang {
    private int id;
    private String namaBarang;
    private int stok;
    private String status;

    // Konstruktor
    public Barang(String namaBarang, int stok, String status) {
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.status = status;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
