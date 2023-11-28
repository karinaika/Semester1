import java.util.Scanner;

public class NesteedLoop15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + (i + 1)); 
            for (double temperature: temps[i]) {
                System.out.print(temperature + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            double rata2 = 0;
            for (double temperature: temps[i]) {
                rata2 += temperature;
            }
            rata2 /= temps[i].length;
            System.out.println("Rata-rata City " + (i + 1) + ": " +rata2);
        }
    }
}
