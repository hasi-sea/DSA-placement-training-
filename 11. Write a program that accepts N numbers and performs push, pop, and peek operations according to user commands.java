import java.util.Scanner;
import java.util.Stack;

public class StackUserCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter the number of operations (N): ");
        int n = scanner.nextInt();

        System.out.println("\nAvailable commands: \n1. push <number> \n2. pop \n3. peek \n4. display");
        System.out.println("---------------------------------------");

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter command " + i + ": ");
            String command = scanner.next().toLowerCase();

            switch (command) {
                case "push":
                    int num = scanner.nextInt();
                    stack.push(num);
                    System.out.println(" -> Pushed " + num + " to stack.");
                    break;

                case "pop":
                    if (stack.isEmpty()) {
                        System.out.println(" -> Stack Underflow! The stack is empty.");
                    } else {
                        System.out.println(" -> Popped element: " + stack.pop());
                    }
                    break;

                case "peek":
                    if (stack.isEmpty()) {
                        System.out.println(" -> Stack is empty! Nothing to peek.");
                    } else {
                        System.out.println(" -> Top element is: " + stack.peek());
                    }
                    break;

                case "display":
                    System.out.println(" -> Current Stack (bottom to top): " + stack);
                    break;

                default:
                    System.out.println(" -> Invalid command! Use push, pop, peek, or display.");
                    // Decrement counter so invalid commands don't count towards N
                    i--; 
                    break;
            }
        }

        System.out.println("\n--- All " + n + " operations completed ---");
        System.out.println("Final Stack State: " + stack);
        
        scanner.close();
    }
}
