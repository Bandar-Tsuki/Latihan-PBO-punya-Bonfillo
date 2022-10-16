import java.util.Scanner;
public class nelponpulsa
{
    static double convertjam(int jam, int jamAwal) {return 3600 * (jam-jamAwal); }
    static double convertmenit(int menit, int menitAwal) {return 60 * (menit-menitAwal); }
    static double convertdetik(int detik, int detikAwal) {return detik-detikAwal; }
    static double biayapulsa(int biaya, int detik, int jam, int menit, int jamAwal, int menitAwal, int detikAwal) {
        return ((convertjam(jam,jamAwal) + convertmenit(menit,menitAwal) + convertdetik(detik,detikAwal))/5)*biaya ; }
    public static void main(String[] args) {
        Scanner diana = new Scanner(System.in);
        int biaya = 150;
        int jamAwal;
        System.out.print("Input Jam awal= ");
        jamAwal = diana.nextInt();
        int menitAwal;
        System.out.print("Input Menit awal= ");
        menitAwal = diana.nextInt();
        int detikAwal;
        System.out.print("Input Detik awal = ");
        detikAwal = diana.nextInt();
        System.out.print(jamAwal + " : " + menitAwal + " : " + detikAwal);
        System.out.println(" ");
        int jam;
        System.out.print("Input Jam akhir= ");
        jam = diana.nextInt();
        int menit;
        System.out.print("Input Menit akhir= ");
        menit = diana.nextInt();
        int detik;
        System.out.print("Input Detik akhir = ");
        detik = diana.nextInt();
        System.out.print(jam + " : " + menit + " : " + detik);
        System.out.println(" ");
        System.out.printf("Biaya yang dikenakan sebanyak Rp " + biayapulsa(biaya, detik, jam, menit, jamAwal, menitAwal, detikAwal));
    }
}
