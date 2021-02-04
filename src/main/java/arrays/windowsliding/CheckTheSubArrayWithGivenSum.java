package arrays.windowsliding;

public class CheckTheSubArrayWithGivenSum {

	//check is subarray of size k with sum is present in the array
	public boolean isSumPresent(int[] nums, int sum, int k) {
		int currentSum = 0;
		for (int i = 0; i < k; i++)
			currentSum += nums[i];
		if (currentSum == sum)
			return true;
		for (int i = k; i < nums.length; i++) {
			currentSum += (nums[i] - nums[i - k]);
			if (currentSum == sum)
				return true;
		}

		return false;
	}
}
