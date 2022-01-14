public class ADTGraph {
    public static void main(String[] args) {

        Graph g = new Graph(5);
        g.addAdj(0, 3);
        g.addAdj(0, 1);
        g.addAdj(1, 4);
        g.addAdj(1, 2);
        g.addAdj(2, 4);
        g.addAdj(2, 1);
        g.addAdj(4, 3);
        g.cetak("Kondisi awal");
    }
}
