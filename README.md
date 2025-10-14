# UTS KOMPRO KELOMPOK 11
Tugas UTS Komputer Pemrograman - Manajemen Nilai Mahasiswa

*Judul Project:* STUDI KASUS 1 ; MANAJEMEN NILAI MAHASISWA  
*Nama Kelompok:*
1. M. Syamsul Fatah (G1A025012) 
2. Riangga Rafif Zahranno (G1A025072)
3. Syafira Syifa A. (G1A025006)

*Kelas:* B  
*Dosen Pengampu:* Ir. Arie Vatresia, S.T., M.TI., Ph.D  
*Mata Kuliah:* Komputer Pemrograman  
*Semester:* 1  

---

### PROGRAM STUDI INFORMATIKA  
### FAKULTAS TEKNIK  
### UNIVERSITAS BENGKULU  
### 2025  

---

## OVERVIEW STUDI KASUS 1 : MANAJEMEN NILAI MAHASISWA

Studi kasus ini membahas pembuatan sistem sederhana untuk mengelola nilai mahasiswa. Program dibuat agar dosen dapat dengan mudah menyimpan data mahasiswa, menghitung nilai rata-rata, dan menentukan apakah mahasiswa tersebut lulus atau tidak berdasarkan nilai yang diperoleh.

Program ini dikembangkan menggunakan *bahasa pemrograman Java* dengan konsep *pemrograman berorientasi objek (OOP)*. Ada tiga kelas utama dalam program ini, yaitu Mahasiswa, Kelas, dan Main.

- *Kelas Mahasiswa* berfungsi untuk menyimpan data setiap mahasiswa seperti nama, NPM, nilai tugas, nilai UTS, dan nilai UAS. Di dalamnya juga terdapat method untuk menghitung nilai rata-rata dan menentukan status kelulusan berdasarkan nilai rata-rata minimal 75.

- *Kelas Kelas* digunakan untuk menampung beberapa objek mahasiswa dengan memanfaatkan ArrayList. Kelas ini memiliki method untuk menambahkan data mahasiswa dan menampilkan daftar seluruh mahasiswa beserta nilai rata-rata serta status kelulusannya.

- *Kelas Main* menjadi bagian utama program yang berinteraksi langsung dengan pengguna. Pengguna dapat memasukkan jumlah mahasiswa, menginput data nilai masing-masing, lalu program menampilkan hasil rata-rata serta status kelulusan setiap mahasiswa.

Melalui studi kasus ini, mahasiswa belajar cara membuat kelas dan objek di Java, menggunakan konstruktor, method, serta logika dasar seperti perulangan dan pengkondisian if-else. Selain itu, proyek ini melatih kemampuan berpikir logis dalam merancang sistem sederhana yang terstruktur dan mudah dipahami.

---

## DESKRIPSI PROGRAM

Program ini menerima input berupa:
- Jumlah mahasiswa yang ingin dimasukkan  
- Data setiap mahasiswa: *Nama*, *NPM*, *Nilai Tugas*, *Nilai UTS*, dan *Nilai UAS*  

Setelah semua data diinput, sistem akan menampilkan hasil perhitungan rata-rata nilai dari tiga komponen tersebut. Kemudian, program akan menentukan apakah mahasiswa dinyatakan *Lulus* atau *Tidak Lulus* berdasarkan kriteria rata-rata ≥ 75.

## CONTOH OUTPUT

Masukkan jumlah mahasiswa: 3

---

Mahasiswa ke-1<br>
Nama: M. Syamsul Fatah<br>
NPM: G1A025012<br>
Nilai Tugas: 80<br>
Nilai UTS: 75<br>
Nilai UAS: 85<br>

Mahasiswa ke-2<br>
Nama: Riangga Rafif Z.<br>
NPM: G1A025072<br>
Nilai Tugas: 60<br>
Nilai UTS: 70<br>
Nilai UAS: 65<br>

Mahasiswa ke-3<br>
Nama: Syafira Syifa A.<br>
NPM: G1A025006<br>
Nilai Tugas: 60<br>
Nilai UTS: 70<br>
Nilai UAS: 65<br>

---

Daftar Nilai Mahasiswa<br>
Nama     : M. Syamsul Fatah<br>
NPM      : G1A025012<br>
Rata-rata: 80.00<br>
Status   : Lulus<br>

Nama     : Riangga Rafif Z.<br>
NPM      : G1A025072<br>
Rata-rata: 65.00<br>
Status   : Tidak Lulus<br>

Nama     : Syafira Syifa A.<br>
NPM      : G1A025006<br>
Rata-rata: 65.00<br>
Status   : Tidak Lulus<br>

---

Program ini dibuat untuk memenuhi tugas UTS mata kuliah Komputer Pemrograman Semester 1 Universitas Bengkulu.
