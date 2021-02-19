package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightCheckerTest {
	HeightChecker checker = new HeightChecker();

	@Test
	void testHeightChecker_1() {
		int heights[] = {1, 1, 4, 2, 1, 3};
		assertEquals(3, checker.heightChecker(heights));
	}

	@Test
	void testHeightChecker_2() {
		int heights[] = {5, 1, 2, 3, 4};
		assertEquals(5, checker.heightChecker(heights));
	}

	@Test
	void testHeightChecker_3() {
		int heights[] = {1, 2, 3, 4, 5};
		assertEquals(0, checker.heightChecker(heights));
	}

	@Test
	void testHeightChecker_4() {
		int heights[] = {5, 4, 3, 2, 1};
		assertEquals(4, checker.heightChecker(heights));
	}
}