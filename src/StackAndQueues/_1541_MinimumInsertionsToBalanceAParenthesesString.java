package StackAndQueues;

import java.util.Stack;

public class _1541_MinimumInsertionsToBalanceAParenthesesString {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int insert = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(') {
                stack.push(current);
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    insert++;
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    insert++;
                }
            }
        }
        insert += stack.size() * 2;
        return insert;
    }
}
