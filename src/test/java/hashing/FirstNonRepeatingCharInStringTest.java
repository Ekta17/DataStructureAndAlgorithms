package hashing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstNonRepeatingCharInStringTest {
  FirstNonRepeatingCharInString firstNonRepeatingCharInString = new FirstNonRepeatingCharInString();

  @Test
  void testNonrepeatingCharacter_1() {
    String s = "hello";
    assertEquals('h', firstNonRepeatingCharInString.nonrepeatingCharacter(s));
  }

  @Test
  void testNonrepeatingCharacter_2() {
    String s = "zxvczbtxyzvy";
    assertEquals('c', firstNonRepeatingCharInString.nonrepeatingCharacter(s));
  }
}
