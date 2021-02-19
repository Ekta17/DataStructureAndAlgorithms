package arrays;

//Given integer array nums, return the third maximum number in this array.
// If the third maximum does not exist, return the maximum number.

public class ThirdMaximumNumber {

	//If we dont have the restriction to solve in O(n) time then
	// we can sort the array and return 3rd from the last element.
	public int thirdMax(int[] nums) {
		Integer firstMax = null;
		Integer secondMax = null;
		Integer thirdMax = null;

		for (Integer n : nums) {
			if (n.equals(firstMax) || n.equals(secondMax) || n.equals(thirdMax))
				continue;
			if (firstMax == null || n > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = n;
			} else if (secondMax == null || n > secondMax) {
				thirdMax = secondMax;
				secondMax = n;
			} else if (thirdMax == null || n > thirdMax)
				thirdMax = n;
		}

		if (thirdMax == null)
			return firstMax;
		else
			return thirdMax;
	}
}
