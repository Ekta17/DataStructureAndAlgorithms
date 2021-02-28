package arrays.prefixsum;

public class PrefixSum {

	/**
	 * Given an array, and multiple queries to find the sum of a range of numbers
	 * in the array from low to high (inclusive). Write a code to efficiently find the sum
	 * in time complexity O(1)
	 *
	 * @param prefixSum, prefix sum of integers in the array
	 * @param low, lower limit
	 * @param high, upper limit
	 * @return sum of range of numbers between index low to high inclusive
	 */
	public int getSum(int[] prefixSum, int low, int high){
		if(low == 0)
			return prefixSum[high];
		else
			return prefixSum[high] - prefixSum[low-1];
	}

	public int[] calculatePrefixSum(int[] arr) {
		int[] prefixSum = new int[arr.length];
		prefixSum[0] = arr[0];
		for (int i = 1; i < arr.length; i++)
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		return prefixSum;
	}
}
