package pertemuan12;

import java.util.Scanner;

public class Tugas2_14 {
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("======================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " " + menu[i] + " : "+ harga[i]);
        }
        System.out.println("======================================");

        System.out.print("Ingin mencari menu terlebih dahulu? (y/n): ");
        String cariLagi = iqbal.nextLine();
        while (cariLagi.equalsIgnoreCase("y")) {
            System.out.print("Masukkan nama menu yang dicari: ");
            String key = iqbal.nextLine();

            int indeksDitemukan = -1;
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(key)) {
                    indeksDitemukan = i;
                    break;
                }
            }

            if (indeksDitemukan != -1) {
                System.out.println("Menu " + menu[indeksDitemukan] + "tersedia dengan harga Rp "+ harga[indeksDitemukan]);
            } else {
                System.out.println("Maaf, menu '" + key + "' tidak tersedia.");
            }

            System.out.print("Cari menu lain? (y/n): ");
            cariLagi = iqbal.nextLine();
        }

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = iqbal.nextInt();
        iqbal.nextLine(); 

        String[] daftarPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String inputMenu = iqbal.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(inputMenu)) {
                        daftarPesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        totalBiaya += harga[j];
                        valid = true;
                        break;
                    }
                }

                if (!valid) {
                    System.out.println("Menu tidak ditemukan! Silakan masukkan nama menu yang ada di daftar.");
                }
            }
        }

        System.out.println("=========================================");
        for (int i = 0; i < daftarPesanan.length; i++) {
            System.out.println((i + 1)+ " "+ daftarPesanan[i]+" : Rp "+ hargaPesanan[i]);
        }
        System.out.println("=========================================");
        System.out.println("Total Biaya         : Rp "+ totalBiaya);
        System.out.println("=========================================");
    }
}