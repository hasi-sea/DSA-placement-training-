import java.util.EmptyStackException;
import java.util.Stack;

public class StackUnderflowHandling {
    public static void main(String[] args) {
        // Create an empty stack
        Stack<Integer> stack = new Stack<>();

        System.out.println("Attempting to pop() and peek() on an empty stack...\n");

        // Approach 1: The Preventive Way (Using isEmpty check)
        System.out.println("--- Approach 1: Using isEmpty() ---");
        if (stack.isEmpty()) {
            System.out.println("Handled gracefully: Stack Underflow! Cannot pop because the stack is empty.");
        } else {
            System.out.println("Popped: " + stack.pop());
        }

        // Approach 2: The Reactive Way (Using Try-Catch block)
        System.out.println("\n--- Approach 2: Using Exception Handling ---");
        try {
            int topElement = stack.peek();
            System.out.println("Top element is: " + topElement);
        } catch (EmptyStackException e) {
            System.out.println("Exception caught: Stack Underflow! Cannot peek into an empty stack.");
        }
    }
}
