package Praktikum.PraktikumPBO.Perkuliahan_Sesi_11.tugas;
class OperasiPengurangan extends OperasiBilangan {
    @Override
    protected void set_C() {
        this.c = a - b;
    }

    @Override
    protected void tampil() {
        System.out.println("Pengurangan: " + a + " - " + b + " = " + c);
    }
}