package sorting;

public class MergeSort {

	/**
	 * Efficient Sorting algorithm which is stable and used divide and conquer technique
	 *
	 * The merge step takes O(n) time
	 *
	 * This sorting algorithm is more efficient when sorting a LinkedList rather than an array because of memory allocation
	 * as for LinkedList, in the merge step, we can insert a new element using O(1) extra space and O(1) time.
	 * Hence, we do not have to allocate new arrays for copying the elements
	 *
	 * time complexity: O(nlog(n))
	 * space complexity: O(n)
	 */

	public int[] sort(int[] num) {
		mergeSort(num, 0, num.length - 1);

		System.out.println("After mergeSort::");
		for(int i: num)
			System.out.println(i+":");

		return num;
	}

	private void mergeSort(int[] num, int left, int right) {

		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(num, left, mid);
			mergeSort(num, mid + 1, right);
			merge(num, left, mid, right);
		}
	}

	/**
	 * Remember to initialize k in the final pass as low/left rather than 0
	 */
	private void merge(int[] num, int left, int mid, int right) {
		int sizeOfLeftArr = mid - left + 1;
		int sizeOfRightArr = right - mid;

		int[] leftArr = new int[sizeOfLeftArr];
		int[] rightArr = new int[sizeOfRightArr];

		for (int i = 0; i < sizeOfLeftArr; i++)
			leftArr[i] = num[left + i];

		for (int j = 0; j < sizeOfRightArr; j++)
			rightArr[j] = num[mid + 1 + j];

		int i = 0, j = 0, k = left;
		while (i < leftArr.length && j < rightArr.length) {
			if (leftArr[i] <= rightArr[j])
				num[k++] = leftArr[i++];
			else
				num[k++] = rightArr[j++];
		}

		while (i < leftArr.length)
			num[k++] = leftArr[i++];

		while (j < rightArr.length)
			num[k++] = rightArr[j++];

	}
}
