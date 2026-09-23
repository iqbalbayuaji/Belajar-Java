package pertemuan5;

import java.util.Scanner;

public class TugasParkir14 {
    
    public static void main(String[] args) {
        Scanner iqbal = new java.util.Scanner(System.in);

        int jam;
        int tarif;

        System.out.print("Masukan lama jam parkir : ");
        jam = iqbal.nextInt();

        if (jam <= 2) {
            tarif = 2000;
        } else {
            tarif = 2000 + (jam - 2) * 1000;
        }

        System.out.println("Tarif parkir : " + tarif);

        iqbal.close();
    }
}
