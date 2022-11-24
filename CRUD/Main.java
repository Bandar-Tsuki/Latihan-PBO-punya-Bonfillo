package CRUD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
        String pilihanUser;
        boolean melanjutkan = true;

        while (melanjutkan) {
            clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat Seluruh Buku");
            System.out.println("2.\tCari Data Buku");
            System.out.println("3.\tTambah Data Buku");
            System.out.println("4.\tUbah Data Buku");
            System.out.println("5.\tHapus Data Buku");

            System.out.print("\n\nPilihan Anda: ");
            pilihanUser = userInput.next();

            switch (pilihanUser) {
                case "1" -> {
                    System.out.println("\n=================");
                    System.out.println("List Seluruh Buku");
                    System.out.println("\n=================");
                    tampilkanData();
                }
                case "2" -> {
                    System.out.println("\n=================");
                    System.out.println("Cari Data Buku");
                    System.out.println("=================");
                    cariData();
                }
                case "3" -> {
                    System.out.println("\n=================");
                    System.out.println("Tambah Data Buku");
                    System.out.println("=================");
                }
                case "4" -> {
                    System.out.println("\n=================");
                    System.out.println("Ubah Data Buku");
                    System.out.println("=================");
                }
                case "5" -> {
                    System.out.println("\n=================");
                    System.out.println("Hapus Data Buku");
                    System.out.println("=================");
                }
                default -> System.out.println("\n Input Anda Tidak Seusai, Mohon Input Kembali");
            }
            melanjutkan = getYesorNo();
        }
    }
    private static void cariData() throws IOException{
        try {
            new File("database.txt");
        } catch (Exception ex){
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahoeloe");
            return;
        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari buku: ");
        String cariString = userInput.nextLine();
        String[] keywords = cariString.split("\\s+");

        cekBukuDiDatabase(keywords);
    }
    private static void cekBukuDiDatabase(String[] keywords) throws IOException{
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);
        String data = bufferInput.readLine();
        boolean kaloAda;
        int nomorData = 0;
        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        while(data != null){
            kaloAda = true;

            for(String keyword:keywords){
                kaloAda = kaloAda && data.toLowerCase().contains(keyword.toLowerCase());
            }

            if(kaloAda){
                nomorData++;
                StringTokenizer stringToken = new StringTokenizer(data, ",");
                stringToken.nextToken();
                System.out.printf("| %2d ", nomorData);
                System.out.printf("|\t%4s  ", stringToken.nextToken());
                System.out.printf("|\t%-20s   ", stringToken.nextToken());
                System.out.printf("|\t%-20s   ", stringToken.nextToken());
                System.out.printf("|\t%s   ", stringToken.nextToken());
                System.out.print("\n");
            }
            data = bufferInput.readLine();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
    private static void tampilkanData() throws IOException{
        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahoeloe");
            return;
        }

        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        String data = bufferInput.readLine();
        int nomorData = 0;
        while(data != null) {
            nomorData++;
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            stringToken.nextToken();
            System.out.printf("| %2d ", nomorData);
            System.out.printf("|\t%4s  ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%s   ", stringToken.nextToken());
            System.out.print("\n");
            data = bufferInput.readLine();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
    private static boolean getYesorNo(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("\n" + "Apakah Anda Ingin Melanjutkan" + "(y/n)?");
        String pilihanUser = userInput.next().toLowerCase();

        while(!pilihanUser.equals("y") && !pilihanUser.equals("n")){
            System.out.println("Pilihan Anda Bukan y atau n");
            System.out.println("\n" + "Apakah Anda Ingin Melanjutkan" + "(y/n)?");
            pilihanUser = userInput.next().toLowerCase();
        }
        return pilihanUser.equals("y");
    }
    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();}
            else {
                System.out.println("\033\143");}
        }
        catch(Exception ex){
            System.out.println("tidak bisa clear screen");}
    }
}
