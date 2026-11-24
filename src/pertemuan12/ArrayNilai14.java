package pertemuan12;

import java.util.Scanner;

public class ArrayNilai14 {
    public static void main(String[] args) {
    Scanner iqbal = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = iqbal.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            if (status.equalsIgnoreCase("lulus")) {
                System.out.println("Mahasiswa ke-" + (i+1) + ": " + nilaiAkhir[i] + " " + status);
            }
        }        
    }
}
