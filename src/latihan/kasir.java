package latihan;

import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        int hargaBarang = 0;
        String kodeBarang;
        System.out.println("Masukan jumlah kasir :");
        int jumlahKasir = iqbal.nextInt();

        for (int i = 0; i < jumlahKasir; i++) {
            System.out.print("Masukan jumlah pelanggan yang dilayani kasir-" + (i+1) +" :");
            int jumlahPelanggan = iqbal.nextInt();
            do {
                System.out.println("Kode A : 10.000");
                System.out.println("Kode B : 25.000");
                System.out.println("Kode C : 50.000");
                System.out.println("Masukan kode item (A/B/C):");
                kodeBarang = iqbal.nextLine();
                if (kodeBarang.equalsIgnoreCase("A")) {
                    hargaBarang = 10000;
                } else if (kodeBarang.equalsIgnoreCase("B")) {
                    hargaBarang = 25000;
                } else if (kodeBarang.equalsIgnoreCase("C")) {
                    hargaBarang = 50000;
                }
                
            } while (kodeBarang.equalsIgnoreCase("0"));
        }
    }
}
