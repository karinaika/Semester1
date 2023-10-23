import java.util.Scanner;

public class PemilihanPercobaan215 {
    public static void main(String[] args){
        Scanner input15 = new Scanner(System.in);
        System.out.print("Nilai UAS :");
        float uas = input15.nextFloat();
        System.out.print("Nilai UTS :");
        float uts = input15.nextFloat();
        System.out.print("Nilai Kuis :");
        float kuis = input15.nextFloat();
        System.out.print("Nilai Tugas :");
        float tugas = input15.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi" ;
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        if (total >=80) {
            System.out.println("Kualifikasi nilai Sangat Baik, nilai setara 4 dengan predikat A");
        } else if(total >73){
            System.out.println("Kualifikasi nilai Lebih dari Baik, nilai setara 3,5 dengan predikat B+");
        } else if(total >65){
            System.out.println("Kualifikasi nilai Baik, nilai setara 3 dengan predikat B");
        } else if(total >60){
            System.out.println("Kualifikasi nilai Lebih dari Cukup, nilai setara 2,5 dengan predikat C+");
        } else if(total >50){
            System.out.println("Kualifikasi nilai Cukup, nilai setara 2 dengan predikat C");
        } else if(total >39){
            System.out.println("Kualifikasi nilai Kurang, nilai setara 1 dengan predikat D");
        } else if(total <=39){
            System.out.println("Kualifikasi nilai Gagal, nilai setara 0 dengan predikat E");
        }
    }
}
