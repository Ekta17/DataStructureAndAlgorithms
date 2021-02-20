package arrays;

//Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.
//Example 1:
//
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].

public class SortSquare {

	public int[] sortedSquares(int[] nums) {
		int resultArr[] = new int[nums.length];

		int left = 0, right = nums.length - 1;
		int leftSquare = 0, rightSquare = 0;
		int indexOfFinalArr = nums.length - 1;

		while (indexOfFinalArr >= 0) {

			leftSquare = nums[left] * nums[left];
			rightSquare = nums[right] * nums[right];

			if (leftSquare >= rightSquare) {
				resultArr[indexOfFinalArr] = leftSquare;
				left++;
				indexOfFinalArr--;
			} else if (rightSquare > leftSquare) {
				resultArr[indexOfFinalArr] = rightSquare;
				right--;
				indexOfFinalArr--;
			}
		}

		return resultArr;
	}
}
