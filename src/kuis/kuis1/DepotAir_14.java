package kuis.kuis1;

import java.util.Scanner;

public class DepotAir_14 {

    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        int jumlahGalon;
        int sisaAir;
        int Pendapatan;
        int hargaPerGalon = 19500;
        int operasiDepot = 8;
        int jumlahAir;
        double rataPerJam;

        System.out.println("Masukan Jumlah air dalam format liter : ");
        jumlahAir = iqbal.nextInt();

        jumlahGalon = jumlahAir / 19;
        sisaAir = jumlahGalon % jumlahAir;
        Pendapatan = jumlahGalon * hargaPerGalon;
        rataPerJam = Pendapatan / operasiDepot;
        

        System.out.println("Jumlah Galon : " + jumlahGalon);
        System.out.println("sisa air (liter) : " + sisaAir + " liter");
        System.out.println("Pendapatan : " + Pendapatan);
        System.out.println("Rata-rata per jam : " + rataPerJam);
        iqbal.close();
    }
}
