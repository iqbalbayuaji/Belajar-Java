//parameter = 14
package uts.uts1;

import java.util.Scanner;

public class KolamRenang_14 {
    
    public static void main(String[] args) {
    Scanner iqbal = new Scanner(System.in);

    int harga;
    int umur;
    int hargaTotal;
    int hargaDiskon;
    boolean isRombongan;
    int jmlTiket;
    

    System.out.println("Masukan Umur : ");
    umur = iqbal.nextInt();

    System.out.println("Apakah Rombongan Sekolah : ");
    isRombongan = iqbal.nextBoolean();
    
    System.out.println("Masukan Jumlah Tiket : ");
    jmlTiket = iqbal.nextInt();


    switch (umur) {
        case 1:
            if (jmlTiket >= 12) {
                if (isRombongan) {
                    hargaTotal = 17000 * jmlTiket;
                    hargaDiskon = hargaTotal * 15/100;
                } else {
                    
                }
            } else {
                
            }
            break;
        case 2:
            harga = 27000;
            break;
        case 3:
            harga = 12000;
            break;
    
        default:
            break;
    }

    // int diskondisplay = hargaTotal - hargaDiskon;
    // System.out.println("Layanan : ");
    // System.out.println("Biaya Dasar : " + hargaTotal);
    // System.out.println("Diskon : " + diskondisplay);
    // System.out.println("Total Bayar: ");
    }
}



//harga tiket kode 1 anak = 17000
//harga tiket kode 2 dewasa = 27000
//harga tiket kode 3 lansia = 12000
//B banyak harga tiket pertama yang dikenai harga penuh = 12
//S batas syarat diskon tiket = 22
