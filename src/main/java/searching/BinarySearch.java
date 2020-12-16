package searching;

import exception.IncorrectInputSupplied;

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

    int findTheFirstOccurrenceOfTheKey(int[] num, int low, int high, int key){
        if(num.length == 0 || low > high)
            return -1;

        int mid = low + (high-low)/2;
        if(num[mid] == key && (mid == low || num[mid-1] != key))
            return mid;
        else if(num[mid]>=key) //search in the left half
            return findTheFirstOccurrenceOfTheKey(num, low, mid-1, key);
        else //search in the right half
            return findTheFirstOccurrenceOfTheKey(num, mid+1, high, key);
    }

    int findTheLastOccurrenceOfTheKey(int[] num, int low, int high, int key){
        if(num.length == 0 || low > high)
            return -1;

        int mid = low + (high-low)/2;
        if(num[mid] == key && (mid == high || num[mid+1] != key))
            return mid;
        else if(num[mid]>key) //search in the right half
            return findTheLastOccurrenceOfTheKey(num, low, mid-1, key);
        else //search in the left half
            return findTheLastOccurrenceOfTheKey(num, mid+1, high, key);
    }

    int countNumOfOccurrencesOfTheKey(int[] num, int key){
        int firstOccurrence = findTheFirstOccurrenceOfTheKey(num, 0, num.length-1, key);
        if(firstOccurrence == -1)
            return 0;
        int lastOccurrence = findTheLastOccurrenceOfTheKey(num, 0, num.length - 1, key);

        return (lastOccurrence - firstOccurrence + 1);
    }

    //Assuming array num is very large array
    int findIndexOfKeyIfExistsInAnInfiniteArray(int[] num, int key){
        if(num.length == 0)
            return -1;
        if(num[0] == key)
            return 0;
        int i = 1;
        while(num[i]<key)
            i *= 2;
        if(num[i] == key)
            return i;
        else //Element should be present in the range of i/2 - i as while loop ended
            return findIndexOfKeyIfExists(num, i/2, i, key);
    }

    /**Leetcode question: 33
     * Logic: Here the idea is to find the pivot element from where rotation starts
     * so before comparing middle element with key, we first check for the pivot
     * this is done by comparing middle element with side/corner elements at low and high index
    */
     int findIndexOfKeyIfExistsInSortedRotatedArray(int[] num, int key){
        if(num.length == 0)
            return -1;

        int low = 0, high = num.length-1, mid = 0;
        while(low<=high){
            mid = low + (high-low)/2;
            if(num[mid] == key)
                return mid;
            else if(num[mid] >= num[low]){ //array is sorted till the mid point and pivot element exists in right half
                if(num[mid] > key && num[low] <= key) //search left half of the array before mid
                    high = mid - 1;
                else
                    low = mid + 1; //search right half of the array after mid
            }else{ //pivot element exists in the left half
                if(num[mid] < key && num[high] >= key) //search left half of the array before mid
                    low = mid + 1;
                else
                    high = mid - 1; //search left half of the array after mid
            }
        }

        return -1; //Element not found
    }

    /**
     * Leetcode question: 162
     * https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/
     * Finding the peek element
     * An element is called a peek when its greater than its neighbors in the array.
     * Ex: {5,3,30,4,7} --> peeks are 5, 30, 7
     * Expected time complexity: O(log(n))
     */
    int findPeakElementIndex(int[] num) throws IncorrectInputSupplied {
        if(num.length == 0)
            throw new IncorrectInputSupplied("Array passed is does not contain any data. Please check");

        return findPeekElementHelper(num, 0, num.length-1);
    }

    int findPeekElementHelper(int[] num, int low, int high){
        int mid = low + (high-low)/2;

        if((mid == low || num[mid-1] <= num[mid]) && (mid == high || num[mid+1] <= num[mid])) //mid element is the peek
            return mid;
        else if(mid > low && num[mid-1] > num[mid]) //left element of the mid is greater than mid
            return findPeekElementHelper(num, low, mid-1);
        else  // (mid < high && num[mid+1] > num[mid]) --> right element of the mid is greater than mid
            return findPeekElementHelper(num, mid+1, high);
    }

    /**
     * Leetcode  question: 69
     * https://www.geeksforgeeks.org/square-root-of-an-integer/
     * Find square root of x, if x is not a perfect square root return floor of the square root
     * expected time complexity: O(log(n))
     */
    int findSquareRoot(int num){
        if(num == 0 || num == 1)
            return num;

        int low = 1, high = num, mid = 0;

        while( low <= high){
            mid = low + (high - low)/2;

            if(mid * mid == num)
                return mid;
            else if ( mid * mid > num)
                high = mid-1;
            else
                low = mid+1;
        }
        return high;
    }

}
