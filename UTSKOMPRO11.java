import java.util.ArrayList;
import java.util.Scanner;

public class nilaimahasiswa {
    static class Mahasiswa {
        private String nama;
        private String npm;
        private double nilaiTugas;
        private double nilaiUTS;
        private double nilaiUAS;

        public Mahasiswa(String a, String b, double c, double d, double e) {
            nama = a;
            npm = b;
            nilaiTugas = c;
            nilaiUTS = d;
            nilaiUAS = e;
        }

        public String getNama() {
            return nama;
        }

        public String getnpm() {
            return npm;
        }

        public double hitungRataRata() {
            return (nilaiTugas + nilaiUTS + nilaiUAS) / 3.0;
        }

        public boolean isLulus() {
            return hitungRataRata() >= 75;
        }

        public String getNpm() {
            return npm;
        }
    }
    static class Kelas {
        private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        public void tambahMahasiswa(Mahasiswa m) {
            daftarMahasiswa.add(m);
        }
        public void tampilkanDaftarMahasiswa() {
            System.out.println("\nDaftar Nilai Mahasiswa");
            for (Mahasiswa m : daftarMahasiswa) {
                System.out.println("Nama     : " + m.getNama());
                System.out.println("NPM      : " + m.getNpm());
                System.out.println("Rata-rata: " + String.format("%.2f", m.hitungRataRata()));
                System.out.println("Status   : " + (m.isLulus() ? "Lulus" : "Tidak Lulus"));
                System.out.println(" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kelas kelas = new Kelas();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("NPM: ");
            String npm = input.nextLine();

            System.out.print("Nilai Tugas: ");
            double tugas = input.nextDouble();

            System.out.print("Nilai UTS: ");
            double uts = input.nextDouble();

            System.out.print("Nilai UAS: ");
            double uas = input.nextDouble();
            input.nextLine();

            Mahasiswa m = new Mahasiswa(nama, npm, tugas, uts, uas);
            kelas.tambahMahasiswa(m);
        }
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("");
        kelas.tampilkanDaftarMahasiswa();
    }
}
