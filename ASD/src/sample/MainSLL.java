package sample;
import sample.SLL;
import sample.Node;

public class MainSLL {
    public static void main(String[] args) {
        SLL sll1 = new SLL();
        System.out.println("Selamat datang!");
        System.out.println("Materi Pembelajaran : SLL");
        System.out.println("Nama  : Atika Shinta Pratiwi");
        System.out.println("NIM   : 185150601111020");
        System.out.println("");
        sll1.AddFirst(2);

        System.out.println("Saat ini kondisi SLL memiliki "+sll1.size+" node");
        System.out.println("Head terdapat di node "+sll1.head.getData());
        System.out.println("Tail terdapat di node "+sll1.tail.getData());
    }
}
