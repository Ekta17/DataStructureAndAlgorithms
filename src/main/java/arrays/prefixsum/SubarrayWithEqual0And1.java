package arrays.prefixsum;

import java.util.HashMap;
import java.util.Map;


/**
 * Given a binary array,
 * find the length of largest subarray with equal number of 0 and 1
 * <p>
 * Variable of Zero sum array --> treat 0 as -1 when calculating prefix sum
 * https://www.geeksforgeeks.org/largest-subarray-with-equal-number-of-0s-and-1s/
 * https://www.youtube.com/watch?v=9ZyLjjk536U
 */
public class SubarrayWithEqual0And1 {

	//function to find the length of the longest subarray with equal number of 1 and 0
	public int getLength(int[] arr) {

		Map<Integer, Integer> sumMap = new HashMap<>();
		int length = 0;
		int prefixSum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) //If element is 0 then treat is as -1
				prefixSum -= 1;
			else
				prefixSum += arr[i];

			if(prefixSum == 0){ //consider all the elements from 0 to current index as this will have equal number of 0 and 1
				length = Math.max(length, i+1);
			} else if (sumMap.containsKey(prefixSum)) { //if sum is already seen before
				length = Math.max(length, i - sumMap.get(prefixSum));
			} else { //else add the current sum to map
				sumMap.put(prefixSum, i);
			}
		}

		return length;
	}
}
