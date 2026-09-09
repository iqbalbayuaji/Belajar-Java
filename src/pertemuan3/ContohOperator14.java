package pertemuan3;

public class ContohOperator14 {

    public static void main(String[] args) {
        int x = 1;
        System.out.println("x++ = " + x++);
        System.out.println("Setelah Evaluasi, x = " + x++);

        x = 10;
        System.out.println("++x = " + ++x);
        System.out.println("Setelah Evaluasi, x = " + ++x);

        int y = 12;
        System.out.println(x > y || y == x && x < y);

        int z = x ^ y;
        System.out.println("Hasil dari x ^ y = " + z);

        z %= 2;
        System.out.println("Hasil Akhir " + z);
    }
}