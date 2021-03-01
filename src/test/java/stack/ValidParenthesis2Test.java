package stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidParenthesis2Test {
  ValidParenthesis2 validParenthesis2 = new ValidParenthesis2();

  @Test
  void testIsValidString_1() {
    String s = "[()]{}{[()()]()}";
    assertTrue(validParenthesis2.isValidString(s));
  }

  @Test
  void testIsValidString_2() {
    String s = "[(])";
    assertFalse(validParenthesis2.isValidString(s));
  }
}
