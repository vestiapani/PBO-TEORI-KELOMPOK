public class KendaraanSport extends KendaraanRoda4 {
    private int pTenagaKuda;
    private String pModeMesin;

    public KendaraanSport(String nama, String jenis, int kecepatan, int kapasitas,
            String warna, String bahan, float harga, boolean status, String plat, int tahun,
            int tenagaKuda, String modeMesin) {

        super(nama, jenis, kecepatan, kapasitas, warna, bahan, harga, status, plat, tahun);
        this.pTenagaKuda = tenagaKuda;
        this.pModeMesin = modeMesin;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Tenaga Kuda: " + pTenagaKuda + " HP");
        System.out.println("Mode Mesin: " + pModeMesin);
    }

    public void aktifkanModeSport() {
        System.out.println("Mode Sprot diaktifkan! Performa meningkat!");
        System.out.println("Mengaktifkan Turbo Boost");
    }

    public void modedrift() {
        System.out.println("Konfigurasi Diferensial Drift!");
    }

    public void atapterbuka() {
        System.out.println("Atap Mobil Terbuka");
    }
}