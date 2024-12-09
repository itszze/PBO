package Praktikum.PraktikumPBO.Perkuliahan_Sesi_8;

public class Main{
    public static void main(String[] args){
        Pegawai Pegawai = new Pegawai();
        Manajer Manajer = new Manajer();
        Kasir Kasir = new Kasir();
        Koki Koki = new Koki();
        Pelayan Pelayan = new Pelayan();
        Satpam Satpam = new Satpam();

        Manajer.nama = "Sifa";
        Manajer.id_pegawai = "1";
        Manajer.gaji = "7 Juta";

        Kasir.nama = "Aldi";
        Kasir.id_pegawai = "2";
        Kasir.gaji = "1,2 Juta";

        Pelayan.nama = "Dean";
        Pelayan.id_pegawai = "4";
        Pelayan.gaji = "1,2 Juta";

        Satpam.nama = "Aldi";
        Satpam.id_pegawai = "5";
        Satpam.gaji = "1 Juta";

        Koki.nama = "Reza";
        Koki.id_pegawai = "3";
        Koki.gaji = "2 Juta";
        
        Pegawai.menampilkan();

        Manajer.menampilkan();
        Manajer.tugas();

        Kasir.menampilkan();
        Kasir.tugas();

        Koki.menampilkan();
        Koki.tugas();

        Pelayan.menampilkan();
        Pelayan.tugas();

        Satpam.menampilkan();
        Satpam.tugas();
    }
}