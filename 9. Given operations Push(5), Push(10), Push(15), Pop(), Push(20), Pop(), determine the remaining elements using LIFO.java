import java.util.Stack;

public class DetermineRemainingElements {
    public static void main(String[] args) {
        // Create a stack to hold integers
        Stack<Integer> stack = new Stack<>();

        System.out.println("--- Executing Operations ---");

        // Push(5)
        stack.push(5);
        System.out.println("Push(5)  -> Stack: " + stack);

        // Push(10)
        stack.push(10);
        System.out.println("Push(10) -> Stack: " + stack);

        // Push(15)
        stack.push(15);
        System.out.println("Push(15) -> Stack: " + stack);

        // Pop()
        System.out.println("Pop()    -> Removed: " + stack.pop());
        System.out.println("            Stack: " + stack);

        // Push(20)
        stack.push(20);
        System.out.println("Push(20) -> Stack: " + stack);

        // Pop()
        System.out.println("Pop()    -> Removed: " + stack.pop());
        System.out.println("            Stack: " + stack);

        // Final result
        System.out.println("\n--- Final State ---");
        System.out.println("Remaining elements (Bottom to Top): " + stack);
    }
}
