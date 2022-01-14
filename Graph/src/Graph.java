public class Graph {
    private class Node {

        private int data;
        private Node next;

        public Node(int dt, Node n) {
            data = dt;
            next = n;
        }

        public int getDt() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }
    private Node[] node;
    private int jNode;

    public Graph(int n) {
        jNode = n;
        node = new Node[jNode];
    }

    public void addAdj(int head, int adj) {
        Node n = new Node(adj, node[head]);
        node[head] = n;
    }

    public void cetak(String komentar) {
        System.out.println(komentar);
        for (int i = 0; i < jNode; i++) {
            System.out.print("[" + i + "]");
            Node n = node[i];
            while (n != null) {
                System.out.print("->" + n.getDt());
                n = n.getNext();
            }
            System.out.println();
        }
    }
}
