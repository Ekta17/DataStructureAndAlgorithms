package heap;

import java.util.PriorityQueue;

/**
 * Sort a nearly sorted (or K sorted) array
 * Given an array of n elements, where each element is at most k away from its target position,
 * devise an algorithm that sorts in O(n log k) time.
 * https://www.geeksforgeeks.org/nearly-sorted-algorithm/
 * https://www.youtube.com/watch?v=dYfM6J1y0mU
 */
public class KSortedArray {

	public void sortKSortedArray(int[] arr, int k) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		//add first K+1 elements into the priority queue
		for (int i = 0; i < k + 1; i++)
			priorityQueue.add(arr[i]);

		int j = 0;
		for(int i = k+1; i< arr.length; i++){
			//extract min from Priority Queue and place it in the start of array
			arr[j++] = priorityQueue.poll();
			//Add remaining element from array to priority queue
			priorityQueue.add(arr[i]);
		}

		//copy the remaining elements from Priority queue to array
		while(!priorityQueue.isEmpty())
			arr[j++] = priorityQueue.poll();
	}

}
