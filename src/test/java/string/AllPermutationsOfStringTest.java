package string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AllPermutationsOfStringTest {
	AllPermutationsOfString allPermutationsOfString = new AllPermutationsOfString();

	@Test
	void getAllPermutations() {
		String s = "abc";
		Set<String> actualPermutations = allPermutationsOfString.getAllPermutations(s);
		Set<String> expectedPermutations = new HashSet<>(Arrays.asList("abc", "acb", "bca", "bac", "cab", "cba"));
		assertEquals(expectedPermutations.size(), actualPermutations.size());
		assertTrue(expectedPermutations.containsAll(actualPermutations));
		assertTrue(actualPermutations.containsAll(expectedPermutations));
	}
}