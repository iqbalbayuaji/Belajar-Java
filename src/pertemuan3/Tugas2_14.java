package pertemuan3;

import java.util.Scanner;

public class Tugas2_14 {
    
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        int lembar;
        int biaya_per_lembar = 500;
        int biayaJilid = 5000;
        
        System.out.print("Masukkan jumlah lembar yang dicetak : ");
        lembar = iqbal.nextInt();

        int biaya_cetak = lembar * biaya_per_lembar;
        int total_biaya = biaya_cetak + biayaJilid;

        System.out.println("Total biaya : " + total_biaya);
        iqbal.close();
    
    }
}
