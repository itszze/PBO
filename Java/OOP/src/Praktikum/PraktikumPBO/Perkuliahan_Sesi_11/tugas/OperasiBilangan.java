package Praktikum.PraktikumPBO.Perkuliahan_Sesi_11.tugas;
class OperasiBilangan {
    protected double a, b, c;

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        return c;
    }

    protected void set_C() {
        this.c = 0; // Di-override oleh subclass
    }

    protected void tampil() {
        System.out.println("Hasil: " + c);
    }
}