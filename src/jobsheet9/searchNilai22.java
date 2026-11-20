//50 + (22 mod 50) = 72
package jobsheet9;

import java.util.Scanner;

public class searchNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen : ");
        int elemen = sc.nextInt();

        int[] nilai = new int[elemen];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa " + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = sc.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] ==  key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan: nilai " + key + " tidak ada di dalam " 
            + nilai.length + " data nilai yang diinput.");
        }
    }  
}
