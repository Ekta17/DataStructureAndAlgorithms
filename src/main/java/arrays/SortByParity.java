package arrays;

//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
//Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
//You may return any answer array that satisfies this condition.
public class SortByParity {
	public int[] sortArrayByParity(int[] A) {
		int i = 0, j = A.length-1;
		int temp;
		while(i<j){
			if(A[i]%2 == 0 && A[j]%2!=0){ //at correct place, no swap required
				i++;
				j--;
			}else if(A[i]%2==0 && A[j]%2==0) //even element at the right place
				i++;
			else if(A[i]%2!=0 && A[j]%2!=0) //odd element at the right place
				j--;
			else{ //no element at right place, swap
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i++;
				j--;
			}
		}
		return A;
	}
}
