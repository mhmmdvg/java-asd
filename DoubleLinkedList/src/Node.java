public class Node {
    private Node next, prev;
    Mahasiswa data;

    public Node() {
    }

    public Node(Mahasiswa data){
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Mahasiswa getData() {
        return data;
    }

    public void setData(Mahasiswa data) {
        this.data = data;
    }
}
