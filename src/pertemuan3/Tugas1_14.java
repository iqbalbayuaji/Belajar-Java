package pertemuan3;

import java.util.Scanner;

public class Tugas1_14 {
    
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        int hargaKredit;
        int uangMuka;
        int cicilBulanan;
        double bunga = 0.02;

        System.out.print("Masukkan harga kredit : ");
        hargaKredit = iqbal.nextInt();
        System.out.print("Masukkan uang muka : ");
        uangMuka = iqbal.nextInt();
        System.out.print("Masukkan lama cicilan (bulan) : ");
        cicilBulanan = iqbal.nextInt();

        int sisa_pokok = hargaKredit - uangMuka;
        double cicilan_pokok = sisa_pokok / cicilBulanan; 
        double cicilan_bunga = cicilan_pokok * bunga;
        double cicilan_per_bulan = cicilan_pokok + cicilan_bunga;


        System.out.println("Jumlah cicilan yang harus dibayar per bulan : " + cicilan_per_bulan);
        
        iqbal.close();
    }
}