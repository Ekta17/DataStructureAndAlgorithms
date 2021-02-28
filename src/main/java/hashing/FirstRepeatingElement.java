package hashing;

import javafx.util.Pair;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given an array arr[] of size N, find the first repeating element. The element should occurs more
 * than once and the index of its first occurrence should be the smallest. You don't need to read
 * input or print anything. Complete the function firstRepeated() which takes arr and N as input
 * parameters and return the position of the first repeating element.
 *
 * <p>If there is no such element,return -1. The position you return should be according to 1-based
 * indexing.
 *
 * <p>Expected Time Complexity: O(NlogN) Expected Auxilliary Space: O(N)
 */
public class FirstRepeatingElement {

  int firstRepeated(int arr[]) {

    // Map --> key = element of array, Value = Pair<Frequency, Index position in array>
    Map<Integer, Pair<Integer, Integer>> frequencyMap = new LinkedHashMap<>();
    int frequency = 0;
    Pair<Integer, Integer> value;
    for (int i = 0; i < arr.length; i++) {
      if (frequencyMap.containsKey(arr[i])) {
        value = frequencyMap.get(arr[i]);
        value = new Pair<>(value.getKey() + 1, value.getValue());
      } else value = new Pair<>(1, i);
      frequencyMap.put(arr[i], value);
    }

    int firstRepeatingElement = frequencyMap.entrySet().stream().filter(x -> x.getValue().getKey() > 1).map(x -> x.getValue().getValue()).findFirst().orElse(-1);

    return firstRepeatingElement == -1 ? firstRepeatingElement : firstRepeatingElement + 1;
  }
}
