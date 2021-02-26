package arrays.prefixsum;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of positive and negative numbers,
 * find if there is a subarray (of size at-least one) with given sum.
 * <p>
 */
public class GivenSumSubarray {

	/**
	 * We can also use hashing.
	 * The idea is to iterate through the array and for every element arr[i],
	 * calculate the sum of elements from 0 to i (this can simply be done as sum += arr[i]).
	 * If the current sum has been seen before,
	 * then there is a zero-sum array.
	 * Hashing is used to store the sum values so that we can quickly store sum
	 * and find out whether the current sum is seen before or not.
	 */
	public boolean givenSumSubarrayExists(int[] arr, int sum) {
		Set<Integer> sumSet = new HashSet<>();

		int prefixSum = 0;
		for (int i = 0; i < arr.length; i++) {
			prefixSum += arr[i]; // Add current element to prefixSum

			// Return true in following cases
			// a) Current element is 0
			// b) sum of elements from 0 to i is 0
			// c) sum is already present in hash map
			if (arr[i] == sum ||
					prefixSum == sum ||
					sumSet.contains(prefixSum-sum)
			)
				return true;
			sumSet.add(prefixSum);
		}

		return false;
	}
}
