package arrays;

import java.util.PriorityQueue;

public class SquaresOfSortedArray {
	public int[] sortedSquares(int[] nums) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
			pq.add(nums[i]);
		}

		for (int i = 0; i < nums.length; i++)
			nums[i] = pq.poll();
		return nums;
	}
}
