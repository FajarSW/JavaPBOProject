# JavaPBOProject

Deskripsi Program:
Program ini adalah sebuah sistem manajemen pegawai yang ditulis dalam bahasa pemrograman Java. Program ini memanfaatkan konsep Pemrograman Berorientasi Objek (PBO) untuk mengelola informasi tentang pegawai dalam sebuah perusahaan. Program ini memungkinkan pengguna untuk menambahkan pegawai ke dalam departemen, menghitung total gaji untuk departemen tersebut, dan menampilkan informasi lengkap tentang semua pegawai dalam departemen.

Penjelasan Program:
1.	Kelas Pegawai (Pegawai), Manajer (Manajer), dan Programmer (Programmer):
•	Ketiga kelas ini mewakili jenis pegawai yang berbeda dalam perusahaan.
•	Setiap kelas memiliki atribut seperti nama, posisi, dan gaji pokok, serta metode untuk menghitung gaji berdasarkan atribut tersebut.
•	Kelas Manajer dan Programmer merupakan subkelas dari Pegawai dan mewarisi atribut dan metode dari kelas Pegawai.
2.	Interface Bayar (Bayar):
•	Interface ini menyediakan metode hitungGaji() yang harus diimplementasikan oleh kelas-kelas yang mewakili pegawai.
•	Interface ini memungkinkan kita untuk menetapkan polimorfisme pada kelas-kelas pegawai.
3.	Kelas Departemen (Departemen):
•	Kelas ini merepresentasikan sebuah departemen dalam perusahaan.
•	Departemen memiliki nama dan daftar pegawai yang merupakan anggotanya.
•	Kelas ini memiliki metode untuk menambahkan pegawai ke dalam departemen, menghitung total gaji untuk semua pegawai dalam departemen, dan menampilkan informasi lengkap tentang semua pegawai dalam departemen.
4.	Kelas Utama (SistemManajemenPegawai):
•	Kelas ini adalah titik masuk utama program.
•	Di dalam metode main(), beberapa objek pegawai dibuat dan ditambahkan ke dalam departemen IT.
•	Informasi tentang pegawai dan total gaji untuk departemen IT kemudian ditampilkan.
Program ini memanfaatkan konsep-konsep dasar PBO seperti enkapsulasi, pewarisan, polimorfisme, dan penggunaan interface. Ini membuat program menjadi modular, mudah dipahami, dan mudah dikembangkan untuk kebutuhan yang lebih kompleks di masa depan.

