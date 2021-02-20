package arrays;

import java.util.ArrayList;
import java.util.List;

public class DisapperedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		for (int i = 0; i< nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if(nums[index] > 0)
				nums[index] = - nums[index];
		}

		List<Integer> disapperedNumbers = new ArrayList<>();
		for (int i = 0; i < nums.length; i++)
			if (nums[i] > 0)
				disapperedNumbers.add(i + 1);

		return disapperedNumbers;
	}
}
