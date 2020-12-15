package searching;

/**
 * When the array is sorted we can use this technique of searching
 * which is faster than linear search and reduces the time significantly
 * Time complexity: O(log(n))
 * Implementation using recursion
 * */

public class BinarySearch {

    int findIndexOfKeyIfExists(int[] num, int low, int high, int key){
        if(num.length == 0 || low > high)
            return -1;

        int mid = low + (high-low)/2;
        if(num[mid] == key)
            return mid;
        else if(num[mid]>key) //search in the left half
            return findIndexOfKeyIfExists(num, low, mid-1, key);
        else //search in the right half
            return findIndexOfKeyIfExists(num, mid+1, high, key);
    }
}
