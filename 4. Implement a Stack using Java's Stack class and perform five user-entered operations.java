import java.util.Stack;
import java.util.Scanner;

public class UserStackOperations {
    public static void main(String[] args) {
        // Implement Stack using Java's built-in Stack class
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Stack Operations Menu ---");
        System.out.println("1. Push (Add element)");
        System.out.println("2. Pop (Remove top element)");
        System.out.println("3. Peek (View top element)");
        System.out.println("4. Display Stack");
        System.out.println("5. Check if Empty");
        System.out.println("-----------------------------");

        // Loop to perform exactly 5 user-entered operations
        for (int i = 1; i <= 5; i++) {
            System.out.print("\nOperation " + i + " of 5 - Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    System.out.println(value + " pushed to the stack.");
                    break;

                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack Underflow! The stack is empty.");
                    } else {
                        System.out.println("Popped element: " + stack.pop());
                    }
                    break;

                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty! Nothing to peek.");
                    } else {
                        System.out.println("Top element is: " + stack.peek());
                    }
                    break;

                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is currently empty.");
                    } else {
                        System.out.println("Current Stack (bottom to top): " + stack);
                    }
                    break;

                case 5:
                    System.out.println("Is the stack empty? " + stack.isEmpty());
                    break;

                default:
                    System.out.println("Invalid choice! Please select a number between 1 and 5.");
                    i--; // Decrement to ensure the user still gets 5 valid operations
                    break;
            }
        }

        System.out.println("\nFinished 5 operations. Final Stack state: " + stack);
        scanner.close();
    }
}
