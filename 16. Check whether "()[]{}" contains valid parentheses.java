import java.util.Stack;

public class ValidParentheses {
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Check closing brackets against the top of the stack
            else if (c == ')' || c == '}' || c == ']') {
                // If stack is empty, there's no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                // If the popped bracket doesn't match the closing bracket, it's invalid
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
            // Note: Any other characters (like spaces) are simply ignored
        }
        
        // If the stack is empty at the end, all brackets were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Question 16 test case
        String test1 = "() []{}";
        System.out.println("Is \"" + test1 + "\" valid? " + isValid(test1));
        
        // Question 17 test cases
        String test2 = "([{}])";
        System.out.println("Is \"" + test2 + "\" valid? " + isValid(test2));
        
        String test3 = "([)]";
        System.out.println("Is \"" + test3 + "\" valid? " + isValid(test3));
    }
}
