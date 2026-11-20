//20 + (22 mod 60) = 42
package jobsheet9;

import java.util.Arrays;

public class sortNilai22 {
    public static void main(String[] args) {
        int[] nilai = {42, 57, 34, 72, 62, 47}; 
        for (int i = 0; i < nilai.length - 1; i++) { 
            for (int j = 0; j < nilai.length - 1 - i; j++) { 
                if (nilai[j] < nilai[j + 1]) { 
                    int temp = nilai[j]; 
                    nilai[j] = nilai[j + 1]; 
                    nilai[j + 1] = temp; 
                } 
            } 
        } 
        System.out.println(Arrays.toString(nilai));
    }
    
}
