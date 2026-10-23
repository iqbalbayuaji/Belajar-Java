package pertemuan9;

import java.util.Scanner;

public class KafeDoWhile14 {
public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);
        
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        
        int hargakopi = 14000;
        int hargaTeh = 7000;
        int hargaRoti = 17000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = iqbal.nextLine();
            
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            
            System.out.print("Jumlah kopi: ");
            kopi = iqbal.nextInt();
            System.out.print("Jumlah teh: ");
            teh = iqbal.nextInt();
            System.out.print("Jumlah roti: ");
            roti = iqbal.nextInt();
            
            totalHarga = (kopi * hargakopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            iqbal.nextLine();
        } while (true);
        
        System.out.println("Semua transaksi selesai.");
        iqbal.close();
    }    
}
