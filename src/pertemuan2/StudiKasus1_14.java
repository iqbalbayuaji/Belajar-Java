package pertemuan2;

import java.util.Scanner;

public class StudiKasus1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiBulanan;
        int tunjanganAnak;
        int jumlahAnak;
        double potonganPensiun = 0.10;

        System.out.println("Masukan Gaji Bulanan anda: ");
        gajiBulanan = sc.nextInt();

        System.out.println("Masukan Tunjangan Anak: ");
        tunjanganAnak = sc.nextInt();

        System.out.println("Masukan Jumlah Anak: ");
        jumlahAnak = sc.nextInt();

        int totalTunjanganAnak = tunjanganAnak * jumlahAnak;
        double potonganGajiPensiun = gajiBulanan * potonganPensiun;
        double gajiBersih = gajiBulanan + totalTunjanganAnak - potonganGajiPensiun;

        System.out.println("Gaji Bersih: " + gajiBersih);
        sc.close();

        if (gajiBersih > 5000000) {
            System.out.println("Anda memiliki Desil 10");
        } else {
            System.out.println("Anda memiliki Desil 3");
        }
    }
    
}
