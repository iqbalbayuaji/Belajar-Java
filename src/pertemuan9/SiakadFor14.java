package pertemuan9;

import java.util.Scanner;

public class SiakadFor14 {
    public static void main(String[] args ) {
        Scanner iqbal = new Scanner(System.in);

        double nilai;
        double tertinggi = 0;
        double terendah = 100;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.print("Masukan nilai Mahasiswa ke-" + i + ": ");
            nilai = iqbal.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah Mahasiswa lulus: " + lulus);
        System.out.println("Jumlah Mahasiswa tidak lulus: " + tidakLulus);
    }
}
