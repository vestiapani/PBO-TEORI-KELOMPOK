import java.util.Scanner;

public class App {
        public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("=== MENU KENDARAAN ===");
                System.out.println("1. Ferrari SF25");
                System.out.println("2. Toyota Alphard");
                System.out.println("3. R15");
                System.out.println("4. Honda PCX 160");
                System.out.print("Pilih Kendaraan (1-4): ");
                int pilihKendaraan = input.nextInt();

                boolean ulang = true;

                switch (pilihKendaraan) {

                        // ================= MOBIL SPORT =================
                        case 1:
                                KendaraanSport sport = new KendaraanSport(
                                                "Ferrari SF25", "Sport", 350, 2, "Merah", "Bensin",
                                                5000000, true, "SF 25", 2025, 750, "Racing");

                                while (ulang) {
                                        System.out.println("\n=== MENU MOBIL SPORT ===");
                                        System.out.println("1. Tampilkan Info");
                                        System.out.println("2. Pasang Seatbelt (Safety)"); 
                                        System.out.println("3. Simulasi Kecepatan");
                                        System.out.println("4. Aktifkan Mode Sport");
                                        System.out.println("5. Mode Drift");
                                        System.out.println("6. Nyalakan Audio"); 
                                        System.out.println("7. Mundur (Parkir)");
                                        System.out.println("8. Atap terbuka"); 
                                        System.out.println("9. Keluar");
                                        System.out.print("Pilih Menu: ");
                                        int menuSport = input.nextInt();

                                        switch (menuSport) {
                                                case 1 -> sport.tampilInfo();
                                                case 2 -> sport.pasangSeatbelt(); // Method Roda4
                                                case 3 -> sport.simulasiKecepatan();
                                                case 4 -> sport.aktifkanModeSport();
                                                case 5 -> sport.modedrift();
                                                case 6 -> sport.nyalakanAudio(); // Method Roda4
                                                case 7 -> sport.mundur(); // Method Roda4
                                                case 8 -> sport.atapterbuka();
                                                case 9 -> ulang = false;
                                                default -> System.out.println("Menu tidak valid!");
                                        }
                                }
                                break;

                        // ================= MOBIL KELUARGA =================
                        case 2:
                                KendaraanKeluarga keluarga = new KendaraanKeluarga(
                                                "Toyota Alphard", "MPV", 180, 7, "Hitam", "Bensin",
                                                3000000, true, "B 99 GP", 2022, 5, true);

                                while (ulang) {
                                        System.out.println("\n=== MENU MOBIL KELUARGA ===");
                                        System.out.println("1. Tampilkan Info");
                                        System.out.println("2. Pasang Seatbelt (Safety)");
                                        System.out.println("3. Simulasi Kecepatan");
                                        System.out.println("4. Hidupkan AC Belakang");
                                        System.out.println("5. Lipat Kursi");
                                        System.out.println("6. Nyalakan Audio"); 
                                        System.out.println("7. Mundur (Parkir)"); 
                                        System.out.println("8. Keluar");
                                        System.out.print("Pilih Menu: ");
                                        int menuKel = input.nextInt();

                                        switch (menuKel) {
                                                case 1 -> keluarga.tampilInfo();
                                                case 2 -> keluarga.pasangSeatbelt(); // Method Roda4
                                                case 3 -> keluarga.simulasiKecepatan();
                                                case 4 -> keluarga.hidupkanACBelakang();
                                                case 5 -> keluarga.lipatKursiBelakang();
                                                case 6 -> keluarga.nyalakanAudio(); // Method Roda4
                                                case 7 -> keluarga.mundur(); // Method Roda4
                                                case 8 -> ulang = false;
                                                default -> System.out.println("Menu tidak valid!");
                                        }
                                }
                                break;

                        // ================= MOTOR SPORT =================
                        case 3:
                                MotorSport motorSport = new MotorSport(
                                                "Yamaha R15M", "Sport Fairing", 155, 2, "Silver", "Bensin",
                                                40000000, true, "B 12 SPT", 2024,
                                                false, 1);

                                while (ulang) {
                                        System.out.println("\n=== MENU MOTOR SPORT ===");
                                        System.out.println("1. Tampilkan Info");
                                        System.out.println("2. Pakai Helm (Safety)");
                                        System.out.println("3. Simulasi Kecepatan");
                                        System.out.println("4. Wheelie (Atraksi)");
                                        System.out.println("5. Mode Balap");
                                        System.out.println("6. Selap-selip (Manuver)");
                                        System.out.println("7. Parkir (Turunkan Standar)");
                                        System.out.println("8. Cornering");
                                        System.out.println("9. Keluar");
                                        System.out.print("Pilih Menu: ");
                                        int menuMotorS = input.nextInt();

                                        switch (menuMotorS) {
                                                case 1 -> motorSport.tampilInfo();
                                                case 2 -> motorSport.pakaiHelm();
                                                case 3 -> motorSport.simulasiKecepatan();
                                                case 4 -> motorSport.wheelie();
                                                case 5 -> motorSport.modeBalap();
                                                case 6 -> motorSport.selapSelip();
                                                case 7 -> motorSport.turunkanStandar();
                                                case 8 -> motorSport.cornering();
                                                case 9 -> ulang = false;
                                                default -> System.out.println("Menu tidak valid!");
                                        }
                                }
                                break;

                        // ================= MOTOR KELUARGA =================
                        case 4:
                                MotorKeluarga motorKeluarga = new MotorKeluarga(
                                                "Honda PCX 160", "Matic Besar", 115, 2, "Putih", "Bensin",
                                                35000000, true, "B 77 PCX", 2023,
                                                false, 30.0);

                                while (ulang) {
                                        System.out.println("\n=== MENU MOTOR KELUARGA ===");
                                        System.out.println("1. Tampilkan Info");
                                        System.out.println("2. Pakai Helm (Safety)");
                                        System.out.println("3. Simulasi Kecepatan");
                                        System.out.println("4. Masukkan Barang ke Bagasi");
                                        System.out.println("5. Jalan Santai");
                                        System.out.println("6. Selap-selip (Manuver)");
                                        System.out.println("7. Parkir (Turunkan Standar)");
                                        System.out.println("8. Keluar");
                                        System.out.print("Pilih Menu: ");
                                        int menuMotorK = input.nextInt();

                                        switch (menuMotorK) {
                                                case 1 -> motorKeluarga.tampilInfo();
                                                case 2 -> motorKeluarga.pakaiHelm();
                                                case 3 -> motorKeluarga.simulasiKecepatan();
                                                case 4 -> motorKeluarga.masukkanBarangKeBagasi();
                                                case 5 -> motorKeluarga.jalanSantai();
                                                case 6 -> motorKeluarga.selapSelip();
                                                case 7 -> motorKeluarga.turunkanStandar();
                                                case 8 -> ulang = false;
                                                default -> System.out.println("Menu tidak valid!");
                                        }
                                }
                                break;

                        default:
                                System.out.println("Pilihan kendaraan tidak valid!");
                }

                input.close();
        }
}