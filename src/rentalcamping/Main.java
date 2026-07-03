
package rentalcamping;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<AlatCamping> daftarAlat = new ArrayList<>();
        ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
        ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();

        // ==========================
        // Data Awal Alat
        // ==========================

        daftarAlat.add(new Tenda("T001", "Tenda Dome", 50000, 5, "Dome", 4));
        daftarAlat.add(new AlatCamping("A001", "Carrier 60L", 30000, 6));
        daftarAlat.add(new AlatCamping("A002", "Kompor Portable", 25000, 8));
        daftarAlat.add(new AlatCamping("A003", "Sleeping Bag", 20000, 10));

        // ==========================
        // Data Awal Pelanggan
        // ==========================

        daftarPelanggan.add(
                new Pelanggan(
                        "P001",
                        "Ahmad",
                        "08123456789",
                        "Banjarbaru",
                        true));

        daftarPelanggan.add(
                new Pelanggan(
                        "P002",
                        "Budi",
                        "08234567890",
                        "Banjarmasin",
                        false));

        int pilihan = -1;

        do {

            try {

                System.out.println("\n=====================================");
                System.out.println("     CAMP RENTAL SYSTEM");
                System.out.println("=====================================");
                System.out.println("1. Tambah Alat");
                System.out.println("2. Lihat Alat");
                System.out.println("3. Tambah Pelanggan");
                System.out.println("4. Lihat Pelanggan");
                System.out.println("5. Sewa Alat");
                System.out.println("6. Cari Alat");
                System.out.println("7. Riwayat Transaksi");
                System.out.println("8. Laporan Pendapatan");
                System.out.println("0. Keluar");
                System.out.print("Pilih Menu : ");

                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {

                    // ==========================
                    // Tambah Alat
                    // ==========================
                    case 1:

                        System.out.println("\n=== Tambah Alat ===");

                        System.out.print("Kode : ");
                        String kode = input.nextLine();

                        System.out.print("Nama : ");
                        String nama = input.nextLine();

                        System.out.print("Harga Sewa : ");
                        double harga = input.nextDouble();

                        System.out.print("Stok : ");
                        int stok = input.nextInt();
                        input.nextLine();

                        daftarAlat.add(
                                new AlatCamping(
                                        kode,
                                        nama,
                                        harga,
                                        stok));

                        System.out.println("Data alat berhasil ditambahkan.");

                        break;

                    // ==========================
                    // Lihat Alat
                    // ==========================
                    case 2:

                        System.out.println("\n=== Daftar Alat ===");

                        for (int i = 0; i < daftarAlat.size(); i++) {

                            System.out.println("\nAlat ke-" + (i + 1));

                            daftarAlat.get(i).tampilInfo();

                        }

                        break;

                    // ==========================
                    // Tambah Pelanggan
                    // ==========================
                    case 3:

                        System.out.println("\n=== Tambah Pelanggan ===");

                        System.out.print("ID : ");
                        String id = input.nextLine();

                        System.out.print("Nama : ");
                        String namaPelanggan = input.nextLine();

                        System.out.print("Nomor HP : ");
                        String hp = input.nextLine();

                        System.out.print("Alamat : ");
                        String alamat = input.nextLine();

                        System.out.print("Member (y/n) : ");
                        char member = input.next().charAt(0);
                        input.nextLine();

                        boolean statusMember = member == 'y' || member == 'Y';

                        daftarPelanggan.add(
                                new Pelanggan(
                                        id,
                                        namaPelanggan,
                                        hp,
                                        alamat,
                                        statusMember));

                        System.out.println("Pelanggan berhasil ditambahkan.");

                        break;

                    // ==========================
                    // Lihat Pelanggan
                    // ==========================
                    case 4:

                        System.out.println("\n=== Data Pelanggan ===");

                        for (Pelanggan p : daftarPelanggan) {

                            p.tampilInfo();

                        }

                        break;
                    // ==========================
                    // Sewa Alat
                    // ==========================
                    case 5:

                        if (daftarPelanggan.isEmpty()) {
                            System.out.println("Belum ada data pelanggan.");
                            break;
                        }

                        if (daftarAlat.isEmpty()) {
                            System.out.println("Belum ada data alat.");
                            break;
                        }

                        System.out.println("\n===== DATA PELANGGAN =====");

                        for (int i = 0; i < daftarPelanggan.size(); i++) {
                            System.out.println((i + 1) + ". "
                                    + daftarPelanggan.get(i).getNama());
                        }

                        System.out.print("Pilih Pelanggan : ");
                        int pilihPelanggan = input.nextInt() - 1;

                        Pelanggan pelanggan = daftarPelanggan.get(pilihPelanggan);

                        System.out.println("\n===== DAFTAR ALAT =====");

                        for (int i = 0; i < daftarAlat.size(); i++) {

                            System.out.println((i + 1) + ". "
                                    + daftarAlat.get(i).getNama()
                                    + " | Stok : "
                                    + daftarAlat.get(i).getStok());

                        }

                        System.out.print("Pilih Alat : ");
                        int pilihAlat = input.nextInt() - 1;

                        AlatCamping alat = daftarAlat.get(pilihAlat);

                        System.out.print("Jumlah : ");
                        int jumlah = input.nextInt();

                        if (!alat.kurangiStok(jumlah)) {

                            System.out.println("Stok tidak mencukupi.");
                            break;

                        }

                        System.out.print("Lama Sewa (Hari) : ");
                        int lama = input.nextInt();

                        System.out.print("Hari Terlambat (0 jika tidak ada): ");
                        int terlambat = input.nextInt();

                        Transaksi transaksi = new Transaksi(
                                "TR00" + (daftarTransaksi.size() + 1),
                                pelanggan,
                                alat,
                                jumlah,
                                lama,
                                terlambat);

                        daftarTransaksi.add(transaksi);

                        transaksi.tampilStruk();

                        break;

                    // ==========================
                    // Cari Alat
                    // ==========================
                    case 6:

                        input.nextLine();

                        System.out.print("Masukkan Nama Alat : ");
                        String cari = input.nextLine();

                        boolean ditemukan = false;

                        for (AlatCamping a : daftarAlat) {

                            if (a.getNama().equalsIgnoreCase(cari)) {

                                a.tampilInfo();
                                ditemukan = true;

                            }

                        }

                        if (!ditemukan) {

                            System.out.println("Alat tidak ditemukan.");

                        }

                        break;

                    // ==========================
                    // Riwayat Transaksi
                    // ==========================
                    case 7:

                        if (daftarTransaksi.isEmpty()) {

                            System.out.println("Belum ada transaksi.");

                        } else {

                            for (Transaksi t : daftarTransaksi) {

                                t.tampilStruk();

                            }

                        }

                        break;

                    // ==========================
                    // Laporan Pendapatan
                    // ==========================
                    case 8:

                        double totalPendapatan = 0;

                        for (Transaksi t : daftarTransaksi) {

                            totalPendapatan += t.getTotalBayar();

                        }

                        System.out.println("\n========== LAPORAN ==========");
                        System.out.println("Jumlah Transaksi : "
                                + daftarTransaksi.size());

                        System.out.println("Total Pendapatan : Rp "
                                + totalPendapatan);

                        System.out.println("=============================");

                        break;

                    // ==========================
                    // Keluar
                    // ==========================
                    case 0:

                        System.out.println("Terima kasih telah menggunakan CampRent.");

                        break;

                    default:

                        System.out.println("Menu tidak tersedia.");

                }

            } catch (InputMismatchException e) {

                System.out.println("Input harus berupa angka.");
                input.nextLine();

            } catch (Exception e) {

                System.out.println("Terjadi Kesalahan : " + e.getMessage());

            }

        } while (pilihan != 0);

        input.close();

    }

}
