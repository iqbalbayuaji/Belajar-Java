package pertemuan3;

import java.util.Scanner;

public class MenghitungTotalBayar14 {
    
    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        double harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

        System.out.println("Masukkan harga barang : ");
        harga=iqbal.nextInt();

        potongan=diskon*harga;
        jml_bayar=harga-potongan;

        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);
        iqbal.close();
    }
}
