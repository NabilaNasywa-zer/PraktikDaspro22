import java.util.Scanner;

public class pemilihanIfElse22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);

        System.out.println("---Cetak KRS---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = zer.nextInt();

        if (semester == 1) {
            System.out.println("KRS semester 1 ditampilkan");
        } else if (semester == 2) {
            System.out.println("KRS Semester 2 ditampilkan");
        } else if (semester == 3) {
            System.out.println("KRS Semester 3 ditampilkan");
        } else if (semester == 4) {
            System.out.println("KRS Semester 4 ditampilkan");
        } else if (semester == 5) {
            System.out.println("KRS Semester 5 ditampilkan");
        } else if (semester == 6) {
            System.out.println("KRS Semester 6 ditampilkan");
        } else if (semester == 7) {
            System.out.println("KRS Semester 7 ditampilkan");
        } else if (semester == 8) {
            System.out.println("KRS Semester 8 ditampilkan");
        } else {
            System.out.println("Semester tidak valid");
        }
    }   
}
