package arrays;

public class RotateArray {

	private static ReverseArray reverseArray = new ReverseArray();

	public int[] rotateRight(int[] arr, int d) {
		d %= arr.length;

		//reverse first d-1 elements
		reverseArray.reverse(arr, 0, d - 1);

		//reverse elements from d to end
		reverseArray.reverse(arr, d, arr.length - 1);

		//reverse the final array
		reverseArray.reverse(arr, 0, arr.length - 1);

		return arr;
	}

	public int[] rotateLeft(int[] arr, int d) {
		d %= arr.length;

		//reverse the array
		reverseArray.reverse(arr, 0, arr.length - 1);

		//reverse first d-1 elements
		reverseArray.reverse(arr, 0, d - 1);

		//reverse elements from d to end
		reverseArray.reverse(arr, d, arr.length - 1);

		return arr;
	}

}
