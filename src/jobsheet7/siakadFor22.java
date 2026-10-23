//Jumlah mahasiswa = 8 + (22 mod 5) = 10
package jobsheet7;
import java.util.Scanner;

public class siakadFor22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai,  tertinggi = 0, terendah = 100;
        int lulus=0, tidak_lulus=0;

        for (
             int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +i+": ");
            nilai = sc.nextDouble();
            if (nilai>tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai>=55) {
                lulus++;
            } else {
                tidak_lulus++;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Lulus: " + lulus);
        System.out.println("Tidak Lulus: " + tidak_lulus);
    }
}
