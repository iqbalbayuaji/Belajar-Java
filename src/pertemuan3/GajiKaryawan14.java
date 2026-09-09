package pertemuan3;

import java.util.Scanner;

public class GajiKaryawan14 {
    
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        int gajiPokok;
        double bonus, totalGaji;
        double tunjTransp = 600000;
        double tunjMakan = 400000;

        System.out.println("Masukkan gaji pokok anda : ");
        gajiPokok = iqbal.nextInt();
        
        bonus = 0.05*gajiPokok;
        totalGaji = gajiPokok + tunjTransp + tunjMakan + bonus - 0.1*gajiPokok;
        
        System.out.println("Bonus gaji bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + (int) totalGaji);
        iqbal.close();
    }
}
