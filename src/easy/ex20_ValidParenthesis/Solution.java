package easy.ex20_ValidParenthesis;

import java.util.Stack;

public class Solution {
    /*
        The possible characters are '(', ')', '{', '}', '[', ']'.
        we'll use stack and insert each character inside, if next character is closing bracket then we'll remove the opening
        bracket from stack.
        if at last stack is empty we'll return true.
        We'll need two helper methods first to check if the given character is opening character and
        second to check if opening character is matching closing character
     */

    /**
     * @param c: character from string
     * @return true if c is any of (, {, [
     */
    private static boolean isOpening(char c){
        return c == '(' ||
                c == '{' ||
                c == '[';
    }

    /**
     *
     * @param a: character opening bracket
     * @param b: character closing bracket
     * @return: true if opening character matches closing character
     */
    private static boolean isMatching(char a, char b){
        return (a == '(' && b == ')') ||
                (a == '{' && b == '}') ||
                (a == '[' && b == ']');
    }

    private static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // first we check the character is opening bracket, if true push it in stack.
            if (isOpening(s.charAt(i))){
                stack.push(s.charAt(i));
            } else {
                // if closing character came first then the stack should be empty and we'll return false.
                // for closing character we'll first need an opening character.
                if (stack.isEmpty()) return false;

                // if there's closing character and an opening character is present in stack (i.e.first condition in else block
                // false then we'll match it to opening character and if they don't match we'll return false.
                else if (!isMatching(stack.peek(), s.charAt(i))) return false;

                // if above condition is false means the opening and closing brackets are matched then we'll remove opening
                // character from stack.
                else stack.pop();
            }
        }
        /* now finally we'll check if stack is empty or not
         * if it is empty then all the opening characters has closing characters and if not missing opening / closing
         * character. */
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }
}
