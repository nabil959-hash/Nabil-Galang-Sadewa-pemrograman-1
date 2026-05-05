package Tugas;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        int hadir = 0;
        int tugas = 0, uts = 0, uas = 0;
        double nilaiKehadiran = 0;
        double nilaiAkhir = 0;

        System.out.println("1. Input Nilai");
        System.out.println("2. Cetak Nilai");
        System.out.print("Pilih: ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1:
                do {
                    System.out.print("Masukkan jumlah kehadiran (max 21): ");
                    hadir = input.nextInt();

                    if (hadir < 18) {
                        System.out.println("Kehadiran kurang! minimal 18.\n");
                    }

                } while (hadir < 18);

                nilaiKehadiran = hadir / 21.0 * 100;
                do {
                    System.out.print("Masukkan Nilai Tugas: ");
                    tugas = input.nextInt();

                    System.out.print("Masukkan Nilai UTS: ");
                    uts = input.nextInt();

                    System.out.print("Masukkan Nilai UAS: ");
                    uas = input.nextInt();

                    nilaiAkhir = (0.10 * nilaiKehadiran)
                               + (0.20 * tugas)
                               + (0.30 * uts)
                               + (0.40 * uas);

                    System.out.println("Nilai Akhir: " + (int)nilaiAkhir);

                    if (nilaiAkhir < 75) {
                        System.out.println("Nilai kurang, silakan remed!\n");
                    }

                } while (nilaiAkhir < 75);

                System.out.println("Selamat, Anda LULUS!");
                break;

            case 2:
                System.out.println("=== HASIL ===");
                System.out.println("Jumlah Hadir: " + hadir);
                System.out.println("Nilai Kehadiran: " + nilaiKehadiran);
                System.out.println("Nilai Tugas: " + tugas);
                System.out.println("Nilai UTS: " + uts);
                System.out.println("Nilai UAS: " + uas);
                System.out.println("Nilai Akhir: " +  (int)nilaiAkhir);
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
