public class CircularQueue {

    int[] queue;
    int front;
    int rear;
    int size;

    // Constructor
    CircularQueue(int size) {

        this.size = size;
        queue = new int[size];

        front = -1;
        rear = -1;
    }

    // Enqueue
    void enqueue(int data) {

        // Check if queue is full
        if ((rear + 1) % size == front) {

            System.out.println("Queue is Full");
            return;
        }

        // First element
        if (front == -1) {

            front = 0;
            rear = 0;
        }
        else {

            rear = (rear + 1) % size;
        }

        queue[rear] = data;

        System.out.println(data + " inserted");
    }

    // Dequeue
    int dequeue() {

        // Check if queue is empty
        if (front == -1) {

            System.out.println("Queue is Empty");
            return -1;
        }

        int data = queue[front];

        // If only one element is present
        if (front == rear) {

            front = -1;
            rear = -1;
        }
        else {

            front = (front + 1) % size;
        }

        return data;
    }

    // Display
    void display() {

        // Check if queue is empty
        if (front == -1) {

            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        while (true) {

            System.out.print(queue[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % size;
        }

        System.out.println();
    }
}