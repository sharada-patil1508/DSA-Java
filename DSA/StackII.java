package DSA;

public class StackII {
    
    private int[] stack;
    private int top;
    private static final int DEFAULT_SIZE = 10;

    public StackII() {
        stack = new int[DEFAULT_SIZE];
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + val);
            return; // Do not add the element if the stack is full
        }
        stack[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public static void main(String[] args) {
        StackII stack = new StackII();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        // This will show that the stack is full

        System.out.println(stack.peek()); // Output: 10
        System.out.println(stack.pop());  // Output: 10
        System.out.println(stack.pop());  // Output: 9
        System.out.println(stack.isEmpty()); // Output: false
        System.out.println(stack.size());   // Output: 9
        System.out.println(stack.isFull()); // Output: false
    }
}
