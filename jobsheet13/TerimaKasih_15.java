public class TerimaKasih_15 {
    public static void main(String[] args) {

        // Tanpa menggunakan fungsi
        // System.out.println("Thank you for being the best teacher in the world.\n" +
        //         "You inspired in me a love for learning and made me feel like I could ask you anything.");

        // Menggunakan fungsi
        UcapanTerimaKasih();
        String ucapan = "Terima Kasih Pak.. Bu.. Semoga Sehat Selalu";
        UcapanTambahan(ucapan);
    }

    public static void UcapanTerimaKasih() {
        System.out.println("Thank you for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(String ucapan){
        System.out.println(ucapan);
    }
}
