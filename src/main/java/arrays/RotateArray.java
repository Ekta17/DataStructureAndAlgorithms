package arrays;

public class RotateArray {

	private static ReverseArray reverseArray = new ReverseArray();

	public int[] rotate(int[] arr, int d) {
		//reverse first d-1 elements
		reverseArray.reverse(arr, 0, d - 1);

		//reverse elements from d to end
		reverseArray.reverse(arr, d, arr.length - 1);

		//reverse the final array
		reverseArray.reverse(arr, 0, arr.length - 1);

		return arr;
	}

}
