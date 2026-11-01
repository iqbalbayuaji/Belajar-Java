package pertemuan10;

import java.util.Scanner;

public class Rectangle14 {
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = iqbal.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = iqbal.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        iqbal.close();
    }
    
}
