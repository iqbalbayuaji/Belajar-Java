package pertemuan12;

import java.util.Scanner;

public class SearchNilai14 {
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        boolean ditemukan = false;
        
        System.out.print("Masukan jumlah total nilai : ");
        int jmlArray = iqbal.nextInt();

        int[] nilai = new int[jmlArray];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan nilai : ");
            nilai[i] = iqbal.nextInt();
        }

        System.out.print("Masukan nilai yang ingin dicari : ");
        int key = iqbal.nextInt();

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + (i+1));
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai tidak ditemukan.");
        }
    }
}
