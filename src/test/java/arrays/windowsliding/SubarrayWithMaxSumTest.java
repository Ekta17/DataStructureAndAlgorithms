package arrays.windowsliding;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayWithMaxSumTest {
	private static SubarrayWithMaxSum subarrayWithMaxSum;

	@BeforeAll
	public static void init(){
		subarrayWithMaxSum= new SubarrayWithMaxSum();
	}

	@Test
	void maxSubarraySum_1() {
		int[] arr = {-1,-2,-3,-4};
		int actualMaxSum = subarrayWithMaxSum.maxSubarraySum(arr, 4);
		assertEquals(-1, actualMaxSum);
	}

	@Test
	void maxSubarraySum_All() {
		int[] arr = {1,2,3,-2,5};
		int actualMaxSum = subarrayWithMaxSum.maxSubarraySum(arr, 5);
		assertEquals(9, actualMaxSum);
	}
}