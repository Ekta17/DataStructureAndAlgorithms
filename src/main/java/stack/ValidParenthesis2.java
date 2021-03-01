package stack;

import java.util.Stack;

/**
 * Given an expression string exp, write a program to examine whether the pairs and the orders of
 * “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.
 * https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
 */
public class ValidParenthesis2 {

  public boolean isValidString(String s) {
    Stack<Character> charStack = new Stack<>();

    char c;
    for (int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)) {
        case '{':
        case '(':
        case '[':
          charStack.push(s.charAt(i));
          break;
        case '}':
          c = charStack.pop();
          if (c != '{') return false;
          break;
        case ')':
          c = charStack.pop();
          if (c != '(') return false;
          break;
        case ']':
          c = charStack.pop();
          if (c != '[') return false;
          break;
      }
    }

    return charStack.isEmpty() ? true : false;
  }
}
