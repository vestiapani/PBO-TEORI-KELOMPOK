public class KendaraanRoda4 extends Kendaraan {

    public KendaraanRoda4(String nama, String jenis, int kecepatan, int kapasitas,
            String warna, String bahan, double harga, boolean status, String plat, int tahun) {

        super(nama, jenis, kecepatan, kapasitas, warna, bahan, harga, status, plat, tahun);
    }

    public void cekTekananBan() {
        System.out.println("Tekanan ban " + pNama + " (4 Roda) dicek. Stabil untuk beban berat.");
    }

    public void serviceRutin() {
        System.out.println("Service rutin (Ganti Oli, Filter Udara, Air Radiator) selesai.");
    }

    public void pasangSeatbelt() {
        System.out.println("Klik! Sabuk pengaman terpasang. Aman dan siap jalan.");
    }

    public void mundur() {
        System.out.println("Tuas digeser ke 'R'. Mobil bergerak mundur... Bip.. Bip.. Bip..");
    }

    public void nyalakanAudio() {
        System.out.println("Audio dinyalakan. Memutar lagu favorit di dalam kabin.");
    }
}