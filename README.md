# Program Polimorfisme Senjata

| Keterangan | Detail |
|---|---|
| **Nama** | Novry Nanda Kurniaputra |
| **NIM** | 2410501123 |
| **Kelas** | D |

---

## Deskripsi
Program ini dibuat menggunakan bahasa Java untuk menunjukkan konsep OOP (Object Oriented Programming), khususnya Polimorfisme dan Method Overriding.

Program memiliki class induk bernama `Senjata` dan beberapa class turunan seperti:
- Pedang
- Busur
- Tongkat

Masing-masing class turunan memiliki method `serang()` yang berbeda.

## Konsep yang Digunakan
- Inheritance
- Polymorphism
- Method Overriding

## Cara Kerja Program
Semua objek disimpan menggunakan tipe `Senjata`, tetapi saat method `serang()` dipanggil, Java akan menjalankan method sesuai objek aslinya.

Contoh:
```java
Senjata s1 = new Pedang();
Senjata s2 = new Busur();
Senjata s3 = new Tongkat();
```

Walaupun semua bertipe `Senjata`, output yang dihasilkan berbeda karena setiap class melakukan override pada method `serang()`.

## Output Program
```bash
Pedang menyerang, damage 80!
Busur menyerang dari jauh, damage 60!
Tongkat sihir menyerang, damage 90!
```

## Jawaban Soal

### 1. Mengapa output berbeda walaupun semua bertipe `Senjata`?

Karena program menggunakan konsep Polimorfisme pada Java.

Walaupun variabel menggunakan tipe `Senjata`, objek yang dibuat berbeda yaitu:
- `Pedang`
- `Busur`
- `Tongkat`

Setiap class turunan melakukan override pada method `serang()`, sehingga saat method dipanggil, Java menjalankan method sesuai objek aslinya.

Contoh:
```java
Senjata s1 = new Pedang();
s1.serang();
```

Output:
```bash
Pedang menyerang, damage 80!
```

Hal ini disebut runtime polymorphism atau method overriding.

---

### 2. Apakah bisa menambahkan senjata baru tanpa mengubah kode lain?

Bisa.

Karena program menggunakan konsep OOP dan polimorfisme, kita dapat menambahkan class baru yang mewarisi class `Senjata` tanpa mengubah kode sebelumnya.

Contoh:
```java
class Kapak extends Senjata {
    @Override
    void serang() {
        System.out.println("Kapak membelah musuh, damage 85!");
    }
}
```

Lalu di dalam `main` cukup menambahkan:
```java
Senjata s4 = new Kapak();
s4.serang();
```

Program tetap berjalan dengan baik tanpa mengubah class lain. Ini menunjukkan bahwa polimorfisme membuat program lebih fleksibel dan mudah dikembangkan.

## Kesimpulan
Program ini menunjukkan bahwa polimorfisme memungkinkan satu method memiliki banyak bentuk tergantung objek yang digunakan. Dengan konsep ini, program menjadi lebih fleksibel dan mudah dikembangkan.