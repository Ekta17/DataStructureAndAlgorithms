package arrays;

/**
 * Given a matrix mat[][] of size N x M,
 * where every row and column is sorted in increasing order,
 * and a number X is given.
 * The task is to find whether element X is present in the matrix or not.
 */
public class SearchInMatrix{
	public boolean matSearch(int mat[][], int N, int M, int X)
	{
		int i = 0, j = M-1; //start the search from upper right corner
		while(i < N && j >=0){
			if(mat[i][j] == X)
				return true;
			else if(mat[i][j]<X) //if less move to down
				i++;
			else //if more move to left
				j--;
		}
		return false;
	}
}
