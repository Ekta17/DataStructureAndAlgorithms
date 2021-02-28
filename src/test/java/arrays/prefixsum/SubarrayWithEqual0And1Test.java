package arrays.prefixsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayWithEqual0And1Test {

	SubarrayWithEqual0And1 subarrayWithEqual0And1 = new SubarrayWithEqual0And1();

	@Test
	void testGetLength_1() {
		int arr[] = {1, 0};
		assertEquals(2, subarrayWithEqual0And1.getLength(arr));
	}


	@Test
	void testGetLength_2() {
		int arr[] = {1, 1, 0};
		assertEquals(2, subarrayWithEqual0And1.getLength(arr));
	}


	@Test
	void testGetLength_3() {
		int arr[] = {1, 1, 0, 0, 1, 1};
		assertEquals(4, subarrayWithEqual0And1.getLength(arr));
	}


	@Test
	void testGetLength_4() {
		int arr[] = {1, 1, 1, 1};
		assertEquals(0, subarrayWithEqual0And1.getLength(arr));
	}
}