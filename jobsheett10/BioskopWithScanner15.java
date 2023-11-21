import java.util.Scanner;

public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom, menu;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Input nama pengguna: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                    
                    if (penonton[baris - 1][kolom - 1] == null){
                        penonton[baris - 1][kolom - 1] = nama;
                    }else{
                        System.out.println("Kursi sudah terisi atas nama: "+penonton[baris -1][kolom -1] +" , Masukkan baris dan kolom kembali");
                        // System.out.println("Kursi sudah terisi!");
                    }
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.next();
                        sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }break;

                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[1].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + " : " + penonton[i][j]);
                            }else{
                                // System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + " : " + null);
                                System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + " : " + "***");
                            }
                        }
                    }break;
                case 3:
                    System.out.println("Terima kasih");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak tersedia!");
                break;
            }
        }
        // while (true) {
        // System.out.print("Masukkan nama: ");
        // nama = sc.nextLine();
        // System.out.print("Masukkan baris: ");
        // baris = sc.nextInt();
        // System.out.print("Masukkan kolom: ");
        // kolom = sc.nextInt();
        // sc.nextLine();

        // penonton[baris-1][kolom-1]= nama;

        // System.out.print("input penonton lainnya? (y/n): ");
        // next = sc.nextLine();
        // if (next.equalsIgnoreCase("n")) {
        // break;
        // }
        // }
    }
}
