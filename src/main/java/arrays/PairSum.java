package arrays;

import java.util.HashMap;

public class PairSum {

	int[] findPairSumWhenArrayIsUnsorted(int[] nums, int target){

		int[] indicesOfPair = new int[]{-1,-1};
		HashMap<Integer, Integer> valueOfIndices = new HashMap<>(nums.length);
		for(int i=0; i<nums.length; i++){
			if(valueOfIndices.containsKey(target-nums[i])){
				indicesOfPair[0] = valueOfIndices.get(target-nums[i]);
				indicesOfPair[1] = i;
				break;
			}else
				valueOfIndices.put(nums[i], i);
		}
		return indicesOfPair;
	}

	int[] findPairSumWhenArrayIsSorted(int[] nums, int target){
		return pairSumHelperForSortedArray(nums, 0, nums.length-1, target);
	}

	int[] pairSumHelperForSortedArray(int[] nums, int low, int high, int target){
		int[] indicesOfPair = new int[]{-1,-1};
		int i = low, j = high, sum = 0;

		while(i<j){
			sum = nums[i]+nums[j];
			if(sum == target){
				indicesOfPair[0] = i;
				indicesOfPair[1] = j;
				break;
			}else if(sum<target)
				i++;
			else
				j--;
		}
		return indicesOfPair;
	}

}
