//harga kopi = 10000 + (22 mod 5) * 1000 = 12000
//harga teh = 5000 + (22 mod 4) * 1000 = 7000
//harga roti = 15000 + (22 mod 6) * 1000 = 19000
package jobsheet7;

import java.util.Scanner;

public class kafeDoWhile22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi,teh,roti,totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 19000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("Total yang harus dibayar: Rp. " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
        
    }
}
