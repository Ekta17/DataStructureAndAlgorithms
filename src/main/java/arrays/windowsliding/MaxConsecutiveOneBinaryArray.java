package arrays.windowsliding;

public class MaxConsecutiveOneBinaryArray {

	public int getMaxOnes(int[] nums) {
		int maxOnes = 0;
		int currCount = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				currCount = 0;
			else
				currCount++;
			maxOnes = Math.max(currCount, maxOnes);
		}

		return maxOnes;
	}
}
