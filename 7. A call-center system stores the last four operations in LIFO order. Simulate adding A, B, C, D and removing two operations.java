import java.util.Stack;

public class CallCenterSystem {
    public static void main(String[] args) {
        // Create a stack to store call-center operations
        Stack<String> operationsStack = new Stack<>();

        // Simulate adding operations A, B, C, D
        System.out.println("--- Adding Operations ---");
        operationsStack.push("A");
        operationsStack.push("B");
        operationsStack.push("C");
        operationsStack.push("D");
        
        System.out.println("Current Operations Stack (Bottom to Top): " + operationsStack);

        // Simulate removing two operations (LIFO order)
        System.out.println("\n--- Removing 2 Operations ---");
        if (!operationsStack.isEmpty()) {
            System.out.println("Removed: " + operationsStack.pop());
        }
        if (!operationsStack.isEmpty()) {
            System.out.println("Removed: " + operationsStack.pop());
        }

        // Display the remaining operations in the stack
        System.out.println("\nRemaining Operations Stack (Bottom to Top): " + operationsStack);
    }
}
