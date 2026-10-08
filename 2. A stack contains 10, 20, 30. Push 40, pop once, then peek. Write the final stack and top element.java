import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        // Initialize the stack
        Stack<Integer> stack = new Stack<>();

        // Initial state: stack contains 10, 20, 30
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Initial Stack: " + stack);

        // Push 40
        stack.push(40);
        System.out.println("After pushing 40: " + stack);

        // Pop once
        stack.pop();
        
        // Peek at the top element
        int topElement = stack.peek();

        // Print final results
        System.out.println("Final Stack: " + stack);
        System.out.println("Top Element: " + topElement);
    }
}
