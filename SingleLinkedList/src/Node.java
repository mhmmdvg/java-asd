public class Node {
     int data;
     Node pointer;

     public Node (){
     }

     public Node(int data) {
     this.data = data;
     }

     public Node(int data, Node pointer) {
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


