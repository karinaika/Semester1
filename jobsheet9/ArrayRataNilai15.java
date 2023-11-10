import java.util.Scanner;

public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] nilaiMhs= new int[10];
        double total = 0, rata2, rataLulus = 0, rataTdkLulus = 0, totLulus = 0, totTdkLulus = 0;
        int jmlMhs, jmlLulus = 0, jmlTdkLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

            // if (nilaiMhs[i] > 70) {
            //     jmlLulus++;
            // }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
           total += nilaiMhs[i];
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jmlLulus++;
                totLulus += nilaiMhs[i];
            } else {
                jmlTdkLulus++;
                totTdkLulus += nilaiMhs[i];
            }
        }        

        rataLulus = totLulus/jmlLulus;
        rataTdkLulus = totTdkLulus/jmlTdkLulus;
        System.out.println("Rata-rata nilai lulus : "+rataLulus);
        System.out.println("Rata-rata nilai tidak lulus : "+rataTdkLulus);
        // rata2 = total/nilaiMhs.length;
        // System.out.println("Rata-rata nilai = "+rata2);
        // System.out.println("Jumlah mahasiswa yang lulus = "+jmlLulus);
    }
}
