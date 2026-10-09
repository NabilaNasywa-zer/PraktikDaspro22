package jobsheet4;
import java.util.Scanner;

public class TugasAntrean22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);
        System.out.println("---Layanan Antre Digital---");
        System.out.println("1. Legalisir Ijazah");
        System.out.println("2. Surat Keterangan Aktif Kuliah");
        System.out.println("3. Pembayaran UKT");
        System.out.println("4. Pengajuan Cuti Akademik");
        System.out.print("Masukkann Pilihan: ");
        int layanan = zer.nextInt();

        switch (layanan) {
            case 1:
                System.out.println("loket A");
                break;
            case 2:
                System.out.println("loket B");
                break;
            case 3:
                System.out.println("loket C");
                break;
            case 4:
                System.out.println("loket D");
                break;

            default:
                System.out.println("kode layanan tidak tersedia");
                break;
        }
    }   
}
