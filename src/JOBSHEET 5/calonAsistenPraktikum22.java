import java.util.Scanner;

public class calonAsistenPraktikum22 {
    public static void main(String[] args) {
        Scanner zer = new Scanner(System.in);

        System.out.println("Apkah mahasiswa aktif selama perkuliahan? (true/false) : ");
        boolean mhsAktif = zer.nextBoolean();

        System.out.println("Mahasiswa sendang disanksi? (true/false) : ");
        boolean diSanksi = zer.nextBoolean();

        System.out.println("Nilai Daspro: ");
        int nilaiDaspro = zer.nextInt();

        System.out.println("Memiliki sertifikat kompetensi pemrograman? (true/false) : ");
        boolean sertif =  zer.nextBoolean();


        if (mhsAktif && !diSanksi) {
            if (nilaiDaspro >= 75 || sertif == true) { //nilai daspro = 75 + (22 mod 11) = 75
                System.out.println("Mahasiswa bisa mengikuti tes wawancara");
                System.out.println("Nilai wawancara: ");
                int nilaiwwc = zer.nextInt();
                if (nilaiwwc > 70) {//nilai wwc =  70 + (22 mod 11) = 70
                    System.out.println("Selamat mahasiswa terpilih menjadi asisten praktikum");
                } else {
                    System.out.println("Maaf anda belum terpilih karena nilai wawancara kurang dari nilai min");
                }
            } else {
                System.out.println("Maaf anda belum bisa mengikuti tes wawancara");
            }
        } else {
            System.out.println("Maaf anda tidak memenuhi syarat");
        }

    }
    
}
