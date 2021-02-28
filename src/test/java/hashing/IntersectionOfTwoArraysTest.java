package hashing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntersectionOfTwoArraysTest {
  IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();

  @Test
  void testNumberofElementsInIntersection_1() {
    int[] a = {1, 4, 7, 0, 2};
    int[] b = {0, 4, 1, 3, 10, 9};

    assertEquals(3, intersectionOfTwoArrays.numberofElementsInIntersection(a, b));
  }

  @Test
  void testNumberofElementsInIntersection_2() {
    int[] a = {1, 4, 7, 0, 2};
    int[] b = {3, 10, 9};

    assertEquals(0, intersectionOfTwoArrays.numberofElementsInIntersection(a, b));
  }
}
