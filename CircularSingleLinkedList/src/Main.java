public class Main {
    public static void main(String[] args) {
        CSLL csll = new CSLL();

        csll.SisipDataDiAwal(new NodeCSLL(5));
        csll.SisipDataDiAwal(new NodeCSLL(2));
        csll.SisipDataDiAwal(new NodeCSLL(8));
        csll.sisipDataDiAkhir(new NodeCSLL(1));
        csll.cetak("Data CSLL:");
        csll.hapusData(2);
        csll.cetak("Kondisi setelah angka 2 dihapus :");
        csll.hapusSatuDataDiAwal();
        csll.cetak("Kondisi setelah hapus data di depan");
        csll.hapusSatuDataDiAkhir();
        csll.cetak("Kondisi setelah hapus data di akhir");
    }

}
