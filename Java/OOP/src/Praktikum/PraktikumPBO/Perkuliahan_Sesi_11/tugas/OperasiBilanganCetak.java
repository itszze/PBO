package Praktikum.PraktikumPBO.Perkuliahan_Sesi_11.tugas;
public class OperasiBilanganCetak {
    private void cetakSemua(OperasiBilangan[] OB, double a, double b) {
        for (OperasiBilangan ob : OB) {
            ob.set_A(a);
            ob.set_B(b);
            ob.set_C();
            ob.tampil();
        }
    }

    public static void main(String[] args) {
        double A = 10.5;
        double B = 0.5;

        OperasiBilangan[] OB = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        OperasiBilanganCetak cetak = new OperasiBilanganCetak();
        cetak.cetakSemua(OB, A, B);
    }
}