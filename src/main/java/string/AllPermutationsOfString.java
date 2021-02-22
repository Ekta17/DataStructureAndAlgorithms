package string;

import java.util.HashSet;
import java.util.Set;

public class AllPermutationsOfString {
	private final String EMPTY_STRING = "";

	public Set<String> getAllPermutations(String input) {
		Set<String> permutations = new HashSet<>();

		if (input == null || input.isEmpty())
			return permutations;
		return getAllPermutations(EMPTY_STRING, input, permutations);
	}

	private Set<String> getAllPermutations(String permutation, String input, Set<String> allPermutations) {
		if (input.isEmpty())
			allPermutations.add(permutation);
		else {
			for (int i = 0; i < input.length(); i++) {
				String newPermutation = permutation + input.charAt(i);
				String remainingInput = input.substring(0, i) + input.substring(i + 1);
				getAllPermutations(newPermutation, remainingInput, allPermutations);
			}
		}
		return allPermutations;
	}
}
