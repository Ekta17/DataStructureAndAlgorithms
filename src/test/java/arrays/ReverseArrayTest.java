package arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {
	public static ReverseArray reverseArray;

	@BeforeAll
	public static void init() {
		reverseArray = new ReverseArray();
	}

	@Test
	public void testReverseEvenLengthArray() {
		int[] arr = {2, 3, 10, 0, 1, 4};
		int[] actualArr = reverseArray.reverse(arr, 0, arr.length-1);
		int[] expectedArr = {4, 1, 0, 10, 3, 2};
		assertArrayEquals(expectedArr, actualArr);
	}

	@Test
	public void testReverseOddLengthArray() {
		int[] arr = {2, 3, 10, 1, 4};
		int[] actualArr = reverseArray.reverse(arr, 0, arr.length-1);
		int[] expectedArr = {4, 1, 10, 3, 2};
		assertArrayEquals(expectedArr, actualArr);
	}

}