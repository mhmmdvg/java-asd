public class Queue {
    Node head, tail, front;

    void Inisialisasi(){
        head = tail = front = null;
    }

    boolean IsEmpty(){
        return front == null;
    }

    void AddLast(Node baru){
        if (IsEmpty()){
            head = tail = baru;
        }else{
            tail.pointer = baru;
            tail = baru;
        }
    }

    void Enqueue(Node baru){
        AddLast(baru);
        front = head;
    }

    void RemomveFirst(){
        if(!IsEmpty()){
            if(head==tail){
                head = tail = null;
                return;
            }
            head = head.pointer;
        }
    }

    int Dequeue(){
        int tampung = front.data;
        RemomveFirst();
        front = head;
        return tampung;
    }

    int Peek(){
        return front.data;
    }
}
