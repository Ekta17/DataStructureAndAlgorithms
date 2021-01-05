package heap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.PriorityQueue;

/**
 * time complexity: kn + log k
 * https://www.byte-by-byte.com/mergekarrays/
 */


public class MergeKSortedArrays {

	public int[] merge(int[][] arr){

		PriorityQueue<QueueNode> priorityQueue = new PriorityQueue<>();
		int sizeOfFinalArray = 0;
		for(int i =0; i< arr.length; i++) {
			sizeOfFinalArray += arr[i].length; //keep adding size of individual array
			if (arr[i].length > 0)
				priorityQueue.add(new QueueNode(i, 0, arr[i][0])); // add first element from each of the k arrays into Priority queue
		}

		int[] result = new int[sizeOfFinalArray];
		for(int i=0; !priorityQueue.isEmpty(); i++){
			QueueNode n = priorityQueue.poll(); //extract min
			result[i] = n.getValue();
			int newIndexFromThisArray = n.getIndex() + 1;
			if(newIndexFromThisArray < arr[n.getArray()].length)
				priorityQueue.add(new QueueNode(n.getArray(), newIndexFromThisArray, arr[n.getArray()][newIndexFromThisArray]));
		}

		return  result;
	}

}

@AllArgsConstructor
@Getter
@Setter
class QueueNode implements Comparable<QueueNode>{
	int array; //which array from the k arrays
	int index; //index being access within that array
	int value; //value at the index

	public int compareTo(QueueNode queueNode){
		return Integer.compare(getValue(), queueNode.getValue());
	}
}
