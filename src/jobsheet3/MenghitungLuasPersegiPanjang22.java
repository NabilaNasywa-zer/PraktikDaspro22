package jobsheet3;
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int panjang;
        int lebar;
        int luas;

        panjang = sc.nextInt();
        lebar = sc.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas persegi adalah " + luas);
    }
}