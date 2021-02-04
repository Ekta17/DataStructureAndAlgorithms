package arrays.windowsliding;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayWithGivenSumTest {

	private static SubarrayWithGivenSum subarrayWithGivenSum;

	@BeforeAll
	public static void init(){
		subarrayWithGivenSum = new SubarrayWithGivenSum();
	}

	@Test
	public void testSumOfSubArray(){
		int nums[] = {1,4,20,3,10,5};
		boolean isSubarrayExist = subarrayWithGivenSum.isSubarrayWithGivenSumExists(nums, 33);
		assertTrue(isSubarrayExist);
	}

}