package jobsheet5;
import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
       Scanner zer = new Scanner(System.in);
       
       System.out.print("Masukkan merk: ");
       String merk = zer.nextLine();
       
       System.out.print("Masukkan Kategori: ");
       String kategori = zer.nextLine();
       
       System.out.println("Masukkan ukuran");
       int ukuran = zer.nextInt();

       int harga;

       if (merk.equalsIgnoreCase("converse") && kategori.equalsIgnoreCase("slip on") && ukuran >= 36 && ukuran <= 40) {
        if (merk.equalsIgnoreCase("sonverse") && kategori.equalsIgnoreCase("high top") && ukuran >=40 && ukuran <= 44) {
            harga = 800_000;
        } else {
                harga = 1_000_000;
        }
       } else {
            if (merk.equalsIgnoreCase("sketcher") && kategori.equalsIgnoreCase("woman")) {
                harga = 4_000_000;
            } else {
                harga = 900_000;
            }
       }
       System.out.println("yang  harus dibayar " + harga);
    }
}