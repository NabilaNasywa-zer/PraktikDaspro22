package jobsheet2;
import java.util.Scanner;

public class studykasus1no22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gaji_pokok, tunjangan_anak, jumlah_anak, total_tunjangan_anak;
        double potongan_dana_pensiun = 0.1, total_dana_pensiun, total_akhir_gaji_bersih;

        System.out.println("masukkan jumlah gaji pokok: ");
        gaji_pokok = input.nextInt();
        System.out.println("masukkan tunjangan anak: ");
        tunjangan_anak = input.nextInt();
        System.out.println("masukkan jumlah anak: ");
        jumlah_anak = input.nextInt();

        total_tunjangan_anak = tunjangan_anak * jumlah_anak;
        total_dana_pensiun = gaji_pokok * potongan_dana_pensiun;
        total_akhir_gaji_bersih = gaji_pokok + total_tunjangan_anak - total_dana_pensiun;

        System.out.println("gaji bersih: Rp. " + total_akhir_gaji_bersih);
    }
}