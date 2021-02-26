package arrays.prefixsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GivenSumSubarrayTest {
	GivenSumSubarray givenSumSubarray = new GivenSumSubarray();

	@Test
	void givenSumSubarrayExists_1() {
		int[] arr = {5,3,8,-2,8,10};
		int sum = 11;
		assertTrue(givenSumSubarray.givenSumSubarrayExists(arr, sum));
	}

	@Test
	void givenSumSubarrayExists_2() {
		int[] arr = {1, 4, -2, -2, 5, -4, 3};
		int sum = 0;
		assertTrue(givenSumSubarray.givenSumSubarrayExists(arr, sum));
	}

	@Test
	void givenSumSubarrayExists_3() {
		int[] arr = {5,3,12,-2,8,10};
		int sum = 11;
		assertFalse(givenSumSubarray.givenSumSubarrayExists(arr, sum));
	}
}