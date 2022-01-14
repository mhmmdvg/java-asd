public class CSLL {
    private NodeCSLL pAwal, pAkhir;
    private int jumlah;

    public CSLL() {
        pAwal = pAkhir = null;
        jumlah = -1;
    }

    public void SisipDataDiAwal(NodeCSLL input) {
        if (pAwal == null) {
            pAwal = pAkhir = input;
            jumlah = 0;
        } else {
            input.setelah = pAwal;
            pAkhir.setelah = input;
            pAwal = input;
            jumlah++;
        }
    }

    public void sisipDataDiAkhir(NodeCSLL input) {
        if (pAwal == null) {
            pAwal = pAkhir = input;
            jumlah = 0;
        } else {
            pAkhir.setelah = input;
            pAkhir = input;
            pAkhir.setelah = pAwal;
            jumlah++;
        }
    }

    public void hapusData(int dtHapus) {
        if (pAwal != null) {
            NodeCSLL pSbl, pKini, pHapus;
            pSbl = null;
            pKini = pAwal;
            boolean ketemu = false;
            int i = 0;
            while (!ketemu && (i <= jumlah)) {
                if (pKini.data == (dtHapus)) {
                    ketemu = true;
                } else {
                    pSbl = pKini;
                    pKini = pKini.setelah;
                }
                i++;
            }
            if (ketemu) {
                if (pSbl == null) {
                    pHapus = pAwal;
                    pAwal = pKini.setelah;
                    pAkhir.setelah = pAwal;
                    pHapus = null;
                } else {
                    if (pAkhir == pKini) {
                        pAkhir = pSbl;
                    }
                    pSbl.setelah = pKini.setelah;
                    pHapus = pKini;
                    pHapus = null;
                }
                jumlah--;
            }
        }
    }

    public void hapusSatuDataDiAwal() {
        if (pAwal == pAkhir) {
            pAwal = null;
            jumlah = 0;
        } else {
            pAwal = pAwal.setelah;
            pAkhir.setelah = pAwal;
            jumlah--;
        }
    }

    public void hapusSatuDataDiAkhir() {
        NodeCSLL temp = pAwal;
        if (pAwal == pAkhir) {
            pAwal = null;
            jumlah = 0;
        } else {
            while (temp.setelah.setelah != pAwal) {
                temp = temp.setelah;
            }
            temp.setelah = pAwal;
            jumlah--;
        }
    }

    public void cetak(String Komentar) {
        System.out.println(Komentar);
        NodeCSLL pCetak;
        pCetak = pAwal;
        int i = -1;
        while ((i < jumlah)) {
            System.out.print(pCetak.data + " ");
            pCetak = pCetak.setelah;
            i++;
        }
        System.out.println();
    }

}
