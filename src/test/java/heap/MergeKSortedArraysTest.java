package heap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedArraysTest {

	private static MergeKSortedArrays mergeKSortedArrays;

	@BeforeAll
	public static void init(){
		mergeKSortedArrays = new MergeKSortedArrays();
	}

	@Test
	public void testMergeKSortedArray(){
		int[][] arr = {{1,4,5},
				{2,6},
				{0,8,9,10}};
		int[] actualArr = mergeKSortedArrays.merge(arr);
		int[] expectedArr = {0,1,2,4,5,6,8,9,10};
		assertArrayEquals(expectedArr, actualArr);
	}

}