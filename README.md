# 🚗 Kelompok Pemrograman Berbasis Objek
## **Project Tema: Simulasi Kendaraan (Roda 2 & Roda 4) dengan Fitur Kecepatan**

---

## 👤 **Nama Anggota**
1. Ivan Wirahadi Permana (4524210045)
2. [Nama Anggota 2]
3. [Nama Anggota 3]
4. [Nama Anggota 4]

---

## 📘 **Mata Kuliah**
**Pemrograman Berbasis Objek (PBO)**
Teknik Informatika – Universitas Pancasila
Tahun 2025

---

## 🎯 **Tema Project**
Simulasi Kendaraan Roda 2 dan Roda 4 menggunakan Java OOP.

**Fitur Utama:**
- Pewarisan (*Inheritance*)
- Method Overriding (menampilkan kecepatan)
- Class induk `Kendaraan`
- Class turunan `Mobil` & `Motor`
- Fitur simulasi percepatan dalam bentuk method

---

## 📂 **Struktur Project**
```text
src/
├── Kendaraan.java
├── KendaraanKeluarga.java
├── KendaraanSport.java
├── KendaraanRoda4.java
├── KendaraanRoda2.java
├── KendaraanMotor.java
└── App.java
README.md
```

---

## 🧩 Tutorial Git untuk Anggota Kelompok
Panduan ini dibuat supaya semua anggota bisa berkolaborasi memakai GitHub dengan rapi.

1. Cara Clone Repository
Agar bisa mengerjakan di laptop masing-masing:

Clone Repo
```
git clone [https://github.com/namakelompok/nama-repository.git](https://github.com/namakelompok/nama-repository.git)
```

2. Cara Membuat Branch Baru
Setiap anggota membuat branch sendiri. Nama branch disarankan sesuai nama masing-masing.

```
git checkout -b nama-anggota
```

### Contoh:
```
git checkout -b ivan
```
3. Cara Cek Semua Branch
Untuk melihat kamu sedang berada di branch mana:

```
git branch
```

4. Cara Menambah File / Edit Project
Setelah mengedit atau membuat file Java:

Tambahkan perubahan:
```
git add .

Commit perubahan:

git commit -m "Menambahkan fitur kecepatan kendaraan"
```

5. Cara Push ke Branch Masing-Masing
Saat pertama kali push:

```
git push -u origin nama-anggota
```
* Push berikutnya (cukup ketik ini):
```
git push
```
6. Cara Update Project Dengan Perubahan Terbaru (Pull)
Sebelum mulai mengoding hari ini, selalu lakukan ini agar tidak bentrok (conflict):
```
git pull origin main
```
7. Cara Merge ke Main
(Hanya dilakukan oleh Ketua Kelompok atau yang ditunjuk)

``` text
Buka Repository di GitHub.

Pilih tab Pull Request.

Klik New Pull Request.

Pilih arah merge:

base: main

compare: nama-anggota

Klik Create Pull Request.

Klik Merge Pull Request.
```
8. Cara Mengatasi Konflik (Jika Terjadi)
Jika saat git pull atau git merge muncul pesan CONFLICT:

* Buka file yang conflict (biasanya warnanya merah di text editor).

* Cari bagian seperti ini:

```
<<<<<<< HEAD
kode dari main (versi server)
=======
kode dari branch kita (versi lokal)
>>>>>>> nama-branch
Hapus tanda <<<<, ====, >>>> dan pilih kode mana yang mau dipakai (atau gabungkan keduanya).
```
* Simpan file.

* Lakukan commit ulang:
```
git add .
git commit -m "fix conflict"
git push
```
## 📌 Catatan Penting
Setiap anggota WAJIB bekerja di branch masing-masing.

JANGAN langsung push ke main.

Selalu lakukan git pull origin main sebelum memulai edit.

## 🎉 Terima Kasih! Project ini dibuat untuk memenuhi tugas mata kuliah Pemrograman Berbasis Objek.