import java.util.Scanner;
import java.util.Random;

public class nuhuneuy {
    public static void main(String[] args) {
        String[] arr = {"Gunting", "Kertas", "Batu"};
        Scanner cek = new Scanner(System.in);
        String jawab, mau;

        Random r = new Random();

        do {
            int randomNumber = r.nextInt(arr.length);
            System.out.print("Masukan Gunting / Kertas / Batu : ");
            jawab = cek.next();
            System.out.println("Komputer mengeluarkan : " + arr[randomNumber]);
            if (arr[randomNumber].equals("Gunting") && jawab.equals("Kertas")) {
                System.out.println("Kamu kalah");
            } else if (arr[randomNumber].equals("Kertas") && jawab.equals("Batu")) {
                System.out.println("Kamu kalah");
            } else if (arr[randomNumber].equals("Batu") && jawab.equals("Gunting")) {
                System.out.println("Kamu kalah");
            } else if (arr[randomNumber].equals(jawab)) {
                System.out.println("Kamu Seri");
            } else {
                System.out.println("Kamu menang");
            }
            System.out.print("Apakah kau ingin bermain lagi [y/t] ?");
            mau = cek.next();
        } while (mau.equals("y") || mau.equals("Y"));

}}
