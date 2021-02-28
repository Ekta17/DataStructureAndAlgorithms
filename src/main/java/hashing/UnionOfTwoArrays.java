package hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
  int doUnion(int a[], int b[]) {

    Set<Integer> elements = new HashSet<>();
    for (int i = 0; i < a.length; i++) elements.add(a[i]);

    for (int i = 0; i < b.length; i++) elements.add(b[i]);

    return elements.size();
  }
}
