package DSA;

public class Deque {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int front, rear, size;

    public Deque() {
        this(DEFAULT_SIZE);
    }

    public Deque(int size) {
        this.data = new int[size];
        this.front = -1;
        this.rear = 0;
        this.size = size;
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1); //(front == rear + 1)  for circular queue
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void insertFront(int item) {
        if (isFull()) {
            throw new RuntimeException("Deque is full");
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front--;
        }
        data[front] = item;
    }

    public void insertRear(int item) {
        if (isFull()) {
            throw new RuntimeException("Deque is full");
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }
        data[rear] = item;
    }

    public int removeFront() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        int removed = data[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
        return removed;
    }

    public int removeRear() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        int removed = data[rear];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
        return removed;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        System.out.print("Deque: ");
        for (int i = front; i != rear; i = (i + 1) % size) {
            System.out.print(data[i] + " ");
        }
        System.out.print(data[rear] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Deque deque = new Deque(5);
        deque.insertRear(10);
        deque.insertRear(20);
        deque.insertFront(5);
        deque.display();
        System.out.println("Removed from front: " + deque.removeFront());
        System.out.println("Removed from rear: " + deque.removeRear());
        deque.display();
    }
}
