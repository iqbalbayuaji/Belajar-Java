package pertemuan6;

import java.util.Scanner;

public class tugas1DiskonBuku {
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        System.out.println("Masukan jenis buku (kamus/novel) :");
        String jenisBuku = iqbal.nextLine().trim();

        System.out.println("Masukan jumlah buku :");
        int jumlahBuku = iqbal.nextInt();

        int diskon = 0;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 12;
            if (jumlahBuku > 2) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5;
            } else {
                diskon = 0;
            }
        }
        System.out.println(diskon);
        iqbal.close();
    }    
}
