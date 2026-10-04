public class Main {

    public static void main(String[] args) {

        // Create Circular Queue of size 5
        CircularQueue q = new CircularQueue(5);

        // Enqueue
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        // Display
        System.out.println("Queue:");
        q.display();

        // Dequeue
        System.out.println("Deleted: " + q.dequeue());
        System.out.println("Deleted: " + q.dequeue());

        // Display
        System.out.println("Queue after deletion:");
        q.display();

        // Enqueue again
        q.enqueue(60);
        q.enqueue(70);

        // Display
        System.out.println("Queue after adding 60 and 70:");
        q.display();
    }
}