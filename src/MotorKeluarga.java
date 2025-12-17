public class MotorKeluarga extends KendaraanRoda2 {

    private double pLuasBagasi;

    public MotorKeluarga(String nama, String jenis, int kecepatan, int kapasitas,
            String warna, String bahan, double harga, boolean status, String plat, int tahun,
            boolean kickStarter, double luasBagasi) {

        super(nama, jenis, kecepatan, kapasitas, warna, bahan, harga, status, plat, tahun, kickStarter);
        this.pLuasBagasi = luasBagasi;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Luas Bagasi: " + pLuasBagasi + " Liter");
        System.out.println("Kategori: Motor Keluarga / Harian");
    }

    public void masukkanBarangKeBagasi() {
        System.out.println("Membuka jok... Barang masuk ke bagasi " + pLuasBagasi + "L.");
    }

    public void jalanSantai() {
        System.out.println(pNama + " berjalan santai... Irit bensin.");
    }

}