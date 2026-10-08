import java.util.Stack;

public class ValidParenthesesCheck {
    
    // Method to check if the string has valid parentheses
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Process closing brackets
            else if (c == ')' || c == '}' || c == ']') {
                // If stack is empty, there is an unmatched closing bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                // Check if the popped opening bracket matches the current closing bracket
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // If stack is empty at the end, all brackets were correctly matched and closed
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // The two specific test cases from Question 17
        String test1 = "([{}])";
        String test2 = "([)]";
        
        System.out.println("Testing string: \"" + test1 + "\"");
        System.out.println("Is valid? " + isValid(test1));
        
        System.out.println("\nTesting string: \"" + test2 + "\"");
        System.out.println("Is valid? " + isValid(test2));
    }
}
