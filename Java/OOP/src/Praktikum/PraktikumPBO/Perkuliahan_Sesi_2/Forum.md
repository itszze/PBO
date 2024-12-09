# Soal:
Jelaskan apa perbedaan antara tipe data primitif dan tipe data referensi dalam OOP?  
Bagaimana cara mendefinisikan atribut kelas dengan tipe data tertentu dalam OOP?

---

## Jawaban:

### Perbedaan Tipe Data Primitif dan Tipe Data Referensi:

1. **Tipe Data Primitif:**
   - Menyimpan nilai langsung, seperti angka dan karakter (contoh: `int`, `float`, `char`).
   - Data disimpan di **stack** dan tidak merujuk ke objek lain.
   - Contoh: `int x = 10;`

2. **Tipe Data Referensi:**
   - Menyimpan alamat atau referensi ke objek di memori.
   - Digunakan untuk objek, array, atau string.
   - Data disimpan di **heap** dan mereferensikan lokasi objek.
   - Contoh: 
     ```java
     String nama = "Angga";
     int[] angka = {1, 2, 3};
     ```

---

### Cara Mendefinisikan Atribut Kelas dengan Tipe Data Tertentu:

- **Atribut kelas** didefinisikan dengan tipe data tertentu sesuai kebutuhan.
- Tipe data **primitif** biasanya digunakan untuk nilai sederhana, seperti angka dan boolean.
- Tipe data **referensi** digunakan untuk objek atau struktur data yang lebih kompleks, seperti array atau class lain.

**Contoh Implementasi dalam Java:**

```java
public class Mahasiswa {
    // Atribut dengan tipe data primitif
    int umur;
    double nilai;
    
    // Atribut dengan tipe data referensi
    String nama;
    String[] mataKuliah;

    // Constructor
    public Mahasiswa(String nama, int umur, double nilai, String[] mataKuliah) {
        this.nama = nama;
        this.umur = umur;
        this.nilai = nilai;
        this.mataKuliah = mataKuliah;
    }
}
