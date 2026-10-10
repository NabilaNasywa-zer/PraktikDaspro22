package jobsheet6;
import java.util.Scanner;

public class StudiKasus1_22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);
        int hargaPerCup = 18_000;

        System.out.print("Masukkan jumlah cup\t:  ");
        int jumlahCup = zer.nextInt();

        System.out.print("Masukkan uang bayar\t: Rp. " );
        int uangBayar = zer.nextInt();

        int totalHarga = jumlahCup * hargaPerCup;
        System.out.print("Total harga\t\t: Rp. " + totalHarga);

        int diskon = 0;
        System.out.println("\nDiskon\t\t\t: Rp. " + diskon);
        
        int totalBayar;
        if (totalHarga>=100_000) {
            diskon = totalHarga * 10/100;
            totalBayar = totalHarga - diskon;
        } else {
            totalBayar = totalHarga - diskon;
        }
        System.out.println("Total bayar\t\t: Rp. " + totalBayar);
        int kembalian = uangBayar - totalBayar;            
        int kurang = totalBayar - uangBayar;
        if (uangBayar >= totalBayar) {
            System.out.println(kembalian);
        } else {
            System.out.println("Uang tidak cukup, kurang Rp. " + kurang);   
        }
    }
    
}
