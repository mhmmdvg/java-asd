public class Node {
    int data;
    int tinggi; //tinggi node
    Node pKiri;
    Node pKanan;
    Node pInduk;// pointer ke induk
//constructor node

    public Node(int dt, int tg, Node pKi, Node pKa, Node pI) {
        this.data = dt;
        this.tinggi = tg;
        this.pKiri = pKi;
        this.pKanan = pKa;
        this.pInduk = pI;
    }
}