import java.util.Stack;

public class ValidateBrackets {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Process closing brackets
            else if (c == ')' || c == '}' || c == ']') {
                // If stack is empty, it means there is an unmatched closing bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                // Check if the closing bracket matches the most recent opening bracket
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty at the end, all brackets were correctly validated
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "{[()]}{}";
        
        System.out.println("Expression: " + expression);
        
        if (isValid(expression)) {
            System.out.println("Result: The bracket types are valid.");
        } else {
            System.out.println("Result: The bracket types are invalid.");
        }
    }
}
