package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortSquareTest {

	SortSquare sortSquare= new SortSquare();

	@Test
	void testSortedSquares_1() {
		int nums[] = {-4,-1,0,3,10};
		assertArrayEquals(new int[]{0,1,9,16,100},sortSquare.sortedSquares(nums));
	}

	@Test
	void testSortedSquares_2() {
		int nums[] = {-7,-3,2,3,11};
		assertArrayEquals(new int[]{4,9,9,49,121},sortSquare.sortedSquares(nums));
	}
}