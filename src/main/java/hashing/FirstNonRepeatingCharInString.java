package hashing;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given a string S consisting of lowercase Latin Letters. Find the first non-repeating character in
 * S. Expected Time Complexity: O(N). Expected Auxiliary Space: O(Number of distinct characters).
 */
public class FirstNonRepeatingCharInString {

  char nonrepeatingCharacter(String S) {
    Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
    int frequency = 0;
    for (int i = 0; i < S.length(); i++) {
      frequency = frequencyMap.getOrDefault(S.charAt(i), 0) + 1;
      frequencyMap.put(S.charAt(i), frequency);
    }

    Character firstNonRepeatingChar =
        frequencyMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(entry -> entry.getKey())
            .findFirst()
            .orElse(null);

    return firstNonRepeatingChar;
  }
}
