//60 + (22 mod 41) = 82
package jobsheet9;

import java.util.Scanner;

public class arraynilai22 {
    public static void main(String[] args) {

        int[] nilaiAkhir = new int[10]; 
        Scanner input = new Scanner(System.in); 

        for (int i = 0; i < nilaiAkhir.length; i++) { 
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": "); 
        nilaiAkhir[i] = input.nextInt(); 
        } 

        for (int i = 0; i < nilaiAkhir.length; i++) { 
        String status;
        if (nilaiAkhir[i] > 70) {
            status = "LULUS";
        } else {
            continue;
        }
        System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + 
        status + ")"); 
        } 
    }
}
