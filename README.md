# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini merupakan aplikasi **Rental Alat Camping** yang dibuat menggunakan bahasa pemrograman Java sebagai tugas akhir mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi Rental Alat Camping digunakan untuk mengelola proses penyewaan perlengkapan camping. Program menyediakan fitur untuk menambah data alat camping, menambah data pelanggan, melihat daftar alat dan pelanggan, melakukan transaksi penyewaan, mencari alat, melihat riwayat transaksi, serta menampilkan laporan pendapatan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam Pemrograman Berorientasi Objek (Object Oriented Programming/OOP), seperti Class, Object, Atribut, Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism (Overriding), Seleksi, Perulangan, Input Output Sederhana, ArrayList, dan Error Handling.

---

# Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang digunakan pada aplikasi.

## 1. Class

Class merupakan blueprint atau cetakan untuk membuat object.

Pada aplikasi ini terdapat beberapa class yaitu:

- AlatCamping
- Tenda
- Pelanggan
- Transaksi
- Main

```java
public class AlatCamping {

}

public class Tenda extends AlatCamping {

}

public class Pelanggan {

}

public class Transaksi {

}

public class Main {

}
```

---

## 2. Object

Object adalah hasil instansiasi dari class.

Contoh pembuatan object pada program:

```java
daftarAlat.add(new Tenda("T001", "Tenda Dome", 50000, 5, "Dome", 4));

daftarPelanggan.add(
    new Pelanggan(
        "P001",
        "Ahmad",
        "08123456789",
        "Banjarbaru",
        true));

Transaksi transaksi = new Transaksi(
        "TR001",
        pelanggan,
        alat,
        jumlah,
        lama,
        terlambat);
```

---

## 3. Atribut

Atribut merupakan variabel yang dimiliki oleh sebuah class.

Contoh atribut pada class AlatCamping:

```java
private String kode;
private String nama;
private double hargaSewa;
private int stok;
```

---

## 4. Constructor

Constructor digunakan untuk memberikan nilai awal ketika object dibuat.

Contoh constructor pada class AlatCamping:

```java
public AlatCamping(String kode,
                   String nama,
                   double hargaSewa,
                   int stok) {

    this.kode = kode;
    this.nama = nama;
    this.hargaSewa = hargaSewa;
    this.stok = stok;
}
```

---

## 5. Mutator

Mutator (Setter) digunakan untuk mengubah nilai atribut.

```java
public void setNama(String nama) {
    this.nama = nama;
}

public void setHargaSewa(double hargaSewa) {
    this.hargaSewa = hargaSewa;
}
```

---

## 6. Accessor

Accessor (Getter) digunakan untuk mengambil nilai atribut.

```java
public String getNama() {
    return nama;
}

public double getHargaSewa() {
    return hargaSewa;
}
```

---

## 7. Encapsulation

Encapsulation diterapkan dengan menjadikan atribut bersifat private sehingga hanya dapat diakses melalui getter dan setter.

```java
private String kode;
private String nama;
private double hargaSewa;
private int stok;
```

---

## 8. Inheritance

Inheritance digunakan agar class Tenda mewarisi seluruh atribut dan method dari class AlatCamping.

```java
public class Tenda extends AlatCamping {

}
```

Dengan inheritance, class Tenda tidak perlu membuat ulang atribut seperti kode, nama, harga sewa, dan stok.

---

## 9. Polymorphism

Polymorphism pada aplikasi ini menggunakan **Method Overriding**.

Class Tenda melakukan override terhadap method `hitungBiaya()` dan `tampilInfo()`.

```java
@Override
public double hitungBiaya(int lamaSewa) {

    double total = getHargaSewa() * lamaSewa;

    total += 10000;

    return total;
}
```

Ketika object bertipe `Tenda` dipanggil melalui referensi `AlatCamping`, Java akan menjalankan method hasil override tersebut.

---

## 10. Seleksi

Program menggunakan percabangan `if`, `else`, dan `switch`.

Contoh:

```java
if (pelanggan.isMember()) {
    diskon = totalSewa * 0.10;
} else {
    diskon = 0;
}
```

dan

```java
switch (pilihan) {

    case 1:
        ...
        break;

    case 2:
        ...
        break;

    default:
        System.out.println("Menu tidak tersedia.");
}
```

---

## 11. Perulangan

Program menggunakan perulangan `for`, enhanced `for`, dan `do while`.

Contoh:

```java
for (AlatCamping a : daftarAlat) {

    a.tampilInfo();

}
```

dan

```java
do {

    ...

} while (pilihan != 0);
```

---

## 12. Input Output Sederhana

Program menggunakan Scanner untuk menerima input dari pengguna dan System.out.println() untuk menampilkan output.

```java
Scanner input = new Scanner(System.in);

System.out.print("Kode : ");
String kode = input.nextLine();

System.out.println("Data alat berhasil ditambahkan.");
```

---

## 13. ArrayList

Program menggunakan ArrayList untuk menyimpan data alat, pelanggan, dan transaksi.

```java
ArrayList<AlatCamping> daftarAlat = new ArrayList<>();

ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();

ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
```

Penggunaan ArrayList membuat jumlah data yang disimpan menjadi dinamis.

---

## 14. Error Handling

Program menggunakan try-catch untuk menangani kesalahan input maupun error lainnya.

```java
try {

    ...

} catch (InputMismatchException e) {

    System.out.println("Input harus berupa angka.");

} catch (Exception e) {

    System.out.println("Terjadi Kesalahan : " + e.getMessage());

}
```

---

# Usulan Nilai

| No | Materi | Nilai |
| :-: | ---------------- | :---: |
| 1 | Class | 5 |
| 2 | Object | 5 |
| 3 | Atribut | 5 |
| 4 | Constructor | 5 |
| 5 | Mutator | 5 |
| 6 | Accessor | 5 |
| 7 | Encapsulation | 5 |
| 8 | Inheritance | 5 |
| 9 | Polymorphism | 10 |
| 10 | Seleksi | 5 |
| 11 | Perulangan | 5 |
| 12 | IO Sederhana | 10 |
| 13 | ArrayList | 15 |
| 14 | Error Handling | 15 |
| | **TOTAL** | **100** |

---

# Pembuat

**Nama :** Adeliani

**NPM :** 2410010047

**Kelas :** 4A PBO 1
