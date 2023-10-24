import java.util.Scanner;
public class Pemilihan2Percobaan115 {
    public static void main(String[] args){
        Scanner input15 = new Scanner(System.in);
        int tahun;
        System.out.print("Masukkan Tahun: ");
        tahun=input15.nextInt();
        
        tahun=0;
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0){
                System.out.println("Tahun Kabisat");
            }else if((tahun % 400) == 0){
                System.out.println("Merupakan Tahun");
            } else {
                System.out.println("Bukan Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}