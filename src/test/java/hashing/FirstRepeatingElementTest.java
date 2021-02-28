package hashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FirstRepeatingElementTest {
  FirstRepeatingElement firstRepeatingElement = new FirstRepeatingElement();

  @Test
  void testFirstRepeatedWhenRepeating() {
    int[] arr = {1, 5, 3, 4, 3, 5, 6};
    assertEquals(2, firstRepeatingElement.firstRepeated(arr));
  }

  @Test
  void testFirstRepeatedWhenNotRepeating() {
    int[] arr = {1, 2, 3, 4};
    assertEquals(-1, firstRepeatingElement.firstRepeated(arr));
  }
}
