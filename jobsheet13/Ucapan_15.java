import java.util.Scanner;

public class Ucapan_15 {
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " +nama+"\nMay the force be with u.");
    }

    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tulisan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
}
