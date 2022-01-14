public class CDLL {
    NodeCDLL pAwal, pAkhir;
    private int jumlah;

    public CDLL() {
        pAwal = pAkhir = null;
        jumlah = -1;
    }

    public void sisipDataDiAwal(NodeCDLL input) {
        if (pAwal == null) {
            pAwal = pAkhir = input;
            jumlah = 0;
        } else {
            input.sebelum = pAkhir;
            input.setelah = pAwal;
            pAwal.sebelum = input;
            pAkhir.setelah = input;
            pAwal = input;
            jumlah++;
        }
    }

    public void sisipDataDiAkhir(NodeCDLL input) {
        if (pAwal == null) {
            pAwal = pAkhir = input;
            jumlah = 0;
        } else {
            input.sebelum = pAkhir;
            input.setelah = pAwal;
            pAkhir.setelah = input;
            pAwal.sebelum = input;
            pAkhir = input;
            jumlah++;
        }
    }

    public void hapusData(int dtHapus) {
        NodeCDLL temp = pAwal;
        while (temp.setelah != pAwal && temp.data != dtHapus) {
            temp = temp.setelah;
        }
        if (temp == pAwal) {
            pAwal.setelah = pAwal;
            pAwal.sebelum = pAkhir;
            pAkhir.setelah = pAwal;
        } else if (temp == pAkhir) {
            pAkhir.sebelum = pAkhir;
            pAkhir.setelah = pAwal;
            pAwal.sebelum = pAkhir;
        } else {
            temp.sebelum.setelah = temp.setelah;
            temp.setelah.sebelum = temp.sebelum;
        }
        jumlah--;
    }

    public void cetak(String Komentar) {
        System.out.println(Komentar);
        NodeCDLL pCetak;
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
