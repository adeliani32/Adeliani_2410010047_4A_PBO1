
package rentalcamping;

public class AlatCamping {

    // ==========================
    // Atribut
    // ==========================
    private String kode;
    private String nama;
    private double hargaSewa;
    private int stok;

    // ==========================
    // Constructor
    // ==========================
    public AlatCamping(String kode, String nama, double hargaSewa, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.hargaSewa = hargaSewa;
        this.stok = stok;
    }

    // ==========================
    // Getter
    // ==========================
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public int getStok() {
        return stok;
    }

    // ==========================
    // Setter
    // ==========================
    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // ==========================
    // Method
    // ==========================

    // Menghitung biaya sewa
    public double hitungBiaya(int lamaSewa) {
        return hargaSewa * lamaSewa;
    }

    // Mengurangi stok
    public boolean kurangiStok(int jumlah) {

        if (stok >= jumlah) {
            stok -= jumlah;
            return true;
        }

        return false;
    }

    // Menambah stok
    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    // Menampilkan data alat
    public void tampilInfo() {

        System.out.println("-------------------------------------");
        System.out.println("Kode        : " + kode);
        System.out.println("Nama Alat   : " + nama);
        System.out.println("Harga/Hari  : Rp " + hargaSewa);
        System.out.println("Stok        : " + stok);
        System.out.println("-------------------------------------");

    }

}

