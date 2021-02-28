package hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays A and B respectively of size N and M, the task is to print the count of elements
 * in the intersection (or common elements) of the two arrays.
 *
 * <p>For this question, the intersection of two arrays can be defined as the set containing
 * distinct common elements between the two arrays.
 */
public class IntersectionOfTwoArrays {

  int numberofElementsInIntersection(int a[], int b[]) {

    Set<Integer> elements = new HashSet<>();
    int countOfCommonElements = 0;

    for (int i = 0; i < a.length; i++) elements.add(a[i]);

    for (int i = 0; i < b.length; i++) if (elements.contains(b[i])) countOfCommonElements++;

    return countOfCommonElements;
  }
}
