import java.util.Scanner;

public class Tugas15 {

    static int jmlMhs = 5;
    static int jmlMinggu = 7;
    static int nilaiTertinggi = 0;
    static int mingguNilaiTertinggi = 0;
    static int mhsNilaiTertinggi;
    static int jumlahMahasiswa;
    static int jumlahTugas;
    static String[] mahasiswa;
    static int[][] nilai;


    private static int[][] nilaiMhs = new int[jmlMhs][jmlMinggu];

    public static void main(String[] args) {
        jmlNilaiMhs();
        tampilNilaiMhs();
        cariNilaiTertinggi();
        tampilMhsNilaiTinggi();
        inputDataMhs();
    }
    public static void inputDataMhs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine(); 

        mahasiswa = new String[jumlahMahasiswa];
        nilai = new int[jumlahMahasiswa][];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            mahasiswa[i] = sc.nextLine();
        }

        System.out.print("Masukkan jumlah tugas: ");
        jumlahTugas = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlahMahasiswa; i++) {
            nilai[i] = new int[jumlahTugas];
            System.out.println("Masukkan nilai untuk " + mahasiswa[i]);
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai tugas " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
            sc.nextLine(); 
        }

    }

    public static void jmlNilaiMhs() {
        Scanner sc = new Scanner(System.in);
        for (int a = 0; a < jmlMhs; a++) {
            System.out.println("Masukkan nilai Mahasiswa ke- " + (a + 1));
            for (int b = 0; b < jmlMinggu; b++) {
                System.out.print("Minggu ke- " + (b + 1) + " : ");
                nilaiMhs[a][b] = sc.nextInt();
            }
        }
    }

    public static void tampilNilaiMhs() {
        System.out.println("                                                    DAFTAR NILAI MAHASISWA                   ");
        System.out.println("                 Minggu ke-1     Minggu ke-2     Minggu ke-3     Minggu ke-4     Minggu ke-5     Minggu ke-6     Minggu ke-7");
        for (int a = 0; a < jmlMhs; a++) {
            System.out.print("Mahasiswa ke- " + (a + 1) + " ");
            for (int b = 0; b < jmlMinggu; b++) {
                System.out.print("  ");
                System.out.format("%-15d", nilaiMhs[a][b]);
                if (b < jmlMinggu) {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }

    public static void cariNilaiTertinggi() {
        for (int a = 0; a < jmlMhs; a++) {
            for (int b = 0; b < jmlMinggu; b++) {
                if (nilaiMhs[a][b] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMhs[a][b];
                    mingguNilaiTertinggi = b + 1;
                }
            }
        }
        System.out.println("Nilai tertinggi adalah " + nilaiTertinggi + " yang terdapat pada minggu ke- " + mingguNilaiTertinggi);
    }

    public static void tampilMhsNilaiTinggi() {
        int nilaiTertinggi = 0;
        int mhsNilaiTertinggi = 0; 
        for (int a = 0; a < jmlMhs; a++) {
            for(int b = 0; b < jmlMinggu; b++) {
                if (nilaiMhs[a][b] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMhs[a][b];
                    mhsNilaiTertinggi = a;
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai teringgi adalah mahasiswa ke- " +(mhsNilaiTertinggi + 1) + " dengan perolehan nilai " + nilaiTertinggi+ " pada minggu ke-"+mingguNilaiTertinggi );
    }
}
