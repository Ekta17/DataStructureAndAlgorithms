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
		/*int i=0, j=1;
		while(j<nums.length){
			if(nums[i] == nums[j])
				j++;
			else
				nums[++i] = nums[j++];
		}

		return i+1;*/
		// Check for edge cases.
		if (nums == null) {
			return 0;
		}

		// Use the two pointer technique to remove the duplicates in-place.
		// The first element shouldn't be touched; it's already in its correct place.
		int writePointer = 1;
		// Go through each element in the Array.
		for (int readPointer = 1; readPointer < nums.length; readPointer++) {
			// If the current element we're reading is *different* to the previous
			// element...
			if (nums[readPointer] != nums[readPointer - 1]) {
				// Copy it into the next position at the front, tracked by writePointer.
				nums[writePointer] = nums[readPointer];
				// And we need to now increment writePointer, because the next element
				// should be written one space over.
				writePointer++;
			}
		}

		// This turns out to be the correct length value.
		return writePointer;
	}

}
