package jobsheet8;

import java.util.Scanner;

public class tugas1_22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);

        System.out.print("Masukkan n: ");
        int n = zer.nextInt();
        

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(i);
        }
        int total = n*(n+1)/2;
        System.out.println("Total angka tercetak: "+total);
    }
}
