public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.sisipDataTerurutDes(new Mahasiswa("18515060123", "Vikri", 3.50));
        dll.sisipDataTerurutDes(new Mahasiswa("18515060111", "Askar", 3.30));
        dll.sisipDataTerurutDes(new Mahasiswa("18515060231", "Bayu", 2.99));
        dll.sisipDataTerurutDes(new Mahasiswa("18515060256", "Kiki", 3.89));
        dll.cetak();
    }
}
