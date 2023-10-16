import java.util.Scanner;

public class HargaBayar15 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int harga, jumlah, halBuku;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.print("MAsukkan Merk Buku: ");
        merkBuku=input.nextLine();
        System.out.print("Masukkan Hal Buku: ");
        halBuku=input.nextInt();
        System.out.print("Masukkan harga barang yang dibeli: ");
        harga=input.nextInt();
        System.out.print("Masukkan Jumlah jumlah barang yang dibeli: ");
        jumlah=input.nextInt();
        System.out.print("Masukkan Jumlah Diskon: ");
        dis=input.nextDouble();
        
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus anda bayar " + bayar);
    }
}
