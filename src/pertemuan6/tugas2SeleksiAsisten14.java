package pertemuan6;

import java.util.Scanner;

public class tugas2SeleksiAsisten14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean terkenaSanksi;
        int nilaiDasarPemrograman;
        boolean punyaSertifikat;
        int nilaiWawancara;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah terkena sanksi akademik? (true/false): ");
        terkenaSanksi = sc.nextBoolean();

        System.out.print("Nilai Dasar Pemrograman: ");
        nilaiDasarPemrograman = sc.nextInt();

        System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
        punyaSertifikat = sc.nextBoolean();

        System.out.print("Nilai wawancara: ");
        nilaiWawancara = sc.nextInt();

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

        sc.close();        
    }    
}
