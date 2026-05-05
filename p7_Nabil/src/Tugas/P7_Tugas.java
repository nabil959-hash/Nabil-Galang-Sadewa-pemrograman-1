package Tugas;
import java.util.Scanner;

public class P7_Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("Input Pilihan : ");
int Pilih = input.nextInt();
input.nextLine();

System.out.println("Masukan Nama : ");
String nama = input.nextLine();

System.out.println("Masukan Jurusan : ");
String jurusan = input.nextLine();

System.out.println("Masukan Waktu Kuliah Mu : ");
int waktu = input.nextInt();

switch (waktu) {
    case 1: System.out.println("REG A"); break;
    case 2: System.out.println("REG B"); break;
    case 3: System.out.println("REG C"); break;
    case 4: System.out.println("REG CS"); break;
    case 5: System.out.println("REG CK"); break;
    default: System.out.println("Pilihan Tidak ada");
}


        System.out.println("System Selesai.");
        input.close();
    }
}