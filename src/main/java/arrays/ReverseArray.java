package arrays;

public class ReverseArray {

	public int[] reverse(int[] arr, int beginning, int end) {
		for (int i = beginning, j = end; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}
}
