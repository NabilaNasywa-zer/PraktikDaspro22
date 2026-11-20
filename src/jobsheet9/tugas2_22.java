//(2 + (22 mod 4)) = 4
//22 mod 7 = 1
package jobsheet9;

import java.util.Scanner;

public class tugas2_22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);
        Scanner zerI = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        String pesananMenu;
        boolean ditemukan = false;

        System.out.println("======= CAFE KAMPUS =======");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + ", Harga : Rp. " + harga[i]);
        } 

        System.out.println("=============================");
        System.out.print("Jumlah menu yang akan dipesan : ");
        int jmlMenu = zerI.nextInt();

        String[] pesanan = new String[jmlMenu];
        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("Masukkan nama menu " + (i + 1) + " : ");
            pesanan[i] = zer.nextLine();
        }
        
        int totalharga = 0;
        for (int j = 0; j < pesanan.length; j++) {
            ditemukan = false;
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(pesanan[j])) {
                    totalharga += harga[i];
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Menu " + pesanan[j] + " tidak ditemukan");
            }
        }
        System.out.println("Total harga : Rp. " + totalharga);
    }
}