import java.util.Stack;

public class StackSimulation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push(10)
        stack.push(10);
        
        // push(20)
        stack.push(20);
        
        // peek()
        System.out.println("Returned from peek(): " + stack.peek());
        
        // pop()
        System.out.println("Returned from pop(): " + stack.pop());
        
        // push(30)
        stack.push(30);
        
        // peek()
        System.out.println("Returned from peek(): " + stack.peek());
        
        // Print the final stack
        System.out.println("Final stack: " + stack);
    }
}
