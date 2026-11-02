package pertemuan10;

import java.util.Scanner;

public class Triangle14 {
    
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = iqbal.nextInt();
        int i = 0;
        
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        iqbal.close();
    }
}
