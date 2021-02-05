package arrays.windowsliding;

/**
 * Kadane's Algorithm
 * Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
 * https://leetcode.com/problems/maximum-subarray/
 */
public class SubarrayWithMaxSum {

	public int maxSubarraySum(int arr[], int n) {

		int maxSum = arr[0], currentSum = arr[0];

		for (int i = 1; i < n; i++) {
			currentSum = Math.max(currentSum+arr[i], arr[i]);
			maxSum = currentSum > maxSum ? currentSum : maxSum;
		}
		return maxSum;
	}
}
