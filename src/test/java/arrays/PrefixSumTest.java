package arrays;

import static org.junit.jupiter.api.Assertions.*;

import arrays.prefixsum.PrefixSum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PrefixSumTest {

  private static PrefixSum prefixSum;

  @BeforeAll
  public static void init() {
    prefixSum = new PrefixSum();
  }

  @Test
  public void testPrefixSum() {
    int[] arr = {2, 8, 3, 9, 6, 5, 4};
    int[] prefixSumArr = prefixSum.calculatePrefixSum(arr);
    assertEquals(13, prefixSum.getSum(prefixSumArr, 0, 2));
    assertEquals(20, prefixSum.getSum(prefixSumArr, 1, 3));
    assertEquals(27, prefixSum.getSum(prefixSumArr, 2, 6));
  }
}
