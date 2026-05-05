package Latihan;
import java.util.Scanner;
public class P7_Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input Piliahan : ");
        int Pilih = input.nextInt();
        input.nextLine();
        
        if(Pilih == 1){
            System.out.println("Masukan Nama : ");
            String nama = input.nextLine();
            
            System.out.println("Masukan Jurusan");
            String Jurusan = input.nextLine();
            System.out.println("Nama : " + nama);
            System.out.println("Jurusan : " + Jurusan);
            }else {
            System.out.println("Pilihan Mu Adalah : " + Pilih);
            }
            System.out.println("System Selsesai.");
        input.close();
    }
    
    
}
