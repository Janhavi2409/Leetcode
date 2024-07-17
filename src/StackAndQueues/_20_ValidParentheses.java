package StackAndQueues;

import java.util.Stack;

public class _20_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '(') {
                stack.push(')');
            } else if (i == '{') {
                stack.push('}');
            } else if (i == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != i) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
