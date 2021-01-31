package arrays;

/**
 * Given a sorted array nums,
 * remove the duplicates in-place such that
 * each element appears only once
 * and returns the new length.
 *
 * Do not allocate extra space for another array,
 * you must do this by modifying the input array in-place
 * with O(1) extra memory.
 *	https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
 */
public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicate(int[] nums){
		int i=0, j=1;
		while(j<nums.length){
			if(nums[i] == nums[j])
				j++;
			else
				nums[++i] = nums[j++];
		}

		return i+1;
	}

}
