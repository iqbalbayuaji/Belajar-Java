package pertemuan10;

import java.util.Scanner;

public class Tugas214 {
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = iqbal.nextInt();

        int jumlahTotal = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                jumlahTotal += hasil;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + jumlahTotal);
        iqbal.close();
    }
}