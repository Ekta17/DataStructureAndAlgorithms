package arrays;

public class TripletSum {

	PairSum pairSum = new PairSum();

	/**
	 * Logic here is to fix one of the position and find pair sum
	 *
	 * This function finds the tripplet sum for sorted array
	 * but if the array is not sorted, sorting the array will take O(nlog(n))
	 * and then the overall time complexity will be O(nlog(n)) + O(n2) = O(n2)
	 *
	 * When the array is unsorted, we can also use Hashing
	 * but to compute the hash it will take time and adds complexity.
	 *
	 * time complexity: O(n2)
	 *
	 */
	int[] findTripletSumForSortedArray(int[] nums, int target){
		int[] indicesOfTripplet = new int[]{-1,-1, -1};
		int[] indicesOfPair;
		for(int i = 0; i< nums.length-1; i++) {
			indicesOfPair = pairSum.pairSumHelperForSortedArray(nums, i + 1, nums.length - 1, (target - nums[i]));
			if (indicesOfPair[0] != -1) {
				indicesOfTripplet[0] = indicesOfPair[0];
				indicesOfTripplet[1] = indicesOfPair[1];
				indicesOfTripplet[2] = i;
				break;
			}
		}
		return indicesOfTripplet;
	}

}
