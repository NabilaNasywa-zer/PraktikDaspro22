package jobsheet5;
import java.util.Scanner;

public class nestedAksesLab22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean mahasiswaAktif;
        mahasiswaAktif = sc.nextBoolean();
        
        boolean sedangDisanksi;
        sedangDisanksi = sc.nextBoolean();
        
        boolean punyaIzinDosen;
        punyaIzinDosen = sc.nextBoolean();
        
        boolean asistenLab;
        asistenLab = sc.nextBoolean();;

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhhkan izin dosen atau status assisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}
