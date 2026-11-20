//22 ; 22+8 ; −(1+(22 mod 7)) ; 20+(22 mod 15) = 22 ; 30 ; -2 ; 27
package jobsheet9;

import java.util.Arrays;

public class arraybilanggan22 {
    public static void main(String[] args) {
        
    int[] bil = new int[4];
    
    bil[0] = 22;
    bil[1] = 30;
    bil[2] = -2;
    bil[3] = 27;
    
    for (int i = 0; i < bil.length; i++) {
        System.out.println("bil [" + i + "] = " + bil[i]);
    }
    
    for (int nilai : bil) {
        System.out.println(nilai);
    }
    
     System.out.println(Arrays.toString(bil));

    }
}
