package pertemuan9;

import java.util.Scanner;

public class Tugas2_14 {
public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis (1=Mobil, 2=Motor, 0=Keluar): ");
            jenis = iqbal.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = iqbal.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);

        System.out.println("Total parkir: Rp " + total);

        iqbal.close();
    }   
}
