package arrays;

//Given an array nums and a value val, remove all instances of that value in-place and return the new length.
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//The order of elements can be changed. It doesn't matter what you leave beyond the new length.
//https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/

public class RemoveAllOccurencesOfANumberInArray {
	public int removeElement(int[] nums, int val) {
		int length = nums.length;
		int i = 0;
		while (i < length) {
			if (nums[i] == val) {
				for (int j = i; j < length - 1; j++)
					nums[j] = nums[j + 1];
				length--;
			} else
				i++;
		}

		return length;
	}
}
