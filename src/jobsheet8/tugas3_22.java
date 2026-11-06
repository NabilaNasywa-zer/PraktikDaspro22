package jobsheet8;
import java.util.Scanner;

public class tugas3_22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);

        int jumlahToko = 1, 
        jumlahPelanggan = 0, 
        jumlahBarang,
        totalBarang = 0, barangPerToko = -1, tokoTerbanyak = 0;
        do {
            System.out.print("Masukkan jumlah toko : ");
            jumlahToko = zer.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Silahkan input ulang!");
            }
        } while (jumlahToko < 1);

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("================");
            System.out.print("Toko " + i + " - ");
                do {
                    System.out.print("Pelanggan : ");
                    jumlahPelanggan = zer.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("Jumlah pelanggan tidak boleh negatif. Silahkan input ulang!");
                    }
                } while (jumlahPelanggan < 0);

                do {
                    System.out.print("Jumlah barang : ");
                    jumlahBarang = zer.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif. Silahkan input ulang!");
                    }
                } while (jumlahBarang < 0);
                
                totalBarang += jumlahBarang;

                 if (totalBarang > barangPerToko) {
                    barangPerToko = totalBarang;
                    tokoTerbanyak = i;
                 }
        }
        System.out.println("==================================");
        System.out.println("Total barang : " + totalBarang);
        System.out.println("Toko dengan barang terbanyak : " + tokoTerbanyak);
    }
}