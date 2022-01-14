public class SLL {
    private Node pointer;

    public SLL() {
        pointer = null;
    }
    public void buatNode(Object dt){
        Node nodebaru = new Node();
        nodebaru.data = dt;
        nodebaru.next = pointer;
        pointer = nodebaru;
    }
    public boolean sisip(Object dt1, Object dt2){
        Node n = pointer;
        while ((n != null) && (n.data != dt2))
            n = n.next;
        if (n == null)
            return false;
        Node nn = new Node();
        nn.data = dt1;
        nn.next = n.next;
        n.next = nn;
        return true;
    }

    public Object hapusDiDepan(){
        Node hapus = pointer;
        pointer = pointer.next;
        return  hapus.data;
    }

    public void sisipDataDiAkhir(int data){
        Node pSblAkhir, pAkhir;
        pSblAkhir = null;
        pAkhir = pointer;
        Node baru = new Node();
        baru.data = data;
        baru.next = null;
        while(pAkhir != null){
            pSblAkhir = pAkhir;
            pAkhir = pAkhir.next;
        }
        pSblAkhir.next = baru;
    }

    public void sisipDataUrut(Object b, SLL c){
        buatNode(b);
        Object temp1, temp =0;
        Node n = pointer;
        Node h = c.pointer;
        while (c.pointer.next != null){
            if((int) c.pointer.data < (int) c.pointer.next.data){
                temp1 = c.pointer.data;
                c.pointer.data = c.pointer.next.data;
                c.pointer.next.data = temp1;
                temp = pointer.data;
                pointer.data = pointer.next.data;
                pointer.next.data = temp;
            }
            c.pointer = c.pointer.next;
            pointer = pointer.next;
        }
        c.pointer = h;
        pointer = n;
    }

    public void hapusData(int dataHapus){
        //lengkapi
    }
    public Node getPointer(){
        return pointer;
    }

//    public static SLL gabung (SLL L1, SLL L2){
//        //lengkapi
//    }

    //cetak data
    public void cetak(String kom){
        System.out.println(kom);
        Node n = this.pointer;
        while(n!= null){
            System.out.println(n.data+"->");
            n = n.next;
        }
        System.out.println("NULL");
    }
}