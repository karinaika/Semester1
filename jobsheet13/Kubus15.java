import java.util.Scanner;

/**
 * Kubus15
 */
public class Kubus15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v, sisi, Lp;
        System.out.print("Masukkan nilai sisi kubus: ");
        sisi = sc.nextInt();

        v = VolumeKubus(sisi);
        System.out.println("Volume kubus adalah " + v);
        Lp = LuasPermukaanKubus(sisi);
        System.out.println("Luas Permukaan kubus adalah " + Lp);
    }

    static int VolumeKubus(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    static int LuasPermukaanKubus(int sisi) {
        int LuasPermukaan = 6 * sisi * sisi;
        return LuasPermukaan;
    }
}