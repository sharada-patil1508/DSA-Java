
package DSA;

public class Circular_queue{
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int front, rear, size;


    public Circular_queue(int size) {
        this.data = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isFull() {
        return (rear + 1) % data.length == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % data.length;
        data[rear] = item;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int removed = data[front];
        if (front == rear) {
            front = -1; // Queue is empty
            rear = -1;
        } else {
            front = (front + 1) % data.length;
        }
        return removed;
    }

    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Circular Queue: ");
        for (int i = front; i != rear; i = (i + 1) % data.length) {
            System.out.print(data[i] + " ");
        }
       // System.out.print(data[rear] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
    	Circular_queue queue = new Circular_queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.display();
       /* System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // This will throw an exception if the queue is full
        queue.display();*/
    }
}


