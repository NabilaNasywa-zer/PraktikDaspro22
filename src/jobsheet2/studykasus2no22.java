package jobsheet2;

import java.util.Scanner;

public class studykasus2no22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lebar, panjang, diameter, panjang_sisi, tot_luas_pers, tot_luas_tanah;
        double tot_luas_tanah_tidak_digunakan, tot_luas_ling, phi = 3.14;

        System.out.println("Lebar tanah: ");
        lebar = input.nextInt();
        System.out.println("Panjang tanah: ");
        panjang = input.nextInt();
        System.out.println("Diameter kolam: ");
        diameter = input.nextInt();
        System.out.println("Panjang sisi taman: ");
        panjang_sisi = input.nextInt();

        tot_luas_tanah = panjang * lebar;
        tot_luas_ling = phi * (diameter / 2.0) * (diameter / 2.0); // Disesuaikan dengan rumus luas lingkaran
        tot_luas_pers = panjang_sisi * panjang_sisi;
        tot_luas_tanah_tidak_digunakan = tot_luas_tanah - tot_luas_ling - tot_luas_pers;

        System.out.println("Luas sisa tanah: " + tot_luas_tanah_tidak_digunakan + "m");
    }
}