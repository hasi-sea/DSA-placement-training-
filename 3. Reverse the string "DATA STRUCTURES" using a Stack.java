import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String str = "DATA STRUCTURES";
        
        // Create a stack to hold characters
        Stack<Character> stack = new Stack<>();
        
        // Push each character of the string onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        
        // Pop the characters from the stack to reverse them
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }
        
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr.toString());
    }
}
