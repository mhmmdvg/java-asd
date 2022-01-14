class Node {
    Object data;
    Node anakKiri;
    Node anakKanan;

    Node(){}
    Node(Object data){
        this.data = data;
    }
}
public class BinaryTree {
    static Node root; //pointer bantu
    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        root = nodeA;
        nodeA.anakKiri = nodeB;
        nodeA.anakKanan = nodeC;
        nodeB.anakKiri = nodeD;
        nodeC.anakKanan = nodeE;
    }
}
