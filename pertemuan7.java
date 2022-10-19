package pertemuan7;
import java.util.Scanner;

class golsatu{
    Scanner jackd = new Scanner(System.in);
    public void hitungpenghasilan(){
        System.out.println("Golongan Satu\n");
        System.out.println("Lama Anda Bekerja (dalam jam) =");
        int jamkerja = jackd.nextInt();
        int jamlembur;
        jamlembur = jamkerja - 173;
        System.out.println("Anda Lembur Selama " + jamlembur + " jam");
        long gajilembur = jamlembur * 20000L;
        long gajipokok = 1486500 ;
        long gaji = gajilembur + gajipokok;
        long gajitotal = gaji - (gaji*5/1000);
        long tunjangan = 250000;
        long danatunjang = tunjangan - (tunjangan*5/1000);
        long penghasilan = gajitotal + danatunjang ;
        System.out.println("Penghasilan Anda = " + penghasilan);
    }
}
class goldua{
    Scanner jackd = new Scanner(System.in);
    public void hitungpenghasilan(){
        System.out.println("Golongan Dua\n");
        System.out.println("Lama Anda Bekerja (dalam jam) =");
        int jamkerja = jackd.nextInt();
        int jamlembur;
        jamlembur = jamkerja - 173;
        System.out.println("Anda Lembur Selama " + jamlembur + " jam");
        long gajilembur = jamlembur * 20000L;
        long gajipokok = 1926000 ;
        long gaji = gajilembur + gajipokok;
        long gajitotal = gaji - (gaji*5/1000);
        long tunjangan = 300000;
        long danatunjang = tunjangan - (tunjangan*5/1000);
        long penghasilan = gajitotal + danatunjang ;
        System.out.println("Penghasilan Anda = " + penghasilan);
    }
}
class goltiga{
    Scanner jackd = new Scanner(System.in);
    public void hitungpenghasilan(){
        System.out.println("Golongan Tiga\n");
        System.out.println("Lama Anda Bekerja (dalam jam) =");
        int jamkerja = jackd.nextInt();
        int jamlembur;
        jamlembur = jamkerja - 173;
        System.out.println("Anda Lembur Selama " + jamlembur + " jam");
        long gajilembur = jamlembur * 20000L;
        long gajipokok = 2456700 ;
        long gaji = gajilembur + gajipokok;
        long gajitotal = gaji - (gaji*5/1000);
        long tunjangan = 350000;
        long danatunjang = tunjangan - (tunjangan*5/1000);
        long penghasilan = gajitotal + danatunjang ;
        System.out.println("Penghasilan Anda = " + penghasilan);
    }
}
class golempat{
    Scanner jackd = new Scanner(System.in);
    public void hitungpenghasilan(){
        System.out.println("Golongan Empat\n");
        System.out.println("Lama Anda Bekerja (dalam jam) =");
        int jamkerja = jackd.nextInt();
        int jamlembur;
        jamlembur = jamkerja - 173;
        System.out.println("Anda Lembur Selama " + jamlembur + " jam");
        long gajilembur;
        gajilembur = jamlembur * 20000L;
        long gajipokok = 2899500 ;
        long gaji = gajilembur + gajipokok;
        long gajitotal = gaji - (gaji*5/1000);
        long tunjangan = 400000;
        long danatunjang = tunjangan - (tunjangan*5/1000);
        long penghasilan = gajitotal + danatunjang ;
        System.out.println("Penghasilan Anda = " + penghasilan);
    }
}
class jager{
    Scanner jackd = new Scanner(System.in);
    golsatu satu = new golsatu();
    goldua dua = new goldua();
    goltiga tiga = new goltiga();
    golempat empat = new golempat();
    public void pilihGol(){
        System.out.println("\nPilih Golongan Anda (satu/dua/tiga/empat) : ");
        String pilihGol = jackd.nextLine().toLowerCase();
        switch (pilihGol) {
            case "satu" -> {
                satu.hitungpenghasilan();
                ngulang();
            }
            case "dua" -> {
                dua.hitungpenghasilan();
                ngulang();
            }
            case "tiga" -> {
                tiga.hitungpenghasilan();
                ngulang();
            }
            case "empat" -> {
                empat.hitungpenghasilan();
                ngulang();
            }
            default -> {
                System.out.println("Mohon Ulangi");
                pilihGol();
            }
        }
    }
    public void ngulang(){
        System.out.println("\nApakah anda ingin melakukan perhitungan lagi?(Y/N): ");
        String ngulang = jackd.nextLine().toUpperCase();
        if ( ngulang.equals("Y")){
            pilihGol();
        }
        else if ( ngulang.equals("N")) {
            System.out.println("\nTerima kasih! Have a Good Day");
        }
        else {
            System.out.println("\nMohon Input Ulang!");
        }
    }
}
public class pertemuan7 {
    public static void main(String[] args) {
        jager b = new jager();
        b.pilihGol();
    }
}
