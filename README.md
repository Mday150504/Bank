
## Penjelasan Class

### `Bank.java`
Merupakan **class induk** yang berisi method umum yang akan diwariskan ke class turunan.

### `BankBCA.java`
Class turunan dari `Bank` yang meng-override method tertentu sesuai dengan karakteristik Bank BCA.

### `BankBNI.java`
Class turunan dari `Bank` yang meng-override method tertentu sesuai dengan karakteristik Bank BNI.

### `Main.java`
Digunakan untuk:
- Membuat objek dari class `BankBCA` dan `BankBNI`
- Menjalankan method
- Menunjukkan penerapan **polymorphism**

## Cara Menjalankan Program

1. Pastikan **Java JDK** sudah terinstall.
2. Masuk ke folder `src`:
   ```bash
   cd tugasSesi4PBO_M.dai/src
