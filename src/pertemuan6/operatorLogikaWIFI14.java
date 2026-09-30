package pertemuan6;

import java.util.Scanner;

public class operatorLogikaWIFI14 {
    
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = iqbal.nextBoolean();

        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = iqbal.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = iqbal.nextBoolean();

        if ((mahasiswa && dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }

        iqbal.close();        
    }
}
