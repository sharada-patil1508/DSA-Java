package DSA;

public class Customequeue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0; // Initialize end to 0 instead of -1

    public Customequeue() {
        this(DEFAULT_SIZE);
    }

    public Customequeue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[0];

        // Shift elements to the left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + "<-");
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        Customequeue queue = new Customequeue(5);
        queue.insert(7);
        queue.insert(7);
        queue.insert(7);
        queue.insert(9);
        queue.insert(99);
        
        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
         
    }
}
