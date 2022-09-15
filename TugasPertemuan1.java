import java.util.Scanner;

public class TugasPertemuan1 {
    public static void main(String[] args) {
        Scanner ndar = new Scanner(System.in);

        //Memory
        String nama, nim, jurusan, angkatan, nilaiTotal;
        int nPresensi, nTugas, nUts, nUas;
        double nilaiAkhir;

        //Input Data
        System.out.println("------------------------------------------------");
        System.out.println("Input Data");
        System.out.println("------------------------------------------------");
        System.out.print("Masukkan NIM : ");
        nim = ndar.nextLine();
        System.out.print("Masukkan Nama Lengkap : ");
        nama = ndar.nextLine();
        System.out.println(" ");
        System.out.println("Masukkan Nilai Tugas Mata Kuliah Pemrograman Berorientasi Objek : ");
        System.out.print("1. Nilai Presensi : ");
        nPresensi = ndar.nextInt();
        System.out.print("2. Nilai Tugas : ");
        nTugas = ndar.nextInt();
        System.out.print("3. Nilai UTS : ");
        nUts = ndar.nextInt();
        System.out.print("4. Nilai UAS : ");
        nUas = ndar.nextInt();

        //Pengoperasian nilai
        nilaiAkhir = (0.1 * nPresensi) + (0.2 * nTugas) + (0.3 * nUts) + (0.4 * nUas);
        angkatan = nim.substring(0, 4);

        //Output Data
        System.out.println("------------------------------------------------");
        System.out.println("Nilai Mata Kuliah Pemrograman Berorientas Objek:");
        System.out.println("------------------------------------------------");
        System.out.println("NIM: " + nim);
        System.out.println("Nama Lengkap: " + nama);
        jurusan = switch (nim.substring(4, 6)) {
            case "01" -> "Akuntansi";
            case "02" -> "Manajemen";
            case "03" -> "Psikolog";
            case "04" -> "Ilmu Komunikasi";
            case "05" -> "Desain Produk";
            case "06" -> "Desain Komunikasi Visual";
            case "07" -> "Informatika";
            case "08" -> "Sistem Informasi";
            case "09" -> "Teknik Sipil";
            case "10" -> "Arsitek";
            default -> "";};
        if(nilaiAkhir>=80)
            {nilaiTotal ="A";}
            else if(nilaiAkhir>=70)
            {nilaiTotal ="B";}
            else if(nilaiAkhir>=60)
            {nilaiTotal ="C";}
            else if(nilaiAkhir<=50)
            {nilaiTotal ="D";}
            else
            {nilaiTotal ="E";}
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Angkatan : " + angkatan);
        System.out.println(" ");
        System.out.println("1. Nilai Presensi: " + nPresensi);
        System.out.println("2. Nilai Tugas: " + nTugas);
        System.out.println("3. Nilai UTS: " + nUts);
        System.out.println("4. Nilai UAS: " + nUas);
        System.out.println("5. Nilai Akhir: " + nilaiAkhir);
        System.out.println("6. Nilai Total: " + nilaiTotal);
    }}