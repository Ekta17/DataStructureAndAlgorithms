package hashing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingArrayBasedOnFrequencyTest {
  SortingArrayBasedOnFrequency sortingArrayBasedOnFrequency = new SortingArrayBasedOnFrequency();

  @Test
  void testSort_1() {
    int[] arr = {1, 2, 1, 3, 3, 7, 0, 4, 4, 4, 4, 2, 2};
    int[] sortedArr = sortingArrayBasedOnFrequency.sort(arr);
    int[] expectedArr = {4, 4, 4, 4, 2, 2, 2, 1, 1, 3, 3, 0, 7};
    assertArrayEquals(expectedArr, sortedArr);
  }
}
