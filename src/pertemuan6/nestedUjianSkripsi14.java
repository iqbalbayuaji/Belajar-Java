package pertemuan6;

import java.util.Scanner;

public class nestedUjianSkripsi14 {
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);
        String pesan;
        
        System.out.println("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak) : ");
        String bebasKompen = iqbal.nextLine().trim();

        System.out.println("Masukan jumlah log bimbingan Pembimbing 1 : ");
        int bimbinganP1 = iqbal.nextInt();

        System.out.println("Masukan jumlah log bimbingan Pembimbing 2 : ");
        int bimbinganP2 = iqbal.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 10 && bimbinganP2 >= 5) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 >= 10 && bimbinganP2 >= 5) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 10 kali dan P2 kurang dari 5 kali";
            } else if (bimbinganP1 < 10) {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 10 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 5 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
        iqbal.close();
    }
}
