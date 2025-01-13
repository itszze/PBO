package Praktikum.PraktikumPBO.Perkuliahan_Sesi_12;

interface Transportasi {
    void tampil();
    void setData();
    int getId();
}

class Gojek implements Transportasi {
    protected int harga;
    protected int id;

    public Gojek(int harga, int id) {
        this.harga = harga;
        this.id = id;
    }

    @Override
    public void tampil() {
        System.out.println("Data Gojek:");
        System.out.println("Harga per km: " + harga);
        System.out.println("ID: " + id);
    }

    @Override
    public void setData() {
        this.harga = 12000;
        this.id = 6;
    }

    @Override
    public int getId() {
        return id;
    }
}

class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;

    public Bayar(int harga, int id, int jarak, String nama) {
        super(harga, id);
        this.jarak = jarak;
        this.nama = nama;
        this.total = harga * jarak;
    }

    @Override
    public void tampil() {
        System.out.println("Data Pembayaran:");
        System.out.println("Nama: " + nama);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Harga per km: " + harga);
        System.out.println("Total: " + total);
        System.out.println("ID: " + id);
    }

    @Override
    public void setData() {
        this.jarak = 5;
        this.nama = "fad";
        this.total = harga * jarak;
    }

    @Override
    public int getId() {
        return super.getId();
    }
}

public class soal1 {
    public static void main(String[] args) {
        Gojek gojek = new Gojek(12000, 101);
        gojek.tampil();
        System.out.println();

        Bayar bayar = new Bayar(12000, 118, 12, "fad");
        bayar.tampil();
        System.out.println();

        bayar.setData();
        bayar.tampil();
    }
}
