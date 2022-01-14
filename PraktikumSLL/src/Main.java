import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int jumlah;
        String judul, kategori;
        double sewa, denda;

        System.out.println("=====Perpustakaan=====");
        System.out.println("Nama : Atika Shinta Pratiwi");
        System.out.println("NIM  : 185150601111020");
        System.out.println();
        SLL buku = new SLL();
        SLL a = new SLL();
        System.out.print("Masukkan jumlah Buku : ");
        jumlah = in.nextInt();
        in.nextLine();
        System.out.println();
        for (int i = 0; i < jumlah; i++){
            System.out.println("Data "+ (i+1));
            System.out.print("Judul Buku: ");
            judul = in.next();

            System.out.print("Katerogi Buku: ");
            kategori = in.next();

            System.out.print("Harga Sewa: Rp.");
            sewa = in.nextDouble();
            System.out.print("Harga Denda: Rp.");
            denda = in.nextDouble();
            System.out.println();
            Buku bku = new Buku (judul, kategori, sewa, denda);
            a.buatNode((int) sewa);
            buku.sisipDataUrut(bku, a);
        }
        System.out.println("=====Data Peminjaman Buku Mahasiswa=====");
        System.out.println();
        buku.cetak("Judul \t\tKategori \tHarga Sewa \tharga Denda");

    }
}
