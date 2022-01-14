public class MainSLL {
    public static void main(String[] args) {
        SLL sll1 = new SLL();
        System.out.println("SELAMAT DATANG DI SINGLE LINKED LIST(SLL)");
        System.out.println("Nama : Atika Shinta Pratiwi");
        System.out.println("NIM : 185150601111020");
        System.out.println();
//        sll1.addLast(new Node(2));
//        sll1.addFirst(new Node(4));
//        sll1.addFirst(new Node(3));
        sll1.insertBefore(1, new Node (4));
        System.out.println("Saat ini, kondisi SLL memiliki "+sll1.size+" node");
        System.out.println("Head : "+sll1.head.getData());
        System.out.println("Tail  : "+sll1.tail.getData());
        }
    }


