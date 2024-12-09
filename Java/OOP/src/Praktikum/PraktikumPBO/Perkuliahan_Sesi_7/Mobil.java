package Praktikum.PraktikumPBO.Perkuliahan_Sesi_7;

public class Mobil {
    public String merk;           // Public: accessible from anywhere
    protected int tahunProduksi;  // Protected: accessible within package and subclass
    private double harga;         // Private: accessible only within this class

    // Constructor
    public Mobil(String merk, int tahunProduksi, double harga) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    // Getter for the private attribute harga
    public double getHarga() {
        return harga;
    }

    // Setter for the private attribute harga
    public void setHarga(double hargaBaru) {
        if (hargaBaru > 0) {  // Ensure new price is positive
            this.harga = hargaBaru;
        } else {
            System.out.println("Harga harus lebih besar dari 0.");
        }
    }

    // Method to display car information
    public void tampilkanInfoMobil() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: " + harga);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a Mobil object
        Mobil mobil1 = new Mobil("Toyota", 2022, 300000000);

        // Accessing the public attribute
        System.out.println("Merk Mobil: " + mobil1.merk); // Output: Toyota

        // Accessing the protected attribute
        System.out.println("Tahun Produksi Mobil: " + mobil1.tahunProduksi); // Output: 2022

        // Accessing the private attribute using getter
        System.out.println("Harga Mobil: " + mobil1.getHarga()); // Output: 300000000.0

        // Modifying the private attribute using setter
        mobil1.setHarga(350000000);
        System.out.println("Harga Mobil Setelah Diubah: " + mobil1.getHarga()); // Output: 350000000.0

        // Displaying complete car information
        mobil1.tampilkanInfoMobil();
    }
}

