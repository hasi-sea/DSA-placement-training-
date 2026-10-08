class CustomStack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public CustomStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // push() - Adds an element to the top of the stack
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + item);
            return;
        }
        stack[++top] = item;
        System.out.println(item + " pushed into stack.");
    }

    // pop() - Removes and returns the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop from an empty stack.");
            return -1; 
        }
        return stack[top--];
    }

    // peek() - Returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        }
        return stack[top];
    }

    // Helper method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Helper method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        CustomStack myStack = new CustomStack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Top element is: " + myStack.peek());
        System.out.println(myStack.pop() + " popped from stack.");
        System.out.println("Top element is now: " + myStack.peek());
    }
}
