public class KendaraanRoda2 extends Kendaraan {

    protected boolean pKickStarter;

    public KendaraanRoda2(String nama, String jenis, int kecepatan, int kapasitas,
            String warna, String bahan, double harga, boolean status, String plat, int tahun,
            boolean kickStarter) {

        super(nama, jenis, kecepatan, kapasitas, warna, bahan, harga, status, plat, tahun);
        this.pKickStarter = kickStarter;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kick Starter: " + (pKickStarter ? "Ada" : "Tidak Ada"));
    }

    public void cekTekananBan() {
        System.out.println("Tekanan ban " + pNama + " dicek: Aman untuk manuver miring.");
    }

    public void serviceRutin() {
        System.out.println("Service rutin (Ganti Oli & Cek Rantai/CVT) selesai.");
    }

    public void turunkanStandar() {
        System.out.println("Standar diturunkan. Motor parkir dengan seimbang.");
    }

    public void selapSelip() {
        System.out.println(pNama + " bermanuver 'selap-selip' di antara kemacetan mobil.");
        System.out.println(" berhasil melewati antrian panjang!");
    }

    public void pakaiHelm() {
        System.out.println("Pengendara memakai helm SNI. Klik! Siap jalan.");
    }
}