public class StackOverflowHandling {
    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor to initialize the stack with a specific capacity
    public StackOverflowHandling(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = -1; // -1 indicates the stack is empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        // Preventive approach: Check if the stack is already full
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value + ". The stack has reached its maximum capacity of " + capacity + ".");
            return; // Exit the method to prevent out-of-bounds error
        }

        // If not full, push the element
        stackArray[++top] = value;
        System.out.println("Successfully pushed: " + value);
    }

    public static void main(String[] args) {
        // Create an array-based stack with capacity 5
        StackOverflowHandling stack = new StackOverflowHandling(5);

        System.out.println("--- Filling the Stack ---");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50); // The stack is now full (5 elements)

        System.out.println("\n--- Attempting to push a 6th element ---");
        // This push will trigger the Stack Overflow handling
        stack.push(60); 
    }
}
