
package rentalcamping;

public class Tenda extends AlatCamping {

    // Atribut tambahan
    private String jenis;
    private int kapasitas;

    // Constructor
    public Tenda(String kode, String nama, double hargaSewa, int stok,
                 String jenis, int kapasitas) {

        super(kode, nama, hargaSewa, stok);

        this.jenis = jenis;
        this.kapasitas = kapasitas;
    }

    // Getter
    public String getJenis() {
        return jenis;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    // Setter
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    // Override Method (Polymorphism)
    @Override
    public double hitungBiaya(int lamaSewa) {

        double total = getHargaSewa() * lamaSewa;

        // Biaya perawatan tenda
        total += 10000;

        return total;
    }

    // Override tampilInfo()
    @Override
    public void tampilInfo() {

        super.tampilInfo();

        System.out.println("Jenis       : " + jenis);
        System.out.println("Kapasitas   : " + kapasitas + " Orang");
        System.out.println("-------------------------------------");
    }

}
