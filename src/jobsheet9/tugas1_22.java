//(5 + (22 mod 11)) = 5
// (22 mod 100) = 22
package jobsheet9;

import java.util.Arrays;
import java.util.Scanner;

public class tugas1_22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);

        int nilaiMhs[] = new int[5];
        int totNilai = 0;
        double rata = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = zer.nextInt();
            totNilai += nilaiMhs[i];
        }
        rata = totNilai/nilaiMhs.length;

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 0; i < nilaiMhs.length; i++) {
            if(nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
            if(nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
        }
         int lulus = 0, tdkLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) { 
        String status;
        if (nilaiMhs[i] > 70) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }
        
        System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + " (" + 
        status + ")");
    }
    System.out.println(Arrays.toString(nilaiMhs));
    System.out.println("Rata rata : " + rata);
    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai terendah: " + terendah);
    }
    
}
