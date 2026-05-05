package Latihan;
import java.util.Scanner;

public class P7_Latihan2 {
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
         System.out.println("Masukan Nama Hewan : (1/2/3/4/5)");
         int Hewan = input.nextInt();
         input.nextLine();
         
         switch (Hewan) {
             case 1:
                 System.out.println("Ayam");
                 break;
             case 2:
                 System.out.println("Sapi");
                 break;
             case 3 :
                 System.out.println("Kuda");
                 break;
             case 4 :
                 System.out.println("Kambing");
                 break;
             case 5 :
                 System.out.println("Rusa");
                 break;
             default:
                 System.out.println("Pilihan Tidak ada");
                 break; 
         }

       input.close();

    }
     
     
}
