public class DLL {
    public Node2P head, tail;
    private int size;

    public DLL(){
        head = tail = null;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(Mahasiswa data){
        Node2P input = new Node2P();
        input.setData(data);
        if (isEmpty()){
            input.setPrev(head);
            input.setNext(tail);
            head = input;
            tail = input;
        } else {
            input.setNext( head);
            head.setPrev(input);
            head = input;
        } size++;
    }

    public void addLast(Mahasiswa data){
        Node2P input = new Node2P();
        input.setData(data);
        if (isEmpty()){
            input.setPrev(head);
            input.setNext(tail);
            head = input;
            tail = input;
        } else {
            input.setPrev(tail);
            tail.setNext(input);
            tail = input;
        } size++;
    }

    public void sisipDataTerurut(Mahasiswa input){
        if (head == null){
            addFirst(input);
        } else {
            Node2P temp = head;
            Node2P a = new Node2P();
            a.setData(input);
            if (a.getData().getIpk() < temp.getData().getIpk()){
                addFirst(input);
                return;
            } if (size == 1){
                if (a.getData().getIpk() > temp.getData().getIpk()){
                    addLast(input);
                    return;
                }
            } else {
                while (temp.getNext() != null){
                    if (a.getData().getIpk() >= temp.getData().getIpk()
                            && a.getData().getIpk() < temp.getNext().getData().getIpk()){
                        a.setNext(temp.getNext());
                        a.setPrev(temp);
                        temp.getNext().setPrev(a);
                        temp.setNext(a);
                        size++;
                        return;
                    } temp = temp.getNext();
                }
            } temp.setNext(a);
            a.setPrev(temp);
        }
    }

    public void sisipDataTerurutDes(Mahasiswa input){
        if (head == null){
            addFirst(input);
        } else {
            Node2P temp = head;
            Node2P a = new Node2P();
            a.setData(input);
            if (a.getData().getIpk() > temp.getData().getIpk()){
                addFirst(input);
                return;
            } if (size == 1){
                if (a.getData().getIpk() < temp.getData().getIpk()){
                    addLast(input);
                    return;
                }
            } else {
                while (temp.getNext() != null){
                    if (a.getData().getIpk() <= temp.getData().getIpk() && a.getData().getIpk() > temp.getNext().getData().getIpk()){
                        a.setNext(temp.getNext());
                        a.setPrev(temp);
                        temp.getNext().setPrev(a);
                        temp.setNext(a);
                        size++;
                        return;
                    } temp = temp.getNext();
                }
            } temp.setNext(a);
            a.setPrev(temp);
        }
    }

    public void cetak(){
        Node2P temp = head;
        while (temp != null){
            System.out.print(temp.getData());
            temp = temp.getNext();
        }
        System.out.println();
    }
}
