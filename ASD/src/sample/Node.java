package sample;

public class Node {
    public int data;
    public Node pointer;

    public void Node(){
    }

    public void Node(int data){
        this.data = data;
    }

    public void Node(int data, Node pointer){
        this.data = data;
        this.pointer = pointer;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPointer() {
        return pointer;
    }

    public void setPointer(Node pointer) {
        this.pointer = pointer;
    }
}
