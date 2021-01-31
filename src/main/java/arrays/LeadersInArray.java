package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

	public List<Integer> getLeaders(int[] arr) {
		List<Integer> leaders = new ArrayList<>();
		int max = arr[arr.length - 1];
		leaders.add(max);

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				leaders.add(max);
			}
		}

		return leaders;
	}

}
