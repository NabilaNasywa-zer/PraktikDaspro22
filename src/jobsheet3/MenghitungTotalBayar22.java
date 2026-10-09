package jobsheet3;
import java.util.Scanner;

public class MenghitungTotalBayar22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        harga = sc.nextDouble(); // Menggunakan double agar fleksibel menerima tipe data desimal/integer

        potongan = diskon * harga;
        jml_bayar = harga - potongan;

        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);
    }
}