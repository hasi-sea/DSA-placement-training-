import java.util.Stack;

public class BalancedExpression {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            // Push opening parenthesis onto the stack
            if (c == '(') {
                stack.push(c);
            } 
            // When a closing parenthesis is found, check for a matching opening one
            else if (c == ')') {
                // If stack is empty, there is no matching opening parenthesis
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
            // All other characters (a, b, +, *, c) are simply ignored
        }

        // If the stack is empty at the end, all parentheses were balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "((a+b)*c)";
        
        System.out.println("Expression: " + expression);
        
        if (isBalanced(expression)) {
            System.out.println("Result: All parentheses are balanced.");
        } else {
            System.out.println("Result: Parentheses are NOT balanced.");
        }
    }
}
