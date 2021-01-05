package heap;

//Min Heap operations
public class Heap {

	void buildHeapFromArray(int[] arr) {
		//start from last non-leaf node(rightmost Parent from last level)
		// Explanation of how following index position is derived ()
		int startNode = (arr.length - 2) / 2;

		for (int i = startNode; i >= 0; i--)
			heapify(arr, i);
	}

	int[] insertIntoHeap(int[] arr, int key) {
		int[] newArr = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++)
			newArr[i] = arr[i];

		newArr[arr.length] = key;
		int parentOfLastElementIndex = (newArr.length - 2) / 2;
		heapify(newArr, parentOfLastElementIndex);

		return newArr;
	}

	int[] extractMin(int[] arr) {
		swap(arr, 0, arr.length - 1);

		int[] newArr = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++)
			newArr[i] = arr[i];

		heapify(newArr, 0);

		return newArr;
	}

	int[] deleteFromHeap(int[] arr, int keyIndex) {
		swap(arr, keyIndex, arr.length - 1);

		int[] newArr = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++)
			newArr[i] = arr[i];

		heapify(newArr, keyIndex);

		return newArr;
	}

	void heapify(int[] arr, int i) {
		int smallest = i;
		int leftChild = 2 * i + 1;
		int rightChild = 2 * i + 2;

		if (leftChild < arr.length && arr[leftChild] < arr[smallest])
			smallest = leftChild;
		if (rightChild < arr.length && arr[rightChild] < arr[smallest])
			smallest = rightChild;

		//if smallest element index is not root at that level, else its a min heap already
		if (smallest != i) {
			swap(arr, smallest, i);

			//heapify the subtree after swapping
			heapify(arr, smallest);
		}
	}

	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


}
