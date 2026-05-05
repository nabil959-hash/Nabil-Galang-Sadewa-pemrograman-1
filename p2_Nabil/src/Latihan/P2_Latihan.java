package Latihan;
import java.util.Scanner;

public class P2_Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama; int Usia;

        System.out.println("Input Nama : ");
        nama = input.nextLine();

        System.out.println("Input Usia : ");
        Usia = input.nextInt();

        System.out.println("NAMA : " + nama);
        System.out.println("USIA : " + Usia);

        input.close();
        }
    }
