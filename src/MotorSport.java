public class MotorSport extends KendaraanRoda2 {

    private int pJumlahSilinder;

    public MotorSport(String nama, String jenis, int kecepatan, int kapasitas,
            String warna, String bahan, double harga, boolean status, String plat, int tahun,
            boolean kickStarter, int jumlahSilinder) {

        super(nama, jenis, kecepatan, kapasitas, warna, bahan, harga, status, plat, tahun, kickStarter);
        this.pJumlahSilinder = jumlahSilinder;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jumlah Silinder: " + pJumlahSilinder);
        System.out.println("Kategori: Motor Sport");
    }

    public void wheelie() {
        System.out.println(pNama + " melakukan WHEELIE! Ban depan terangkat!");
    }

    public void modeBalap() {
        System.out.println("Posisi riding menunduk (Aerodinamis), siap ngebut!");
    }

    public void cornering() {
        System.out.println("Cornering Kencang 45 Derajat");
    }
}