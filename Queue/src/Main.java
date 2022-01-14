public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.Enqueue(new Node(1));
        myQueue.Enqueue(new Node(2));
        System.out.println(myQueue.Dequeue());
        System.out.println(myQueue.Peek());
        myQueue.Enqueue(new Node(3));
        myQueue.Enqueue(new Node(4));
        System.out.println(myQueue.Dequeue());
        System.out.println(myQueue.Dequeue());

    }
}
