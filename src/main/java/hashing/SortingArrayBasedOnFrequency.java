package hashing;

import java.util.*;

/**
 * Given an array A[] of integers, sort the array according to frequency of elements. That is
 * elements that have higher frequency come first. If frequencies of two elements are same, then
 * smaller number comes first.
 * https://javaconceptoftheday.com/sort-array-elements-by-frequency-in-java/
 */
public class SortingArrayBasedOnFrequency {

  public int[] sort(int[] arr) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    List<Integer> sortedList = new ArrayList<>();

    int frequency;
    for (int i = 0; i < arr.length; i++) {
      frequency = frequencyMap.getOrDefault(arr[i], 0) + 1;
      frequencyMap.put(arr[i], frequency);
    }

    frequencyMap.entrySet().stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .forEach(
            entry -> {
              for (int i = 0; i < entry.getValue(); i++) sortedList.add(entry.getKey());
            });

    int a[] = sortedList.stream().mapToInt(Integer::intValue).toArray();

    return a;
  }
}
