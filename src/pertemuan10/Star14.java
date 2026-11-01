package pertemuan10;

import java.util.Scanner;

public class Star14 {
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = iqbal.nextInt();

        // for (int i = 1; i <= n; i++) {
        // System.out.print("*");
        // }
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        iqbal.close();
    }
    
}
