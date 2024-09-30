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
        System.out.println("------------------------");
    }

    // Fungsi pesawat
    public void nyalakanMesin() {
        System.out.println("------------------------");
        System.out.println(">> Mesin pesawat " + warna + " dinyalakan.");
    }

    public void terbang() {
        if (energi > 0) {
            System.out.println(">> Pesawat " + warna + " terbang.");
            ketinggian += 100;
            energi -= 5;
        } else {
            System.out.println("Energi habis, pesawat " + warna + " tidak bisa terbang.");
        }
    }

    public void tambahKecepatan() {
        if (energi > 0) {
            System.out.println(">> Kecepatan pesawat " + warna + " ditambah.");
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
        System.out.println(">> Pesawat " + warna + " berbelok ke arah " + arah + ".");
    }

    public void turun() {
        if (ketinggian > 0) {
            System.out.println(">> Pesawat " + warna + " turun.");
            ketinggian -= 50;
        } else {
            System.out.println("Pesawat " + warna + " sudah di landasan.");
        }
        System.out.println("------------------------");
    }

    public void status() {
        System.out.println("Status pesawat " + warna + ":");
        System.out.println("Ketinggian: " + ketinggian + " meter");
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Energi: " + energi + "%");
        System.out.println("Arah: " + arah);
    }

    public static void main(String[] args) {
        // Buat objek pesawat
        PesawatTempur pesawatMerah = new PesawatTempur("Merah");

        // Tampilkan status awal
        pesawatMerah.status();

        // Jalankan fungsi pesawat
        pesawatMerah.nyalakanMesin();
        pesawatMerah.terbang();
        pesawatMerah.tambahKecepatan();
        pesawatMerah.belok("Timur");
        pesawatMerah.turun();

        // Tampilkan status akhir
        pesawatMerah.status();
        System.out.println("------------------------");
    }
}