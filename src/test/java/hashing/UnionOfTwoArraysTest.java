package hashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UnionOfTwoArraysTest {

  UnionOfTwoArrays unionOfTwoArrays = new UnionOfTwoArrays();

  @Test
  void testDoUnion_1() {
    int[] a = {1, 3, 5};
    int[] b = {1, 3, 2, 4};

    assertEquals(5, unionOfTwoArrays.doUnion(a, b));
  }

  @Test
  void testDoUnion_2() {
    int[] a = {1, 3, 5};
    int[] b = {2, 4};

    assertEquals(5, unionOfTwoArrays.doUnion(a, b));
  }
}
