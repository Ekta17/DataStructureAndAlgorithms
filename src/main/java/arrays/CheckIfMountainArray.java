package arrays;

//https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
//Given an array of integers arr, return true if and only if it is a valid mountain array.
//Recall that arr is a mountain array if and only if:
//arr.length >= 3
//There exists some i with 0 < i < arr.length - 1 such that:
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
public class CheckIfMountainArray {

	//https://www.youtube.com/watch?v=Wg7oi8D2OoQ
	public boolean validMountainArray(int[] arr) {
		if (arr.length < 3)
			return false;

		int leftIndex = 0, rightIndex = arr.length - 1;

		while (leftIndex + 1 < arr.length - 1 && arr[leftIndex] < arr[leftIndex + 1])
			leftIndex++;

		while (rightIndex - 1 > 0 && arr[rightIndex] < arr[rightIndex - 1])
			rightIndex--;

		return leftIndex == rightIndex;
	}
}
