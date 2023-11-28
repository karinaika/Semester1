import java.util.Scanner;

public class Tugas215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = sc.nextInt();

        if (N >= 5) {
            for (int i = N; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");    
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai N minimal 5!");
        }
    }
}
