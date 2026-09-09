package pertemuan2;

public class ContohVariable14 {
    public static void main(String[] args) {

        String hobiSaya = "fotografi";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSaya = 18;
        double ipk = 3.24, tinggi = 1.78;
        
        System.out.println(hobiSaya);
        System.out.println("Apakah Pandai? " + isPandai);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSaya);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan : %s", ipk, tinggi));
    }
}
