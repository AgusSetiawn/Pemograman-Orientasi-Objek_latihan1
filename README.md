# Pemograman-Orientasi-Objek_latihan1

<h1>Pesawat Tempur Sederhana</h1>
Program sederhana ini mensimulasikan sebuah pesawat tempur dengan fungsi-fungsi dasar menggunakan paradigma prosedural/modular dalam bahasa pemrograman Java.

Data Pesawat
Program ini menyimpan data pesawat tempur berikut:

Warna: Warna pesawat.
Ketinggian: Ketinggian pesawat dari permukaan tanah.
Kecepatan: Kecepatan pesawat.
Energi: Tingkat energi yang dimiliki pesawat.
Arah: Arah hadap pesawat (misalnya: Utara, Selatan, Timur, Barat).
Fungsi Pesawat
Program ini menyediakan fungsi-fungsi berikut untuk mengontrol pesawat:

nyalakanMesin(): Menyalakan mesin pesawat.
terbang(): Membuat pesawat terbang.
tambahKecepatan(): Menambah kecepatan pesawat.
kurangiKecepatan(): Mengurangi kecepatan pesawat.
belok(arah): Merubah arah pesawat ke arah yang ditentukan.
turun(): Menurunkan ketinggian pesawat.
status(): Menampilkan status pesawat.
Cara Penggunaan
Pastikan Anda telah menginstal Java Development Kit (JDK) di sistem Anda.
Jalankan program dengan mengetikkan perintah javac PesawatTempur.java pada terminal atau command prompt untuk mengkompilasi program.
Jalankan program dengan mengetikkan perintah java PesawatTempur pada terminal atau command prompt untuk menjalankan program.
Program akan menampilkan status awal pesawat.
Anda dapat mengontrol pesawat dengan memanggil fungsi-fungsi yang tersedia.
Contoh Penggunaan
java

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
Kontribusi
Silahkan ajukan pull request jika Anda ingin berkontribusi untuk meningkatkan program ini.

Lisensi
Program ini disebarluaskan di bawah lisensi MIT.

Kode Java
java

Verify

Open In Editor
Edit
Copy code
public class PesawatTempur {

    // Data pesawat
    String warna;
    int ketinggian;
    int kecepatan;
    int energi;
    String arah;

    // Konstruktor
    public PesawatTempur(String warna) {
        this.warna = warna;
        this.ketinggian = 0;
        this.kecepatan = 0;
        this.energi = 100;
        this.arah = "Utara";
    }

    // Fungsi pesawat
    public void nyalakanMesin() {
        System.out.println("Mesin pesawat " + warna + " dinyalakan.");
    }

    public void terbang() {
        if (energi > 0) {
            System.out.println("Pesawat " + warna + " terbang.");
            ketinggian += 100;
            energi -= 5;
        } else {
            System.out.println("Energi habis, pesawat " + warna + " tidak bisa terbang.");
        }
    }

    public void tambahKecepatan() {
        if (energi > 0) {
            System.out.println("Kecepatan pesawat " + warna + " ditambah.");
            kecepatan += 10;
            energi -= 10;
        } else {
            System.out.println("Energi habis, pesawat " + warna + " tidak bisa menambah kecepatan.");
        }
    }

    public void kurangiKecepatan() {
        if (kecepatan > 0) {
            System.out.println("Kecepatan pesawat " + warna + " dikurangi.");
            kecepatan -= 10;
        } else {
            System.out.println("Pesawat " + warna + " sudah berhenti.");
        }
    }

    public void belok(String arahBaru) {
        this.arah = arahBaru;
        System.out