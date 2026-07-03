
package rentalcamping;

public class Pelanggan {

    // ==========================
    // Atribut
    // ==========================
    private String idPelanggan;
    private String nama;
    private String nomorHP;
    private String alamat;
    private boolean member;

    // ==========================
    // Constructor
    // ==========================
    public Pelanggan(String idPelanggan, String nama,
                     String nomorHP, String alamat, boolean member) {

        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.nomorHP = nomorHP;
        this.alamat = alamat;
        this.member = member;
    }

    // ==========================
    // Getter
    // ==========================
    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public String getAlamat() {
        return alamat;
    }

    public boolean isMember() {
        return member;
    }

    // ==========================
    // Setter
    // ==========================
    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    // ==========================
    // Menampilkan Data
    // ==========================
    public void tampilInfo() {

        System.out.println("-------------------------------------");
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("Nama         : " + nama);
        System.out.println("Nomor HP     : " + nomorHP);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Member       : " + (member ? "Ya" : "Tidak"));
        System.out.println("-------------------------------------");

    }

}
