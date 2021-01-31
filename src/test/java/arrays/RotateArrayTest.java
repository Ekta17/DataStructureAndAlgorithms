package arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {

	public static RotateArray rotateArray;

	@BeforeAll
	public static void init() {
		rotateArray = new RotateArray();
	}

	@Test
	public void testRotateWhenDIsLessThanLengthOfArray() {
		int[] arr = {2, 3, 10, 0, 1, 4};
		int[] actualArr = rotateArray.rotate(arr, 2);
		int[] expectedArr = {10, 0, 1, 4, 2, 3};
		assertArrayEquals(expectedArr, actualArr);
	}

	@Test
	public void testRotateWhenDIsLengthOfArray() {
		int[] arr = {2, 3, 10, 1, 4};
		int[] actualArr = rotateArray.rotate(arr, 5);
		int[] expectedArr = {2, 3, 10, 1, 4};
		assertArrayEquals(expectedArr, actualArr);
	}


	@Test
	public void testRotateWhenDIsZero() {
		int[] arr = {2, 3, 10, 1, 4};
		int[] actualArr = rotateArray.rotate(arr, 0);
		int[] expectedArr = {2, 3, 10, 1, 4};
		assertArrayEquals(expectedArr, actualArr);
	}

}