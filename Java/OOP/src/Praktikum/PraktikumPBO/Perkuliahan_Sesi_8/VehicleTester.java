package Praktikum.PraktikumPBO.Perkuliahan_Sesi_8;

// Superclass
class Vehicle {
    String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Method untuk menampilkan informasi kendaraan
    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass
class Car extends Vehicle {
    int doors;

    // Constructor
    public Car(String brand, int doors) {
        super(brand); // Memanggil constructor dari superclass
        this.doors = doors;
    }

    // Overloading method displayInfo
    public void displayInfo(String type) {
        super.displayInfo(); // Memanggil method dari superclass
        System.out.println("Type: " + type + ", Doors: " + doors);
    }
}

// Kelas utama untuk menjalankan program
public class VehicleTester {
    public static void main(String[] args) {
        // Membuat objek Car
        Car car = new Car("Toyota", 4);

        // Memanggil method displayInfo
        car.displayInfo("Sedan");
        // Output:
        // Brand: Toyota
        // Type: Sedan, Doors: 4
    }
}
