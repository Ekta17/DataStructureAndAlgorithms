package arrays.windowsliding;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxSumOfKConsecutiveNumTest {
	private static MaxSumOfKConsecutiveNum maxSumOfKConsecutiveNum;

	@BeforeAll
	public static void init(){
		maxSumOfKConsecutiveNum = new MaxSumOfKConsecutiveNum();
	}

	@Test
	public void testMaxSum(){
		int[] nums = {1,8,30,-5,20,7};
		int maxSum = maxSumOfKConsecutiveNum.getMaxSum(nums, 3);
		assertEquals(45, maxSum);
	}
}