import java.util.ArrayList;
import java.util.List;

// Interface
interface Bayar {
    double hitungGaji();
}

// Kelas Induk
class Pegawai implements Bayar {
    private String nama;
    private String posisi;
    private double gajiPokok;

    public Pegawai(String nama, String posisi, double gajiPokok) {
        this.nama = nama;
        this.posisi = posisi;
        this.gajiPokok = gajiPokok;
    }

    // Encapsulation
    public String getNama() {
        return nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Posisi: " + posisi;
    }
}

// Subkelas
class Manajer extends Pegawai {
    private double bonus;

    public Manajer(String nama, String posisi, double gajiPokok, double bonus) {
        super(nama, posisi, gajiPokok);
        this.bonus = bonus;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + bonus;
    }
}

// Subkelas
class Programmer extends Pegawai {
    private int jumlahBarisKode;

    public Programmer(String nama, String posisi, double gajiPokok, int jumlahBarisKode) {
        super(nama, posisi, gajiPokok);
        this.jumlahBarisKode = jumlahBarisKode;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + (jumlahBarisKode * 0.1); // Contoh perhitungan
    }

    @Override
    public String toString() {
        return super.toString() + ", Jumlah Baris Kode: " + jumlahBarisKode;
    }
}

// Kelas untuk merepresentasikan sebuah departemen
class Departemen {
    private String nama;
    private List<Pegawai> pegawaiList;

    public Departemen(String nama) {
        this.nama = nama;
        this.pegawaiList = new ArrayList<>();
    }

    public void tambahPegawai(Pegawai pegawai) {
        pegawaiList.add(pegawai);
    }

    public double hitungTotalGaji() {
        double totalGaji = 0;
        for (Pegawai pegawai : pegawaiList) {
            totalGaji += pegawai.hitungGaji();
        }
        return totalGaji;
    }

    public void tampilkanInfoPegawai() {
        System.out.println("Pegawai di departemen " + nama + ":");
        for (Pegawai pegawai : pegawaiList) {
            System.out.println(pegawai);
        }
    }

    public String getNama() {
        return nama;
    }
}

public class SistemManajemenPegawai {
    public static void main(String[] args) {
        // Encapsulation, Inheritance
        Pegawai pegawai1 = new Pegawai("Fajar Satria Wiguna", "Insinyur Perangkat Lunak", 25000000);
        Manajer manajer1 = new Manajer("Aghiz Ghifari", "Manajer Proyek", 15000000, 3500000);
        Programmer programmer1 = new Programmer("Angga Gustian", "Programmer Senior", 16000000, 2500000);

        // Menambahkan pegawai ke sebuah departemen
        Departemen departemenIT = new Departemen("Departemen IT");
        departemenIT.tambahPegawai(pegawai1);
        departemenIT.tambahPegawai(manajer1);
        departemenIT.tambahPegawai(programmer1);

        // Menampilkan informasi pegawai dan total gaji untuk departemen tersebut
        departemenIT.tampilkanInfoPegawai();
        System.out.println("Total Gaji untuk " + departemenIT.getNama() + ": Rp " + departemenIT.hitungTotalGaji());
    }
}
