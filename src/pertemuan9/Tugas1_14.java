package pertemuan9;

import java.util.Scanner;

public class Tugas1_14 {
    
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);
        int hargaTiket = 44000;
        int totalTiket = 0;
        int totalPendapatan = 0;
        boolean lanjut;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlah = iqbal.nextInt();

            if (jumlah < 0) {
                System.out.println("Jumlah tidak valid! Transaksi ini dilewati.");
            } else {
                double diskon = 0;
                if (jumlah > 10) {
                    diskon = 0.17;
                } else if (jumlah > 5) {
                    diskon = 0.12;
                }

                int totalAwal = jumlah * hargaTiket;
                int bayar = (int) (totalAwal - (totalAwal * diskon));

                totalTiket += jumlah;
                totalPendapatan += bayar;

                System.out.println("Bayar: Rp " + bayar);
            }

            System.out.print("Apakah mau lanjut? (True/False): ");
            lanjut = iqbal.nextBoolean();

        } while (lanjut);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan harian: Rp " + totalPendapatan);

        iqbal.close();
    }
}
