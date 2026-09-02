class Barang {
    private double harga;
    private double diskonPersen;

    public Barang(double harga, double diskonPersen) {
        this.harga = harga;
        this.diskonPersen = diskonPersen;
    }

    public double hitungHargaAkhir() {
        double potongan = harga * diskonPersen / 100;
        return harga - potongan;
    }

    public void tampilkanInfo() {
        System.out.println("Harga awal  : " + harga);
        System.out.println("Diskon      : " + diskonPersen + "%");
        System.out.println("Harga akhir : " + hitungHargaAkhir());
    }
}

public class DiskonPBO_RatnaWahyuni {
    public static void main(String[] args) {
        Barang barang1 = new Barang(100000, 20);
        barang1.tampilkanInfo();
    }
}