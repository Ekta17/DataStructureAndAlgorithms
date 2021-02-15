package arrays;

public class NumbersWithEvenNoOfDigits {

	public int findNumbers(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (numberOfDigits(nums[i]) % 2 == 0)
				result++;
		}
		return result;
	}

	public int numberOfDigits(int num) {
		if(num == 0)
			return 1;

		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}
}
