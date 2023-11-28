import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Atlet {
    String nama;
    String cabor;

    public Atlet(String nama, String cabor) {
        this.nama = nama;
        this.cabor = cabor;
    }

    public String getNama() {
        return nama;
    }

    public String getCabor() {
        return cabor;
    }
}
public class Tugas415 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Atlet> daftarAtlet = new ArrayList<>();

        // input data atlet
        for (String cabang : new String[]{"Badmintoon", "Tenis Meja", "Basket", "Bola Voli"}) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("\nInput data atlet " + cabang + " ke- " + i);
                System.out.print("Nama Atlet: ");
                String nama = sc.nextLine();

                // Menambahkan atlet ke dalam ArrayList
                daftarAtlet.add(new Atlet(nama, cabang));
            }
        }

        // mengurutkan ArrayList berdasarkan nama atlet (ascending)
        Collections.sort(daftarAtlet, Comparator.comparing(Atlet::getNama));

        // menampilkan informasi atlet yang telah diurutkan
        System.out.println("\n=== Daftar Atlet Porseni 2024 ===");
        for (Atlet atlet : daftarAtlet) {
            System.out.println("Cabang Olahraga: " + atlet.getCabor() + ", Nama Atlet; " + atlet.getNama());
        }

        // menutup scanner
        sc.close();
    }
}
