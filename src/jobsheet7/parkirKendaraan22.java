//Tarif parkir mobil = 2500 + (22 mod 6) × 250 per jam = 3500 
//Tarif parkir motor = 1500 + (22 mod 6) × 250 per jam = 2500
package jobsheet7;
import java.util.Scanner;

public class parkirKendaraan22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);

        int jenis, durasi, total=0;

        do {
            System.out.print("1. mobil\n2. motor\n0. keluar\nMasukkan jenis kendaraan: ");
            jenis = zer.nextInt();
            if (jenis==1 || jenis==2) {
                System.out.print("Masukkan durasi: ");
                durasi = zer.nextInt();
                if (jenis==1) {
                    total+=durasi*3500;
                } else {
                    total += durasi*2500;
                }
            }
        } while (jenis!=0);
        System.out.println("Total: " + total);
    }
}
