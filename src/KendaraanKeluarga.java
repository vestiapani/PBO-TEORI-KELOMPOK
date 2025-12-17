public class KendaraanKeluarga extends KendaraanRoda4 {

    private int pJumlahPintu;
    private boolean pACBelakang;

    public KendaraanKeluarga(String nama, String jenis, int kecepatan, int kapasitas,
            String warna, String bahan, float harga, boolean status, String plat, int tahun,
            int pintu, boolean acBelakang) {

        super(nama, jenis, kecepatan, kapasitas, warna, bahan, harga, status, plat, tahun);
        this.pJumlahPintu = pintu;
        this.pACBelakang = acBelakang;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jumlah Pintu: " + pJumlahPintu);
        System.out.println("AC Belakang: " + (pACBelakang ? "Ada" : "Tidak Ada"));
    }

    public void hidupkanACBelakang() {
        System.out.println("AC belakang dinyalakan.");
    }

    public void lipatKursiBelakang() {
        System.out.println("Kursi belakang dilipat.");
    }
}