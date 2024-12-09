package Praktikum.PraktikumPBO.Perkuliahan_Sesi_8;

// Kelas utama Animal
class Animal {
    String name;

    // Konstruktor
    public Animal(String name) {
        this.name = name;
    }

    // Metode untuk berbicara
    public void speak() {
        System.out.println("Animal Speaks");
    }
}

// Kelas Dog yang merupakan subclass dari Animal
class Dog extends Animal {
    // Konstruktor
    public Dog(String name) {
        super(name); // Memanggil konstruktor superclass (Animal)
    }

    // Override metode speak untuk Dog
    @Override
    public void speak() {
        System.out.println(name + "says Woooof");
    }
}

// Kelas untuk menguji program
public class AnimalTester {
    public static void main(String[] args) {
        // Membuat objek Dog
        Dog dog = new Dog("Buddy ");
        dog.speak(); // Output: Buddy says Woooof
    }
}
