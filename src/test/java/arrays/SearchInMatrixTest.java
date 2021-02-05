package arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInMatrixTest {
	private static SearchInMatrix searchInMatrix;

	@BeforeAll
	public static void init(){
		searchInMatrix = new SearchInMatrix();
	}

	@Test
	void matSearchNotPresent() {

		int[][] mat = {
				{3,30,38},
				{44,52,54},
				{57,60,69}
		};
		int X = 62;
		boolean foundX= searchInMatrix.matSearch(mat, 3,3, X);
		assertFalse(foundX);
	}

	@Test
	void matSearchPresent() {

		int[][] mat = {
				{18, 21, 27, 38, 55, 67}
		};
		int X = 55;
		boolean foundX= searchInMatrix.matSearch(mat, 1,6, X);
		assertTrue(foundX);
	}
}