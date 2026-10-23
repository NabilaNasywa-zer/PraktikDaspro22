//harga tikrt 40000 + (22 mod 6) * 2000 = 48000
//diskon pertama = lebih dari (3+(22 mod 3)) = 4 tiket, diskon (8 + (22 mod 5))% = 10%
//diskon kedua = lebih dari (8+(22 mod 4)) = 10 tiket, diskon (15+(22 mod 4))% = 17%
package jobsheet7;

import java.util.Scanner;

public class penjualanTiketBioskop22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);
        
        int harga_tiket = 48000, total_tiket=0, jumlah_tiket, banyak_pelanggan=0;
        double diskon=0, total_harga =0;

        System.out.print("Masukkan banyak pelanggan: ");
        banyak_pelanggan = zer.nextInt();

        for (int i = 0; i < banyak_pelanggan; i++) {
            System.out.print("Masukkan jumlah tiket pelanggan ke-"+(i+1)+" : ");
            jumlah_tiket = zer.nextInt();

            if (jumlah_tiket<0) {
                System.out.println("Nilai tidak valid");
                i--;
                continue;
            } else if (jumlah_tiket>=0) {
                diskon=0;
            } else if (jumlah_tiket>4 && jumlah_tiket<=10) {
                diskon = 0.10;
            } else if (jumlah_tiket>10){
                diskon = 0.17;
            }
            total_tiket+=jumlah_tiket;
            System.out.println("total tiket : " + total_tiket);
        }

        total_harga = harga_tiket-(diskon*harga_tiket);
        System.out.println("Total harga: " + total_harga);
    }   
}
