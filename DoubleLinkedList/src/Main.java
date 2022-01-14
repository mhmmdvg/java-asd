public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.sisipDataTerurutDes(new Mahasiswa("12345678", "Atika", 4.00));
        dll.sisipDataTerurutDes(new Mahasiswa("09876543", "Dinda", 3.50));
        dll.sisipDataTerurutDes(new Mahasiswa("20101851", "Tisha", 3.00));
        dll.cetak();
    }
}
