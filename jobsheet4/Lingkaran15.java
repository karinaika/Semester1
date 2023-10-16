import java.util.Scanner;
public class Lingkaran15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int r;
        double keliling, luas;
        System.out.println("Masukkan Jari-jari Lingkarang ");
        r =input.nextInt();
        double phi;
        System.out.println("Masukkan phi ");
        phi =input.nextDouble();
        keliling= 2*phi*r;
        luas= phi*r*r;
        System.out.println(keliling);
        System.out.println(luas);
    }
}
