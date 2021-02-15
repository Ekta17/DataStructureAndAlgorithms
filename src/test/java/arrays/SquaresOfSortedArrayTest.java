package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfSortedArrayTest {
	SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();

	@Test
	public void testSquareOfNum() {
		int[] nums = {-4, -1, 0, 3, 10};
		assertArrayEquals(new int[]{0, 1, 9, 16, 100}, squaresOfSortedArray.sortedSquares(nums));
	}

}