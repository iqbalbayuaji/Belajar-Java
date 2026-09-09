package pertemuan3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang14 {
    
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);
        
        int panjang;
        int lebar;
        int luas;
        
        System.out.println("Masukkan panjang : ");
        panjang = iqbal.nextInt();
        System.out.println("Masukkan lebar : ");
        lebar = iqbal.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang adalah: " + luas);
        iqbal.close();
    }
}
