package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateZerosTest {
	DuplicateZeros duplicateZeros = new DuplicateZeros();

	@Test
	public void testDuplicateZero_1() {
		int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
		duplicateZeros.duplicateZeros(arr);
		assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, arr);
	}

	@Test
	public void testDuplicateZero_2() {
		int arr[] = {1, 2, 3};
		duplicateZeros.duplicateZeros(arr);
		assertArrayEquals(new int[]{1, 2, 3}, arr);
	}

}