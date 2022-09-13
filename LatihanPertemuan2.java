import java.util.Random;
import java.util.Scanner;

public class LatihanPertemuan2



    //Latihan nomor 1

/*{
    public static void main(String[] args) {
        byte number;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("\nMasukan Angka 0 - 10: ");
            number = input.nextByte();

            if (number >= 0 && number <= 10) {
                break;
            } else {
                System.out.println("Angka Anda bukan 0 - 10");
                System.out.println("Silahkan Input Ulang");
            }
        }
        System.out.println("Angka Anda berada di 0 - 10");
    }
}*/







    //Latihan nomor 2

/*{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Kalau dilakukan dengan sepenuh hati maka besi batangan pun " +
                "kalau digosok terus menerus akan menjadi jarum";
        String jawab;
        System.out.println("Kalimat: " + sentence);

        while (true) {
            System.out.print("\nInput salah satu frase dari kalimat tersebut : ");
            jawab = input.next();
            if (sentence.contains(jawab)) {
                System.out.printf("%s ada di dalam kalimat di atas !", jawab);
                break;
            } else {
                System.out.printf("%s tidak ada di dalam kalimat di atas.\n", jawab);
                System.out.println("Mohon input ulang !");
            }
        }
    }
}/*







    //Latihan nomor 3

 */
{
    public static void main(String[] args) {
        Scanner endra = new Scanner(System.in);
        System.out.println("Halo Selamat Datang\n");
        String jawab;
        do {
            suitjawa(endra);
            System.out.println(" ");
            System.out.print("Apakah ingin mengulang lagi [y/t] : ");
            jawab = endra.next();
            System.out.println(" ");
            System.out.println("Terima Kasih Telah Bermain");
        }
        while (jawab.equals("y") || jawab.equals("Y"));
    }

    static void suitjawa(Scanner endra) {
        System.out.println(" ");
        System.out.println("j = jempol");
        System.out.println("t = telunjuk");
        System.out.println("k = kelingking");
        System.out.print("\nsilahkan jalan (j/t/k) : ");
        String pilihanUser = endra.next();
        System.out.println(" ");
        System.out.println("Anda Mengeluarkan " + pilihanUser);

        Random random = new Random();
        int randomizerkomputer = random.nextInt(3);

        String pilihanKomputer;
        if (randomizerkomputer == 0) {
            pilihanKomputer = "k";
        } else if (randomizerkomputer == 1) {
            pilihanKomputer = "t";
        } else {
            pilihanKomputer = "j";
        }
        System.out.println(" ");
        System.out.println("Komputer Mengeluarkan " + pilihanKomputer + "!");

        // Print results
        System.out.println("Hasil = ");
        if (pilihanUser.equals(pilihanKomputer)) {
            System.out.println("SERI");
        } else if (playerWins(pilihanUser, pilihanKomputer)) {
            System.out.println("MENANG");
        } else {
            System.out.println("KALAH");
        }
    }

    static boolean playerWins(String player, String comp) {
        if (player.equals("k")) {
            return comp.equals("j");
        } else if (player.equals("t")) {
            return comp.equals("k");
        } else {
            return comp.equals("t");
        }
    }
}