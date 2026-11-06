//Jumlah mahasiswa = 8 + (22 mod 5) = 10
package jobsheet7;
import java.util.Scanner;

public class siakadFor22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai,  tertinggi = 0, terendah = 100;
        int lulus=0, tidak_lulus=0;

        for (
             int i = 0; i <= 3; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +i+": ");
            nilai = sc.nextDouble();
           
            if (nilai < terendah) {
                terendah = nilai;
            }
            
        }
        System.out.println("Nilai terendah : " + terendah);
       
    }
}
