public class Node2P {
    private Node2P next, prev;
    Mahasiswa data;

    public Node2P() {
    }

    public Node2P(Mahasiswa data){
        this.data = data;
    }

    public Node2P getNext() {
        return next;
    }

    public void setNext(Node2P next) {
        this.next = next;
    }

    public Node2P getPrev() {
        return prev;
    }

    public void setPrev(Node2P prev) {
        this.prev = prev;
    }

    public Mahasiswa getData() {
        return data;
    }

    public void setData(Mahasiswa data) {
        this.data = data;
    }
}
