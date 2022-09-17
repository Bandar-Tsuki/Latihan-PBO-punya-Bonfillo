import java.util.Scanner;

public class LatihanPertemuan3 {
    public static void main(String[] args) {
        int[] nomor = {10, 3, 40, 50, 15, 5, 7, 8};
        System.out.println("Isi dari array tersebut " + nomor.length);
        double jumlah = 0;
        for (int angka : nomor) {
            jumlah = angka + jumlah;
        }
        System.out.println("Hasil dari penjumlahan seluruh isi array adalah " + jumlah);
        double rata;
        rata = jumlah / nomor.length;
        System.out.println("Rata - Rata seluruh isi array adalah " + rata);
        Scanner input = new Scanner(System.in);
        int jawab;
        System.out.print("\nInput angka untuk menebak array yang ada di atas : ");
        jawab = input.nextInt();
            boolean found = false;
            for (var nilai : nomor) {
                if (jawab == nilai) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.printf("%d ada di dalam array di atas !", jawab);
            } else {
                System.out.printf("%s tidak ada di dalam Array di atas.\n", jawab);
            }
                System.out.println("Mohon Ulangi Lagi !");
        }
}

