package pertemuan10;

import java.util.Scanner;

public class Tugas314 {
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = iqbal.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1!");
            }
        } while (jumlahToko < 1);

        int totalBarangSeluruhToko = 0;
        int tokoTerbanyak = 0;
        int maxBarang = -1;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("Toko " + i);
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = iqbal.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                int barang;
                do {
                    System.out.print("Jumlah barang pelanggan " + j + ": ");
                    barang = iqbal.nextInt();
                    if (barang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif!");
                    }
                } while (barang < 0);
                totalBarangToko += barang;
            }

            System.out.println("Toko " + i + " -> pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("==================================");
        System.out.println("Total barang seluruh toko   : " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        iqbal.close();
    }
}
