package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroToEndTest {
	MoveZeroToEnd moveZeroToEnd = new MoveZeroToEnd();

	@Test
	void testMoveZeroes_1() {
		int nums[] = {0,1,0,2,3,0,0};
		moveZeroToEnd.moveZeroes(nums);
		assertArrayEquals(new int[] {1,2,3,0,0,0,0}, nums);
	}

	@Test
	void testMoveZeroes_2() {
		int nums[] = {1,0,2,0,3,0,0};
		moveZeroToEnd.moveZeroes(nums);
		assertArrayEquals(new int[] {1,2,3,0,0,0,0}, nums);
	}

	@Test
	void testMoveZeroes_3() {
		int nums[] = {1,2,3};
		moveZeroToEnd.moveZeroes(nums);
		assertArrayEquals(new int[] {1,2,3}, nums);
	}

	@Test
	void testMoveZeroes_4() {
		int nums[] = {0,0,0};
		moveZeroToEnd.moveZeroes(nums);
		assertArrayEquals(new int[] {0,0,0}, nums);
	}
}