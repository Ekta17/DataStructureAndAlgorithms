package arrays.windowsliding;

public class SubarrayWithGivenSum {
	/**
	 * In an array of non-negative integers, find the subarray with the given sum
	 * @param nums, array of non-negative integers
	 * @param sum, target sum
	 * @return boolean, if the sub-array is present or not.
	 */
	//Time complexity: O(n)
	public 	boolean isSubarrayWithGivenSumExists(int[] nums, int sum){
		int currentSum = nums[0], windowStart =0;

		for(int windowEnd = 1; windowEnd<nums.length;windowEnd++){
			//clean the previous window
			while(currentSum>sum && windowStart < windowEnd-1) {
				currentSum -= nums[windowStart];
				windowStart ++;
			}

			//check if current sum is equal to expected sum
			if(currentSum == sum)
				return true;

			//add the current element to the window sum
			if(windowEnd< nums.length)
				currentSum += nums[windowEnd];
		}

		//In the end check the sum of last window
		return currentSum == sum;
	}
}
