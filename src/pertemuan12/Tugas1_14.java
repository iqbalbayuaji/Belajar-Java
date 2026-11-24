package pertemuan12;

import java.util.Scanner;

public class Tugas1_14 {
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jmlMhs = iqbal.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        int total = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = iqbal.nextInt();
            total += nilaiMhs[i];
        }

        double rataRata = (double) total / nilaiMhs.length;
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }

        System.out.println("=========================");
        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i] + " (" + status + ")");
        }

        System.out.println("=========================");
        System.out.printf("Rata-rata nilai : %.2f%n", rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
    }
    
}
