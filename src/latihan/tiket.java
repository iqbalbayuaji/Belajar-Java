package latihan;

import java.util.Scanner;

public class tiket {
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        int jumlahGrup;
        int jumlahPengunjung;
        int UsiaPengunjung;
        int tarifTiket = 0;
        int totalTarifTiket = 0;
        int tarifDiskon = 0;
        int totalPendapatan = 0;

        System.out.print("Masukan Jumlah grup :");
        jumlahGrup = iqbal.nextInt();

        for (int i = 1; i <= jumlahGrup; i++) {
            System.out.println("Grup ke-" + i);
            do {
                jumlahPengunjung = 0;
                System.out.print("Masukan jumlah Pengunjung :");
                jumlahPengunjung = iqbal.nextInt();
            } while (jumlahPengunjung <= 0);

            totalTarifTiket = 0;
            tarifDiskon = 0;

            for (int j = 0; j < jumlahPengunjung; j++) {
                do {
                    System.out.print("Masukan Usia Pengunjung ke " + (j+1) + " :");
                    UsiaPengunjung = iqbal.nextInt();
                    if (UsiaPengunjung <= 0) {
                        System.out.println("Input tidak Valid");
                    }
                } while (UsiaPengunjung <= 0); 

                tarifTiket = 0;
                if (UsiaPengunjung < 12) {
                    tarifTiket = 12000;
                } else if (UsiaPengunjung >= 12){
                    tarifTiket = 35000;
                }

                totalTarifTiket+=tarifTiket;                
            }
            if (jumlahPengunjung > 5) {
                tarifDiskon = totalTarifTiket * 10/100;
                System.out.println("Grup-" + i + " Mendapatkan Diskon 10%");
            }

            totalPendapatan+=totalTarifTiket;

            System.out.print("Total harga yang harus dibayar oleh grup-" + i + " :");
            System.out.println(totalTarifTiket-=tarifDiskon);
        }
        System.out.print("Total pendapatan wahana hari ini :");
        System.out.println(totalPendapatan);
    }
}
