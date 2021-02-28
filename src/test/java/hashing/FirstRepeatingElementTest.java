package hashing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstRepeatingElementTest {

  private static FirstRepeatingElement firstRepeatingElement;

  @BeforeAll
  public static void init(){
    firstRepeatingElement = new FirstRepeatingElement();
  }

  @Test
  void testFirstRepeatedWhenRepeating() {
    int[] arr = {1, 5, 3, 4, 3, 5, 6};
    assertEquals(2, firstRepeatingElement.firstRepeated(arr));
  }


  @Test
  void testFirstRepeatedWhenNotRepeating() {
    int[] arr = {1,2,3, 4};
    assertEquals(-1, firstRepeatingElement.firstRepeated(arr));
  }

}
