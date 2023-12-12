/**
 * Percobaan515
 */
public class Percobaan515 {

    public static void main(String args[]) {
        Tampil("Daspro 2019", 100, 200);
        Tampil("Teknologi Informasi", 1, 2, 3, 4, 5);
        Tampil("Polinema");
        Tampil("Mine", 15.0, 12.6);
    }

    static void Tampil(String str, int... a) {
        System.out.println("String : " + str);
        System.out.println("Jumlah argumen/parameter : " + a.length);

        for (int i : a) {
            System.out.println(i + " ");
        }

        System.out.println();
    }

    static void Tampil(String str, double... x) {
        System.out.println("String : " + str);
        System.out.println("Jumlah argumen/parameter : " + x.length);

        for (double j : x) {
            System.out.println(j + " ");
        }
        System.out.println();
    }
}