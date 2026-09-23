package pertemuan5;

import java.util.Scanner;

public class Tugas2_14 {
    
    public static void main(String[] args) {
        Scanner iqbal = new java.util.Scanner(System.in);

        System.out.print("Masukan Jumlah SKS : ");
        int jumlahSks = iqbal.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi Batas");
        } else {
            System.out.println("KRS Valid");
        }

        iqbal.close();
    }
}
