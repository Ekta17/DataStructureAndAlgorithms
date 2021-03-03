package string;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class AllPermutationsOfStringTest {
  AllPermutationsOfString allPermutationsOfString = new AllPermutationsOfString();

  @Test
  void getAllPermutationsWithUniqueChar() {
    String s = "abc";
    Set<String> actualPermutations = allPermutationsOfString.getAllPermutations(s);
    Set<String> expectedPermutations =
        new HashSet<>(Arrays.asList("abc", "acb", "bca", "bac", "cab", "cba"));
    assertEquals(expectedPermutations.size(), actualPermutations.size());
    assertTrue(expectedPermutations.containsAll(actualPermutations));
    assertTrue(actualPermutations.containsAll(expectedPermutations));
  }

  @Test
  void getAllPermutationsWithRepeatingChar() {
    String s = "aab";
    Set<String> actualPermutations = allPermutationsOfString.getAllPermutations(s);
    Set<String> expectedPermutations = new HashSet<>(Arrays.asList("aab", "aba", "baa"));
    System.out.println(actualPermutations);
    assertEquals(expectedPermutations.size(), actualPermutations.size());
    assertTrue(expectedPermutations.containsAll(actualPermutations));
    assertTrue(actualPermutations.containsAll(expectedPermutations));
  }
}
