package jobsheet4;
import java.util.Scanner;

public class Tugas1Pemilihan22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas?(true/false): ");
        boolean uktLunas = zer.nextBoolean();
        
              String pesan = (uktLunas) ? "Pembayaran UKT terverivikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
            System.out.println(pesan);
        
    }
}


//  if (uktLunas) {
//     System.out.println("Pembayaran UKT terverivikasi");
//     System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");       
// } else {
//     System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
// }
