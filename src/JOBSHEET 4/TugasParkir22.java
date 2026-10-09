import java.util.Scanner;

public class TugasParkir22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);

        System.out.println("Masukkan Lama Parkir: ");
        int lama_parkir = zer.nextInt();

        int tarif_dasar = 2000;

        if (lama_parkir > 2) {
            int total_tarif =  tarif_dasar+(lama_parkir-2)*1000;           
            System.out.println("total tarif: Rp. " + total_tarif);
        } else {
            System.out.println("total tarif: Rp.  " + tarif_dasar);
        }
        
    }
    
}
