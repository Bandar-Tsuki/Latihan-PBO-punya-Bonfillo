import java.util.Scanner;

public class returnmetho
/*{
    static int bilangan(){
        return 100;
    }
    static int bilangan2(){
        int hasil = 100 + 200;

        return hasil;
    }

    public static void main(String[] args) {
        System.out.println("Nilai Bilangan 1 = " + bilangan());
        if (bilangan() > bilangan2()) {
            System.out.println(bilangan() + " nilainya lebih besar dari " + bilangan2());
        }
        else {
            System.out.println(bilangan() + " nilainya lebih kecil dari " + bilangan2());
        }
    }
}*/
{
    static double luasSegitiga(int tinggi, int alas) {
        return 0.5 * alas * tinggi;
    }
    static double kelilingSegitiga(int alas) {
        return 3 * alas;
    }
    public static void main(String[] args) {
        Scanner joko = new Scanner(System.in);
        int tinggi;
        System.out.print("Input Tinggi = ");
        tinggi = joko.nextInt();
        int alas;
        System.out.print("Input Alas = ");
        alas = joko.nextInt();
        System.out.printf("Luas Segitiga adalah " + luasSegitiga(tinggi, alas));
        System.out.println(" ");
        System.out.printf("Keliling Segitiga adalah " + kelilingSegitiga(alas));
    }
}