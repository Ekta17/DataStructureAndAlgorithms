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
	public void testRotateRightWhenDIsLessThanLengthOfArray() {
		int[] arr = {2, 3, 10, 0, 1, 4};
		int[] actualArr = rotateArray.rotateRight(arr, 2);
		int[] expectedArr = {10, 0, 1, 4, 2, 3};
		assertArrayEquals(expectedArr, actualArr);
	}

	@Test
	public void testRotateRightWhenDIsLengthOfArray() {
		int[] arr = {2, 3, 10, 1, 4};
		int[] actualArr = rotateArray.rotateRight(arr, 5);
		int[] expectedArr = {2, 3, 10, 1, 4};
		assertArrayEquals(expectedArr, actualArr);
	}


	@Test
	public void testRotateRightWhenDIsZero() {
		int[] arr = {2, 3, 10, 1, 4};
		int[] actualArr = rotateArray.rotateRight(arr, 0);
		int[] expectedArr = {2, 3, 10, 1, 4};
		assertArrayEquals(expectedArr, actualArr);
	}

	@Test
	public void testRotateRightWhenDIsGreaterThanLengthOfArray() {
		int[] arr = {1,2};
		int[] actualArr = rotateArray.rotateRight(arr, 3);
		int[] expectedArr = {2,1};
		assertArrayEquals(expectedArr, actualArr);
	}

	@Test
	public void testRotateLeftWhenDIsLessThanLengthOfArray() {
		int[] arr = {2, 3, 10, 0, 1, 4};
		int[] actualArr = rotateArray.rotateLeft(arr, 2);
		int[] expectedArr = {1, 4, 2, 3, 10, 0};
		assertArrayEquals(expectedArr, actualArr);
	}

	@Test
	public void testRotateLeftWhenDIsLengthOfArray() {
		int[] arr = {2, 3, 10, 1, 4};
		int[] actualArr = rotateArray.rotateLeft(arr, 5);
		int[] expectedArr = {2, 3, 10, 1, 4};
		assertArrayEquals(expectedArr, actualArr);
	}


	@Test
	public void testRotateLeftWhenDIsZero() {
		int[] arr = {2, 3, 10, 1, 4};
		int[] actualArr = rotateArray.rotateLeft(arr, 0);
		int[] expectedArr = {2, 3, 10, 1, 4};
		assertArrayEquals(expectedArr, actualArr);
	}

	@Test
	public void testRotateLeftWhenDIsGreaterThanLengthOfArray() {
		int[] arr = {1,2};
		int[] actualArr = rotateArray.rotateLeft(arr, 3);
		int[] expectedArr = {2,1};
		assertArrayEquals(expectedArr, actualArr);
	}

}