package arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIfDoubleExists {

	public boolean checkIfExist(int[] arr) {
		Set<Integer> setOfDoubles = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (setOfDoubles.contains(arr[i] * 2) || (arr[i] % 2 == 0 && setOfDoubles.contains(arr[i] / 2)))
				return true;
			else
				setOfDoubles.add(arr[i]);
		}

		return false;
	}
}
