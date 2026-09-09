package pertemuan2;


public class StudiKasus2_14 {
    
    public static void main(String[] args) {
        int lebarTanah = 30;
        int panjangTanah = 100;
        int diameterKolam = 5;
        int sisiKolam = 2;

        int luasTanah = lebarTanah * panjangTanah;
        int jariJariKolam = diameterKolam / 2;
        double LuasKolam = 3.14 * jariJariKolam * jariJariKolam;
        int luasTaman = sisiKolam * sisiKolam;
        double LuasYangTidakDigunakan = luasTanah - LuasKolam - luasTaman;

        System.out.println("Luas tanah yang tidak digunakan = " + LuasYangTidakDigunakan);    
    }    
}
