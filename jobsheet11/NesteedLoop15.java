import java.util.Scanner;

public class NesteedLoop15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            double sum =0;
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
                sum += temps[i][j];
            }
            double average = sum / temps[i].length;
            System.out.println("Average temperature for city " + i + ": " + average);
            System.out.println();
        }

        // for (double[] tempsCity : temps) {
        //     for (double temperature : tempsCity) {
        //         System.out.print(temperature + " ");
        //     }
        //     System.out.println();
    }
}
