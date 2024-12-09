package Praktikum.PraktikumPBO.Perkuliahan_Sesi_8;

public class Manajer extends Pegawai{
    @Override 
    public void menampilkan(){
        System.out.println("Nama : "+nama);
        System.out.println("Id Pegawai : "+id_pegawai);
        System.out.println("Gaji : "+gaji);
    }

    public void tugas(){
        System.out.println("Tugas : Melakukan Manajemen untuk Franchise");
        System.out.println("Tugas : --------------------------------------");
    }
}
