package jobsheet6;
import java.util.Scanner;

public class StudiKasus2_22 {
    public static void main(String[] args) {
        //komen
        Scanner zer = new Scanner(System.in);

        System.out.print("Nama Mahasiswa\t: ");
        String namaMahasiswa = zer.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA)\t: ");
        String jenisKegiatan = zer.nextLine();
        
        System.out.print("Jumlah dokumen\t: ");
        int jumlahDokumen = zer.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("belmawa")
            ||jenisKegiatan.equalsIgnoreCase("bakorma")
            ||jenisKegiatan.equalsIgnoreCase("mandiri")) {
            System.out.print("Peringkat juara\t: ");
            int peringkatJuara = zer.nextInt();
            if (jumlahDokumen==4 && peringkatJuara>0 && peringkatJuara<4) {
                System.out.print("Status :  Dokumen lengkap. Dana penghargaan diberikan");
            } else if (jumlahDokumen>=0 && jumlahDokumen<4) {
                System.out.print("Status : Dokumen tidak lengkap (kurang " + (4-jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan");
            } else if (peringkatJuara==0 || peringkatJuara>3) {
                System.out.print("Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
        } else {
            
        }
    }
}
