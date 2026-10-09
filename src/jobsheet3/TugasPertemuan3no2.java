package jobsheet3;
import java.util.Scanner;

public class TugasPertemuan3no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lmbr_dok, total_biaya, biaya_cetak = 500, biaya_penjilidan = 5000;

        System.out.println("Masukkan banyak dokumen: ");
        lmbr_dok = sc.nextInt();

        total_biaya = (lmbr_dok * biaya_cetak) + biaya_penjilidan;

        System.out.println("Total biaya yang harus dibayar: Rp. " + total_biaya);
    }
}