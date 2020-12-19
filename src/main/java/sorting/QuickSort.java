package sorting;

/**
 * One the most famous sorting algorithms used in library functions.
 * Quick Sort is preferred over Merge sort as Merge Sort requires extra array space allocation
 *
 * In-place sorting algorithm as it uses the extra space for recursive calls
 * Since quick sort is in-place sorting algorithm, it is cache friendly as it has good locality of
 * reference when used for arrays.
 * Cache benefits from multiple accesses to the same place in the memory,
 * since only the first access needs to be actually taken from the memory -
 * the rest of the accesses are taken from cache, which is much faster the access to memory.
 * Merge sort for instance - needs much more memory [RAM] accesses -
 * since every accessory array you create - is accessing the RAM again.
 *
 * Worst Case: when the partition function picks pivot as the smallest or the largest element everytime
 * time complexity: O(n2)
 *
 * Best case: when the pivot picked is always the middle element.
 * time complexity: O(nlog(n))
 *
 */

public class QuickSort {

	public int[] sort(int[] nums) {
		quickSort(nums, 0, nums.length - 1);
		return nums;
	}

	private void quickSort(int[] nums, int low, int high) {
		if (low < high) {
			int pivot = partition(nums, low, high);
			quickSort(nums, low, pivot - 1);
			quickSort(nums, pivot + 1, high);
		}
	}

	private int partition(int[] nums, int low, int high) {
		int pivot = nums[high]; //Element to be placed at the right position

		int i = low - 1; //Index of smaller element
		for (int j = low; j < high; j++) {
			if (nums[j] < pivot) { //If  current element is smaller than the pivot
				i++;
				swap(nums, i, j); //move the current element, which is smaller than pivot to the left
			}
		}
		swap(nums, i + 1, high); //place pivot at the correct location
		return i + 1;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
