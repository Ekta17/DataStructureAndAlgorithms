package sorting;

public class InsertionSort {

	/**
	 * This is plain simple insertion sort
	 * where we compare the element with its predecessor
	 * and if the predecessor is greater than current element then we swap them
	 * <p>
	 * time complexity: O(n2)
	 * <p>
	 * This algorithm works best when the input is already sorted or the size of input is small
	 */
	int[] sort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int key = nums[i];
			int j = i - 1;
			while (j >= 0 && nums[j] > key) {
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = key;
		}
		return nums;
	}

}
