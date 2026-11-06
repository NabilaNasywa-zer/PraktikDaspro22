package jobsheet8;

import java.util.Scanner;

public class tugas2_22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = zer.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j*i + "\t");
            }
            System.out.println();
        }
    }

    
}
