package jobsheet3;
import java.util.Scanner;

public class TugasPertemuan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga, uang_muka, bulan;
        double bunga = 0.02, jml_cicilan;

        System.out.println("Masukkan harga laptop: ");
        harga = sc.nextInt();

        System.out.println("Masukkan jumlah uang muka: ");
        uang_muka = sc.nextInt();

        System.out.println("Masukkan lama bulan: ");
        bulan = sc.nextInt();

        // Rumus penyesuaian bunga cicilan
        jml_cicilan = ((harga - uang_muka) / (double) bulan) * bunga;

        System.out.println("Jumlah cicilan: Rp. " + jml_cicilan);
    }
}