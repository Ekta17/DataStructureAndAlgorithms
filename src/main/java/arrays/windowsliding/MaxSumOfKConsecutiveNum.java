package arrays.windowsliding;

public class MaxSumOfKConsecutiveNum {

	//time complexity = O(n) --> O(k) + O(n-k)
	public int getMaxSum(int[] nums, int k){
		//Compute the sum of first k elements,
		// 1st window
		//first k-1 elements
		int currentSum=0;
		for(int i=0;i<k;i++){ //O(k) time complexity
			currentSum += nums[i];
		}
		int maxSum = currentSum;
		//iterating through the sum of rest of the elements, starting with k
		for(int i=k; i<nums.length;i++){ //O(n-k) time complexity
			currentSum += (nums[i] - nums[i-k]); //first element of previous window is (i-k)
			maxSum = Math.max(currentSum, maxSum);
		}

		return maxSum;
	}
}
