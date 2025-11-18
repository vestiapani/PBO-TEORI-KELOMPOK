public class KendaraanRoda4 extends Kendaraan {

    public KendaraanRoda4(String nama, String jenis, int kecepatan, int kapasitas,
            String warna, String bahan, float harga, boolean status, String plat, int tahun) {

        super(nama, jenis, kecepatan, kapasitas, warna, bahan, harga, status, plat, tahun);
    }

    public void cekTekananBan() {
        System.out.println("Tekanan ban kendaraan roda 4 sudah dicek dan baik.");
    }

    public void serviceRutin() {
        System.out.println("Service kendaraan roda 4 telah dilakukan.");
    }
}
