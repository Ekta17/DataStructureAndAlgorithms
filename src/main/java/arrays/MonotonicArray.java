package arrays;

//https://leetcode.com/problems/monotonic-array/
//https://www.youtube.com/watch?v=xwf0kBjo79Q
public class MonotonicArray {
	public boolean isMonotonic(int[] A) {
		boolean isDecreasing = true;
		boolean isIncreasing = true;

		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] < A[i + 1])
				isDecreasing = false;
			if (A[i] > A[i + 1])
				isIncreasing = false;
			if (isIncreasing == false && isDecreasing == false)
				return false;
		}

		return true;
	}
}
