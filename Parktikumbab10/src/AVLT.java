public class AVLT {
    private Node root;

    public AVLT() {
        root = null;
    }
//cari dt di tree, mengembalikan true jika ditemukan
//dan false jika tidak

    public boolean cariDt(int dt) {
        Node temp = root;
        while (temp != null) {
            if (dt == temp.data) {
                return true;
            } //cariDt subtree pKiri
            else if (dt < temp.data) {
                temp = temp.pKiri;
            } //cariDt subtree pKanan
            else {
                temp = temp.pKanan;
            }
        }
//dt tidak ditemukan
        return false;
    }
//sisip dt ke dalam tree, returns true if berhasil,
    // false jika gagal
//tree diseimbangkan menggunakan algoritma AVL

    public boolean sisipDt(int dt) {
        if (root == null) {
//sisip dt di root
            root = new Node(dt, 1, null, null, null);
            return true;
        } //tree tidak kosong
        else {
//mulai dari root
            Node temp = root;
            Node prev = null;
//cari lokasi penyisipan dt
            while (temp != null) {
                if (dt == temp.data) {
                    return false;
                } //sisip dt di subtree pKiri
                else if (dt < temp.data) {
                    prev = temp;
                    temp = temp.pKiri;
                } //sisip dt di subtree pKanan
                else {
                    prev = temp;
                    temp = temp.pKanan;
                }
            }
//buat node baru
            temp = new Node(dt, 1, null, null, prev);
            if (dt < prev.data) {
                prev.pKiri = temp;//sisip di pKiri
            } else prev.pKanan = temp; //sisipDt atpKanan //mulai dari node yang disisipkan dan
            //bergerak menuju root

            while (temp != null) {
//subtree pKiri dan pKanan memenuhikondisi AVL
                if (Math.abs(tinggi(temp.pKiri)
                        - tinggi(temp.pKanan)) <= 1) {
                    temp.tinggi = Math.max(tinggi(temp.pKiri),
                            tinggi(temp.pKanan)) + 1;
                } //kasus 1 algoritma AVL
                else if (tinggi(temp.pKiri)
                        - tinggi(temp.pKanan) >= 2
                        && tinggi(temp.pKiri.pKiri)
                        >= tinggi(temp.pKiri.pKanan)) {
                    Node parent = temp.pInduk;
                    Node pKiri = temp.pKiri;
                    temp.pKiri = pKiri.pKanan;
                    if (temp.pKiri != null) {
                        temp.pKiri.pInduk = temp;
                    }
                    pKiri.pKanan = temp;
                    temp.pInduk = pKiri;
                    pKiri.pInduk = parent;
                    if (parent == null) {
                        root = pKiri;
                    } else {
                        if (parent.pKiri == temp) {
                            parent.pKiri = pKiri;
                        } else {
                            parent.pKanan = pKiri;
                        }
                    }
//hitung tinggi subtree pKanan
                    temp.tinggi
                            = Math.max(tinggi(temp.pKiri),
                            tinggi(temp.pKanan)) + 1;
                    temp = pKiri;
//hitung tinggi dari root
                    temp.tinggi
                            = Math.max(tinggi(temp.pKiri),
                            tinggi(temp.pKanan)) + 1;
                } //case 2 algoritma AVl
                else if (tinggi(temp.pKanan)
                        - tinggi(temp.pKiri) >= 2
                        && tinggi(temp.pKanan.pKanan)
                        >= tinggi(temp.pKanan.pKiri)) {
                    Node parent = temp.pInduk;
                    Node pKanan = temp.pKanan;
                    temp.pKanan = pKanan.pKiri;
                    if (temp.pKanan != null) {
                        temp.pKanan.pInduk = temp;
                    }
                    pKanan.pKiri = temp;
                    temp.pInduk = pKanan;
                    pKanan.pInduk = parent;
                    if (parent == null) {
                        root = pKanan;
                    } else if (parent.pKanan == temp) {
                        parent.pKanan = pKanan;
                    } else {
                        parent.pKiri = pKanan;
                    }
//hitung tinggi subtree pKanan
                    temp.tinggi
                            = Math.max(tinggi(temp.pKiri),
                            tinggi(temp.pKanan)) + 1;
                    temp = pKanan;
//hitung tinggi dari root
                    temp.tinggi
                            = Math.max(tinggi(temp.pKiri),
                            tinggi(temp.pKanan)) + 1;
                } //kasus 3 dari algoritma AVL
                else if (tinggi(temp.pKiri)
                        - tinggi(temp.pKanan) >= 2
                        && tinggi(temp.pKiri.pKanan)
                        >= tinggi(temp.pKiri.pKiri)) {
                    Node parent = temp.pInduk;
                    Node pKiripKanan
                            = temp.pKiri.pKanan;
                    temp.pKiri.pKanan
                            = pKiripKanan.pKiri;
                    if (temp.pKiri.pKanan != null) {
                        temp.pKiri.pKanan.pInduk
                                = temp.pKiri;
                    }
                    pKiripKanan.pKiri = temp.pKiri;
                    temp.pKiri.pInduk = pKiripKanan;
                    temp.pKiri = pKiripKanan.pKanan;
                    if (temp.pKiri != null) {
                        temp.pKiri.pInduk = temp;
                    }
                    pKiripKanan.pKanan = temp;
                    temp.pInduk = pKiripKanan;
                    pKiripKanan.pInduk = parent;
                    if (parent == null) {
                        root
                                = pKiripKanan;
                    } else if (parent.pKiri == temp) {
                        parent.pKiri = pKiripKanan;
                    } else {
                        parent.pKanan = pKiripKanan;
                    }
//hitung tinggi subtree pKanan
                    temp.tinggi
                            = Math.max(tinggi(temp.pKiri),
                            tinggi(temp.pKanan)) + 1;
                    temp = pKiripKanan;
//hitung tinggi dari root
                    temp.tinggi
                            = Math.max(tinggi(temp.pKiri),
                            tinggi(temp.pKanan)) + 1;
                } //kasus 4 dari algoritma AVL
                else if (tinggi(temp.pKanan)
                        - tinggi(temp.pKiri) >= 2
                        && tinggi(temp.pKanan.pKiri)
                        >= tinggi(temp.pKanan.pKanan)) {
                    Node parent = temp.pInduk;
                    Node pKananpKiri
                            = temp.pKanan.pKiri;
                    temp.pKanan.pKiri
                            = pKananpKiri.pKanan;
                    if (temp.pKanan.pKiri != null) {
                        temp.pKanan.pKiri.pInduk
                                = temp.pKanan;
                    }
                    pKananpKiri.pKanan = temp.pKanan;
                    temp.pKanan.pInduk = pKananpKiri;
                    temp.pKanan = pKananpKiri.pKiri;
                    if (temp.pKanan != null) {
                        temp.pKanan.pInduk = temp;
                    }
                    pKananpKiri.pKiri = temp;
                    temp.pInduk = pKananpKiri;
                    pKananpKiri.pInduk = parent;
                    if (parent == null) {
                        root
                                = pKananpKiri;
                    } else if (parent.pKanan == temp) {
                        parent.pKanan = pKananpKiri;
                    } else {
                        parent.pKiri = pKananpKiri;
                    }
                    temp.tinggi
                            = Math.max(tinggi(temp.pKiri),
                            tinggi(temp.pKanan)) + 1;
                    temp = pKananpKiri;
                    temp.tinggi
                            = Math.max(tinggi(temp.pKiri),
                            tinggi(temp.pKanan)) + 1;
                }
                temp = temp.pInduk;
            }
//penyisipan berhasil
            return true;
        }
    }

    public int tinggi() {
        return root.tinggi;
    }

    private int tinggi(Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.tinggi;
        }
    }
//hitung node-node dari tree

    public int jumlahNode() {
        return jumlahNode(root);
    }

    public void inOrderTraversal() {
        inOrder(root);
    }

    private void inOrder(Node r) {
        if (r == null) {
            return;
        }
        inOrder(r.pKiri);
        System.out.printf("-%d", r.data);
        inOrder(r.pKanan);
    }
//hitung node-node dari tree

    private int jumlahNode(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + jumlahNode(node.pKiri)
                    + jumlahNode(node.pKanan);
        }

    }
}