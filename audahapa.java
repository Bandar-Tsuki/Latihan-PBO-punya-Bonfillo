import java.util.Scanner;
public class audahapa {
    private String grade;
    public audahapa(double inputNilaiAngka){
         if ( inputNilaiAngka >= 90 ) this.grade = "A";
        else if ( inputNilaiAngka >= 80 ) {
            this.grade = "A-";
        } else if ( inputNilaiAngka >= 75 ) {
            this.grade = "B+";
        } else if ( inputNilaiAngka >= 70 ) {
            this.grade = "B";
        } else if ( inputNilaiAngka >= 65 ) {
            this.grade = "B-";
        } else if ( inputNilaiAngka >= 60 ) {
            this.grade = "C+";
        } else if ( inputNilaiAngka >= 55 ) {
            this.grade = "C";
        } else if ( inputNilaiAngka >= 50 ) {
            this.grade = "C-";
        } else if ( inputNilaiAngka >= 40 ) {
            this.grade = "D";
        } else if ( inputNilaiAngka >= 0 ) {
            this.grade = "E";
        }
    }
    public String InputTotal(){
        return this.grade;
    }
    public static void main(String[] args) {
        Scanner marie = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        double nilaiAngkaAkhir = marie.nextDouble();

        System.out.println("Hasil : ");
        audahapa G = new audahapa(nilaiAngkaAkhir);
        System.out.println("Nilai Angka kamu: " + nilaiAngkaAkhir);
        System.out.println("Nilai Huruf kamu: " + G.InputTotal() );
    }
}