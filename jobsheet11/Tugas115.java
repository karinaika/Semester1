import java.util.Scanner;

public class Tugas115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N >= 3) {
            for (int i = 0; i <= N; i++) {
                for (int j = N; j >= i; j--) {
                    System.out.print(" ");    
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);                    
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai n minimal 3!");
        }
    }
}
