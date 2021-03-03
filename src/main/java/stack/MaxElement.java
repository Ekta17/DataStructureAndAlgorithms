package stack;

import java.util.ArrayList;
import java.util.List;

// Given a stack of integers. The task is to design a special stack such that maximum element can be
// found in O(1) time and O(1) extra space.
// https://www.geeksforgeeks.org/find-maximum-in-a-stack-in-o1-time-and-o1-extra-space/
// Trick is to push (2* newvalue - maxElement) whenever there is a value greater than current max
// pop --> if element poped is greater than max then newMax = (2*maxElement - topOfStack)
public class MaxElement {
  List<Integer> stack;
  int maxElement;

  MaxElement() {
    stack = new ArrayList<>();
    maxElement = Integer.MIN_VALUE;
  }

  public int getMax() throws Exception {
    if (isEmpty() == false) return maxElement;
    else throw new Exception("Stack Is Empty");
  }

  public void push(int value) {
    if (isEmpty() == true) {
      stack.add(value);
      maxElement = value;
    } else {
      if (value < maxElement) stack.add(value);
      else {
        int valueToInsert = (2 * value - maxElement);
        stack.add(valueToInsert);
        maxElement = value;
      }
    }
  }

  public int pop() throws Exception {
    if (isEmpty() == false) {
      int valueAtTop = stack.remove(stack.size() - 1);
      // update maxelement
      if (valueAtTop > maxElement) {
        maxElement = (2 * maxElement - valueAtTop);
        valueAtTop = (valueAtTop + maxElement) / 2;
      }
      return valueAtTop;
    } else throw new Exception("Stack Is Empty");
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }
}
