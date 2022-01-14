public class Main {
    public static void main(String[] args) {
        CDLL cdll = new CDLL();
        cdll.sisipDataDiAwal(new NodeCDLL(2));
        cdll.sisipDataDiAwal(new NodeCDLL(5));
        cdll.sisipDataDiAwal(new NodeCDLL(9));
        cdll.sisipDataDiAwal(new NodeCDLL(6));
        cdll.cetak("Kondisi CDLL");
        cdll.sisipDataDiAkhir(new NodeCDLL(1));
        cdll.cetak("Setelah menambah data di akhir");
        cdll.hapusData(1);
        cdll.cetak("Setelah data 10 dihapus");
    }

}
