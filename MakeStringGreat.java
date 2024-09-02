import java.util.Stack;

public class MakeStringGreat {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) {
                stack.pop(); // Remove the top element if it forms a bad pair with the current character
            } else {
                stack.push(c); // Otherwise, add the current character to the stack
            }
        }

        // Build the resulting string from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
