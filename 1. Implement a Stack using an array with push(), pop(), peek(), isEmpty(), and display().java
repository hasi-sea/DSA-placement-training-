public class StackUsingArray {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public StackUsingArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Method to add an element to the stack
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + x);
            return;
        }
        arr[++top] = x;
        System.out.println("Pushed: " + x);
    }

    // Method to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1; // Return -1 or throw an exception to indicate error
        }
        System.out.println("Popped: " + arr[top]);
        return arr[top--];
    }

    // Method to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot peek.");
            return -1;
        }
        return arr[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the stack operations
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        
        stack.display();
        
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
