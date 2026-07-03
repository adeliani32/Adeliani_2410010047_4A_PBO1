
package rentalcamping;

public class Transaksi {

    // ==========================
    // Atribut
    // ==========================
    private String idTransaksi;
    private Pelanggan pelanggan;
    private AlatCamping alat;
    private int jumlah;
    private int lamaSewa;
    private int hariTerlambat;

    private double totalSewa;
    private double diskon;
    private double denda;
    private double totalBayar;

    // ==========================
    // Constructor
    // ==========================
    public Transaksi(String idTransaksi,
                     Pelanggan pelanggan,
                     AlatCamping alat,
                     int jumlah,
                     int lamaSewa,
                     int hariTerlambat) {

        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.alat = alat;
        this.jumlah = jumlah;
        this.lamaSewa = lamaSewa;
        this.hariTerlambat = hariTerlambat;

        hitungTotal();
    }

    // ==========================
    // Menghitung Total
    // ==========================
    public void hitungTotal() {

        // Total sewa
        totalSewa = alat.hitungBiaya(lamaSewa) * jumlah;

        // Diskon member
        if (pelanggan.isMember()) {
            diskon = totalSewa * 0.10;
        } else {
            diskon = 0;
        }

        // Denda
        denda = hariTerlambat * 20000;

        // Total bayar
        totalBayar = totalSewa - diskon + denda;

    }

    // ==========================
    // Getter
    // ==========================
    public String getIdTransaksi() {
        return idTransaksi;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public AlatCamping getAlat() {
        return alat;
    }

    public int getJumlah() {
        return jumlah;
    }

    // ==========================
    // Cetak Struk
    // ==========================
    public void tampilStruk() {

        System.out.println("\n======================================");
        System.out.println("          STRUK PENYEWAAN");
        System.out.println("======================================");
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Pelanggan    : " + pelanggan.getNama());
        System.out.println("Alat         : " + alat.getNama());
        System.out.println("Jumlah       : " + jumlah);
        System.out.println("Lama Sewa    : " + lamaSewa + " Hari");
        System.out.println("--------------------------------------");
        System.out.println("Total Sewa   : Rp " + totalSewa);
        System.out.println("Diskon       : Rp " + diskon);
        System.out.println("Denda        : Rp " + denda);
        System.out.println("--------------------------------------");
        System.out.println("Total Bayar  : Rp " + totalBayar);
        System.out.println("======================================");

    }

}
