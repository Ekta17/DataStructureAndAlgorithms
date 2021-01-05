package heap;

import java.util.PriorityQueue;

/**
 * Given unsorted array, find K largest elemtents
 * time complexity: k + (n-k)*log k
 */
public class FindKLargestElements {

	public int[] getKLargestElements(int[] arr, int k){

		int[] finalArr = new int[k];
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		//1. Created the Min heap, priority queue with K elements
		for(int i =0; i< k; i++)
			priorityQueue.add(arr[i]);

		//2. compare root of the priority queue with current element from remaining elements
		// if current element from array is smaller or equal to the root, ignore it
		// else replace root with current element
		//In the end priority queue will have largest k elements from the array
		for(int i =k; i< arr.length; i++){
			if(arr[i]>priorityQueue.peek()){
				priorityQueue.poll(); //remove root element
				priorityQueue.add(arr[i]); //add current element
			}
		}

		int i = 0;
		while(!priorityQueue.isEmpty())
			finalArr[i++] = priorityQueue.poll();

		return finalArr;
	}

}
