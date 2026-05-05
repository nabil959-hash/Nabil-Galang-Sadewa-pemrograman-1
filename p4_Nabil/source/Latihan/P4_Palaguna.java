package Latihan;
import java.util.Scanner;

public class P4_Palaguna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println("realisasi Pertemuan adalah : ");
        int realisasi = input.nextInt();

        System.out.println("Masukan Jumlah Kehadiran Anda : ");
        double Kehadiran = input.nextInt();
        input.nextLine();

        System.out.println("Masukan Nilai Tugas Anda : ");
        int Tugas = input.nextInt();
        input.nextLine();

        System.out.println("Masukan Nilai UTS Anda : ");
        int UTS = input.nextInt();
        input.nextLine();

        System.out.println("Masukan Nilai UAS Anda : ");
        int UAS = input.nextInt();
        input.nextLine();


        //OLAH DATA

        double NilaiKehadiran =  Kehadiran / realisasi * 100;

        //kehadiran 10%, tugas 20%, UTS 30%, UAS 40%
        double NilaiAkhir = (0.10 * NilaiKehadiran) + (0.20 * Tugas) + (0.30 * UTS) + (0.40 * UAS);
        
        //OUTPUT

        System.out.println("HASIL NILAI AKHIR DARI MAHASISWA ");
        System.out.println("Kehadiran Anda: " +(int) Kehadiran + " Dari " + realisasi );
        System.out.println("Nilai Tugas: " + (int)Tugas);
        System.out.println("Nilai UTS: " + (int)UTS);
        System.out.println("Nilai UAS: " + (int)UAS);
        System.out.println("Nilai Akhir: " + (int)NilaiAkhir);


        input.close();
    }
    
}
