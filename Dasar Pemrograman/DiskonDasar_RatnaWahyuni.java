public class DiskonDasar_RatnaWahyuni {
    public static void main(String[] args) {
        double harga = 100000;
        double diskonPersen = 20;

        double potongan = harga * diskonPersen / 100;
        double hargaAkhir = harga - potongan;

        System.out.println("Harga awal  : " + harga);
        System.out.println("Diskon      : " + diskonPersen + "%");
        System.out.println("Harga akhir : " + hargaAkhir);
    }
}