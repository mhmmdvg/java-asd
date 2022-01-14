public class Buku {
    private final String judul, kategori;
    private final double hargaSewa, hargaDenda;

    public Buku(String judul, String kategori, double hargaSewa, double hargaDenda){
        this.judul = judul;
        this.kategori = kategori;
        this.hargaSewa = hargaSewa;
        this.hargaDenda = hargaDenda;
    }

    public String getJudul() {
        return judul;
    }

    public String getKategori() {
        return kategori;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public double getHargaDenda() {
        return hargaDenda;
    }
    public String toString(){
        return String.format("%s%s %s%s %-10s%.0f %-10s%.0f", "", judul, " \t", kategori, "\t", hargaSewa, "\t", hargaDenda);
    }
}
