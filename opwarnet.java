import java.util.Scanner;
public class opwarnet
{
        static double bayarngetik(double ngetik) {return (ngetik/60) * 2000; }
        static double bayarinet(double inet) {return (inet/60) * 4000; }
        static double bayargaming(double gaming) {return (gaming/60) * 5000; }
        static double bayarprintcolor(int cetakwarna) {return cetakwarna*500; }
        static double bayarprintgray(int cetakgray) {return cetakgray*300; }
        static double bayarjajan(int jajan) {return jajan*3000; }
        static double bayarscan(int scan) {return scan*1000; }
        static double totalbayar(int ngetik, int gaming, int inet, int cetakwarna, int cetakgray, int jajan, int scan){
            return bayargaming(gaming) + bayarinet(inet) + bayarjajan(jajan) + bayarscan(scan) + bayarprintgray(cetakgray) + bayarngetik(ngetik) + bayarprintcolor(cetakwarna);
        }
        public static void main(String[] args) {
            Scanner regina = new Scanner(System.in);
            int ngetik;
            System.out.print("Lama User Mengetik dalam menit = ");
            ngetik = regina.nextInt();
            System.out.printf("Rp " + bayarngetik(ngetik));
            System.out.println(" ");
            int inet;
            System.out.print("Lama User Menggunakan Internet dalam menit = ");
            inet = regina.nextInt();
            System.out.printf("Rp " + bayarinet(inet));
            System.out.println(" ");
            int gaming;
            System.out.print("Lama User Main Game-Online dalam menit = ");
            gaming = regina.nextInt();
            System.out.printf("Rp " + bayargaming(gaming));
            System.out.println(" ");
            int cetakwarna;
            System.out.print("Banyak User Cetak Berwarna = ");
            cetakwarna = regina.nextInt();
            System.out.printf("Rp " + bayarprintcolor(cetakwarna));
            System.out.println(" ");
            int cetakgray;
            System.out.print("Banyak User Cetak Hitam-Putih = ");
            cetakgray = regina.nextInt();
            System.out.printf("Rp " + bayarprintgray(cetakgray));
            System.out.println(" ");
            int jajan;
            System.out.print("Banyak Teh Botol Yg Dibeli User = ");
            jajan = regina.nextInt();
            System.out.printf("Rp " + bayarjajan(jajan));
            System.out.println(" ");
            int scan;
            System.out.print("Banyak File Yg Discan User = ");
            scan = regina.nextInt();
            System.out.printf("Rp " + bayarscan(scan));
            System.out.println(" ");
            System.out.printf("Biaya yang dikenakan sebanyak Rp " + totalbayar(ngetik, gaming, inet, cetakwarna, cetakgray, jajan, scan));
        }
}
