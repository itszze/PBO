package Praktikum.PraktikumPBO.Perkuliahan_Sesi_11.tugas;
class OperasiPembagian extends OperasiBilangan {
    @Override
    protected void set_C() {
        this.c = a / b;
    }

    @Override
    protected void tampil() {
        System.out.println("Pembagian: " + a + " / " + b + " = " + c);
    }
}