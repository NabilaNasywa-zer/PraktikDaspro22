package jobsheet5;
import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);

        System.out.print("Bilangan 1: ");
        int bil1 = zer.nextInt();

        System.out.print("Bilangan 2: ");
        int bil2 = zer.nextInt();

        System.out.print("Bilangan 3: ");
        int bil3 = zer.nextInt();
        
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar" + bil1);
            } else {
                System.out.println("Bilangan terbesar: " + bil3);
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar: " + bil2);
            } else {
                System.out.println("Bilangan terbesar: " + bil3);
            }
            
        }
    }
}
