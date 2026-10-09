package jobsheet5;
import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenis = zer.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        int jumlah_buku = zer.nextInt();

        System.out.print("Harga buku: ");
        int harga = zer.nextInt();

        double diskon = 0;
        //diskon dasar kamus = (8 + (22 mod 5))% = 10% = 0.10, diskon tetap = 2% = 0.02
        //jumlah buku = (2 + (22 mod 2)) = 2 
        //diskon dasar novel = (5 + (22 mod 4))% = 7% = 0.07, jika > 3 = 0.09, jika <= 3 = 0.08
        //Tambahan diskon: 2% = 0.02 (jika > 3) atau 1% = 0.01 (jika <= 3)
        //diskon dasar lainnnya = (3 + (22 mod 4))% = 5% = 0.05
        //(3 + (22 mod 2)) = 3 >

        if (jenis.equalsIgnoreCase("kamus")) {
            if (jumlah_buku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.10;
            }
        } else {
            if (jenis.equalsIgnoreCase("novel")) {
                if (jumlah_buku > 3) {
                    diskon = 0.09;
                } else if (jumlah_buku <= 3) {
                    diskon = 0.08;
                }
            } else {
                if (jenis.equalsIgnoreCase("lainnya") && jumlah_buku > 3) {
                    diskon = 0.05;
                } else {
                    diskon = 0;
                }
            }
            
        }
        int total_harga = jumlah_buku*harga;
        double total_diskon = total_harga*diskon;
        double total_biaya = total_harga - total_diskon;
        System.out.println("Total yang harus dibayar: RP. " + total_biaya);
    }
    
}
