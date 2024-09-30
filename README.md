# Pemograman-Orientasi-Objek_latihan1
<br>
<h1>Pesawat Tempur Sederhana</h1>
Program sederhana ini mensimulasikan sebuah pesawat tempur dengan fungsi-fungsi dasar menggunakan paradigma prosedural/modular dalam bahasa pemrograman Java.

<h2>Soal</h2>

![img](dokumentasi1/latihan1_page-0001.jpg)

<h3>Data Pesawat</h3>

<p>Program ini menyimpan data pesawat tempur berikut:</br> 
Warna: Warna pesawat.</br>
Ketinggian: Ketinggian pesawat dari permukaan tanah.</br>
Kecepatan: Kecepatan pesawat.</br>
Energi: Tingkat energi yang dimiliki pesawat.</br>
Arah: Arah hadap pesawat (misalnya: Utara, Selatan, Timur, Barat).</br>
</p>

<h3>Fungsi Pesawat</h3>

<p>Program ini menyediakan fungsi-fungsi berikut untuk mengontrol pesawat:

nyalakanMesin(): Menyalakan mesin pesawat.</br>
terbang(): Membuat pesawat terbang.</br>
tambahKecepatan(): Menambah kecepatan pesawat.</br>
kurangiKecepatan(): Mengurangi kecepatan pesawat.</br>
belok(arah): Merubah arah pesawat ke arah yang ditentukan.</br>
turun(): Menurunkan ketinggian pesawat.</br>
status(): Menampilkan status pesawat.</p></br>

<h1>Cara Penggunaan</h1>

Pastikan Anda telah menginstal Java Development Kit (JDK) di sistem Anda.
Jalankan program dengan mengetikkan perintah javac PesawatTempur.java pada terminal atau command prompt untuk mengkompilasi program.
Jalankan program dengan mengetikkan perintah java PesawatTempur pada terminal atau command prompt untuk menjalankan program.
Program akan menampilkan status awal pesawat.
Anda dapat mengontrol pesawat dengan memanggil fungsi-fungsi yang tersedia.

<h1>Contoh Penggunaan</h1>

<h2>java</h2>

Verify

Open In Editor
Edit
Copy code
// Menyalakan mesin pesawat
nyalakanMesin();

// Menambah kecepatan pesawat
tambahKecepatan();

// Merubah arah pesawat ke utara
belok("Utara");

// Menurunkan ketinggian pesawat
turun();

// Menampilkan status pesawat
status();
