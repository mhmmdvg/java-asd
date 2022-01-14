package sample;
import sample.Node;

public class SLL {
    Node head, tail;
    int size=0;

    public void Inisialisasi(){
        head = tail = null;
    }

    public boolean isEmpty(){
            return size==0;
    }

    public void AddFirst(int baru){
        if(isEmpty()){
            head=tail= baru;
        }else{
            baru.setPointer(this.head);
            head = baru;
        } size++;
    }

}
