package pertemuan6;

import java.util.Scanner;

public class tugas2SeleksiAsisten14 {
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = iqbal.nextBoolean();

        System.out.print("Apakah terkena sanksi akademik? (true/false): ");
        boolean terkenaSanksi = iqbal.nextBoolean();

        System.out.print("Nilai Dasar Pemrograman: ");
        int nilaiDasarPemrograman = iqbal.nextInt();

        System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
        boolean punyaSertifikat = iqbal.nextBoolean();

        System.out.print("Nilai wawancara: ");
        int nilaiWawancara = iqbal.nextInt();

        if (mahasiswaAktif && !terkenaSanksi) {
            if (nilaiDasarPemrograman >= 78 || punyaSertifikat) {
                if (nilaiWawancara >= 73) {
                    System.out.println(
                        "Diterima sebagai asisten praktikum."
                    );
                } else {
                    System.out.println(
                        "Gagal tahap wawancara, nilai kurang dari 73."
                    );
                }
            } else {
                System.out.println(
                    "Gagal tahap akademik, nilai Dasar Pemrograman kurang dari 78 dan tidak memiliki sertifikat."
                );
            }
        } else {
            System.out.println(
                "Gagal tahap administrasi, mahasiswa tidak aktif atau sedang mendapat sanksi."
            );
        }

        iqbal.close();        
    }    
}
