public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.Push(new Node(1));
        myStack.Push(new Node(2));
        myStack.Push(new Node(3));
        System.out.println(myStack.Pop());
        System.out.println(myStack.top.data);
    }
}
