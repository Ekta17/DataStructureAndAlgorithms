package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MaxElementTest {

  @Test
  public void testMaxElement() throws Exception {
    MaxElement maxElement = new MaxElement();

    assertThrows(Exception.class, () -> maxElement.pop());
    assertThrows(Exception.class, () -> maxElement.getMax());

    maxElement.push(2); // 2
    assertEquals(2, maxElement.getMax());
    maxElement.push(1); // 2,1
    assertEquals(2, maxElement.getMax());
    maxElement.push(3); // 2,1,3
    assertEquals(3, maxElement.getMax());
    maxElement.push(5); // 2,1,3,5
    assertEquals(5, maxElement.getMax());
    maxElement.push(0); // 2,1,3,5,0
    assertEquals(5, maxElement.getMax());

    assertEquals(0, maxElement.pop()); // 2,1,3,5
    assertEquals(5, maxElement.getMax()); // 2,1,3,5

    assertEquals(5, maxElement.pop()); // 2,1,3
    assertEquals(3, maxElement.getMax()); // 2,1,3

    assertEquals(3, maxElement.pop()); // 2,1
    assertEquals(2, maxElement.getMax()); // 2,1

    assertEquals(1, maxElement.pop()); // 2
    assertEquals(2, maxElement.getMax()); // 2

    assertEquals(2, maxElement.pop()); //
    assertThrows(Exception.class, () -> maxElement.getMax());
  }
}
