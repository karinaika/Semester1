import java.util.Scanner;

public class LinearSearch15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int elemen = sc.nextInt();

        // int[] arrayInt = {34, 18, 26, 48, 72, 56, 63};
        int[] arrayInt = new int[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan elemen array ke- " +(i)+ " : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();
        // int key = 20;
        int hasil = 1;
        for (int i = 0; i < elemen; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
                // break;
            } else {
                System.out.println("Key tidak ditemukan ");
                break;
            }
        }
    }
}