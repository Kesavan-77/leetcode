import java.util.Stack;

class Solution {

    public boolean parse_or(String s) {
        for (char c : s.toCharArray()) {
            if (c == 't') return true;
        }
        return false;
    }

    public boolean parse_and(String s) {
        for (char c : s.toCharArray()) {
            if (c == 'f') return false;
        }
        return true;
    }

    public boolean parse_not(String s) {
        return s.charAt(0) == 'f';
    }

    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sequence = new StringBuilder();

        for (char c : expression.toCharArray()) {
            if (c == ')') {
                sequence.setLength(0);
                while (stack.peek() != '(') {
                    sequence.append(stack.pop());
                }
                stack.pop();
                char operator = stack.pop();
                String seq = sequence.toString();
                if (operator == '&') {
                    stack.push(parse_and(seq) ? 't' : 'f');
                } else if (operator == '|') {
                    stack.push(parse_or(seq) ? 't' : 'f');
                } else if (operator == '!') {
                    stack.push(parse_not(seq) ? 't' : 'f');
                }
            } else if (c != ',') {
                stack.push(c);
            }
        }
        return stack.pop() == 't';
    }
}
