public class Stack {
    Node head, tail, top;

    void Inisialisasi(){
        head = tail = top = null;
    }

    boolean IsEmpty(){
        return top == null;
    }

    void AddLast(Node baru){
        if (IsEmpty()){
            head = tail = baru;
        }else{
            tail.pointer = baru;
            tail = baru;
        }
    }

    void Push(Node baru){
        AddLast(baru);
        top = tail;
    }

    void RemoveLast(){
        Node temp = head;
        if(!IsEmpty()){
            if (head == tail){
                head = tail = null;
                return;
            }
            while(temp.pointer != tail){
                temp = temp.pointer;
            }
            tail = temp;
            tail.pointer = null;
        }
    }

    int Pop(){
        int tampung = top.data;
        RemoveLast();
        top = tail;
        return tampung;
    }

    int Peek(){
        return top.data;
    }
}
