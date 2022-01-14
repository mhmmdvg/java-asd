import java.util.Random;
public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }
    public void sisipDtNode(int dtSisip){
        if (root == null)
            root = new Node( dtSisip );
        else
            root.sisipDt(dtSisip);
    }
    public void preorderTraversal() {
        preorder(root);
    }
    private void preorder(Node node){
        if(node == null) return;
        System.out.printf( "%d ", node.data );
        preorder(node.nodeKiri);
        preorder(node.nodeKanan);
    }
    public void inorderTraversal(){
        inorder( root );
    }
    private void inorder(Node node){
        if (node == null) return;
        inorder(node.nodeKiri);
        System.out.printf( "%d ", node.data );
        inorder( node.nodeKanan );
    }
    public void postorderTraversal(){
        postorder( root );
    }
    private void postorder(Node node){
        if (node == null) return;
        postorder(node.nodeKiri);
        postorder(node.nodeKanan);
        System.out.printf( "%d ", node.data );
    }
    public static void main(String args[]) {
        Tree Tree = new  Tree();
        int nilai;
        Random randomNumber = new Random();
        System.out.println( "sisip nilai data berikut : " );
        for ( int i = 1; i <= 10; i++ ) {
            nilai = randomNumber.nextInt( 100 );
            System.out.print(nilai + " " );
            Tree.sisipDtNode(nilai);
        }
        System.out.println ( "\n\nPreorder traversal" );
        Tree.preorderTraversal();
        System.out.println ( "\n\nInorder traversal" );
        Tree.inorderTraversal();
        System.out.println ( "\n\nPostorder traversal" );
        Tree.postorderTraversal();
        System.out.println();
    }
}
