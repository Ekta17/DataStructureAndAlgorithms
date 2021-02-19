package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdMaximumNumberTest {
	ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();

	@Test
	void testThirdMax_1() {
		int[] arr = {3,2,5,1};
		assertEquals(2, thirdMaximumNumber.thirdMax(arr));
	}

	@Test
	void testThirdMax_2() {
		int[] arr = {2,1,1,1};
		assertEquals(2, thirdMaximumNumber.thirdMax(arr));
	}

	@Test
	void testThirdMax_3() {
		int[] arr = {1,1,1,1};
		assertEquals(1, thirdMaximumNumber.thirdMax(arr));
	}

	@Test
	void testThirdMax_4() {
		int[] arr = {1,2,3};
		assertEquals(1, thirdMaximumNumber.thirdMax(arr));
	}

	@Test
	void testThirdMax_5() {
		int[] arr = {1,2};
		assertEquals(2, thirdMaximumNumber.thirdMax(arr));
	}

	@Test
	void testThirdMax_6() {
		int[] arr = {1};
		assertEquals(1, thirdMaximumNumber.thirdMax(arr));
	}

	@Test
	void testThirdMax_7() {
		int[] arr = {2,2,3,1};
		assertEquals(1, thirdMaximumNumber.thirdMax(arr));
	}
}