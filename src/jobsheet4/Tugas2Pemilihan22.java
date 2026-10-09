package jobsheet4;
import java.util.Scanner;

public class Tugas2Pemilihan22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);

        int jumlahSks;
        System.out.print("Masukkan jumlah KRS: ");
        jumlahSks = zer.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
    }   
}
