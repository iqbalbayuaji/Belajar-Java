package pertemuan5;

import java.util.Scanner;

public class Tugas1Pemilihan14 {
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = iqbal.nextBoolean();

        String pesan = (uktLunas) ? "Pembayaran UKT Terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
      
        iqbal.close();
    }
}
