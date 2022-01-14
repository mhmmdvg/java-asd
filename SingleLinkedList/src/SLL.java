public class SLL {
    Node head, tail;
    int size;

    public void inisialisasi() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(Node baru) {
        if (isEmpty()) {
            this.head = baru;
            this.tail = baru;
        } else {
            baru.setPointer(this.head);
            this.head = baru;
        }
        this.size++;
    }

    public void addLast(Node baru) {
        if (isEmpty()) {
            this.head = baru;
            this.tail = baru;
        } else {
            baru.setPointer(this.tail);
            this.tail = baru;
        }
        this.size++;
    }

    public void insertAfter(int key, Node baru) {
        Node temp = head;
        if (!isEmpty()) {
            while (temp != null) {
                if (temp.getData() == key) {
                    baru.setPointer(temp.getPointer());
                    temp.setPointer(baru);
                    System.out.println("Penambahan data berhasil!");
                    break;
                } else if (key == tail.getData() ) {
                    this.addLast(baru);
                    System.out.println("Berhasil menambahkan data!");
                    break;
                }
                temp = temp.getPointer();
                this.size++;
            }
        }
    }

    public void insertBefore(int key, Node baru) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == key && temp == head) {
                this.addFirst(baru);
                System.out.println("Penambahan data berhasil!");
                break;
            } else if (temp.pointer.getData() == key) {
                baru.setPointer(temp.getPointer());
                temp.setPointer(baru);
                System.out.println("BBerhasil menambahkan data!");
                break;
            }
            temp = temp.getPointer();
            this.size++;
        }
    }

    public void removeFirst() {
        Node temp = head;
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                temp = temp.getPointer();
                head = temp;
                temp = null;
            }
            size--;
        } else {
            System.out.println("Data Tidak ada (Kosong)");
        }
    }


    public void remove(int key) {
        Node temp = head;
        if (!isEmpty()) {
            do {
                if (temp.getPointer().getData() == key) {
                    temp.setPointer(temp.getPointer().getPointer());
                    size--;
                    break;
                } else if (temp.getData() == key && temp == head) {
                    this.removeFirst();
                    break;
                }
                temp = temp.getPointer();
                size--;
            } while (temp != null);
        } else {
            System.out.println("Data Tidak ada (Kosong)");
        }
    }

    void removeLast() {
        Node temp = head;
        if (!isEmpty()) {
            if (tail == head) {
                head = tail = null;
            } else {
                while (temp.getPointer() != null){
                    temp = temp.getPointer();
                }
                temp.setPointer(null);
                tail = temp;
                temp = null;
            }size--;
        }
        else System.out.println("Data Tidak ada (Kosong)");
    }

    public void pengaksesan() {
        Node p = head;
        while (p != null) {
            System.out.println(p.getData());
            p = p.getPointer();
        }
    }
}
