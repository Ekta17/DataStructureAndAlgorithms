package arrays.prefixsum;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroSumSubarrayTest {
	private static ZeroSumSubarray zeroSumSubarray;

	@BeforeAll
	public static void init() {
		zeroSumSubarray = new ZeroSumSubarray();
	}

	@Test
	void zeroSumSubarrayExistsWhenPresent() {
		int[] arr = {1, 4, -2, -2, 5, -4, 3};
		boolean isSubArrayPresent = zeroSumSubarray.zeroSumSubarrayExists(arr);
		assertTrue(isSubArrayPresent);
	}

	@Test
	void zeroSumSubarrayExistsWhenNotPresent() {
		int[] arr = {1, 2, 3, 4, 5};
		boolean isSubArrayPresent = zeroSumSubarray.zeroSumSubarrayExists(arr);
		assertFalse(isSubArrayPresent);
	}
}