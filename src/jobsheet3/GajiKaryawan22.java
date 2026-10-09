package jobsheet3;
import java.util.Scanner;

public class GajiKaryawan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        double bonus;
        int totGaji;
        double tunjTransp = 600000;
        double tunjMkn = 400000;

        gajiPokok = sc.nextInt();
        bonus = 0.5 * gajiPokok;
        
        // Melakukan explicit casting (int) untuk menyimpan hasil perhitungan float/double
        totGaji = (int) (gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok));

        System.out.println("Bonus bulanan yang anda terima adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + totGaji);
    }
}