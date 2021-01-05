package heap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KSortedArrayTest {

	private static KSortedArray kSortedArray;

	@BeforeAll
	public static void init(){
		kSortedArray = new KSortedArray();
	}

	@Test
	public void testKSortedArray(){
		int[] arr = {9, 8, 7, 18, 19, 17};
		int k = 2;
		kSortedArray.sortKSortedArray(arr, k);
		int[] expectedArray = {7, 8, 9, 17, 18, 19};
		assertArrayEquals(expectedArray, arr);
	}

}