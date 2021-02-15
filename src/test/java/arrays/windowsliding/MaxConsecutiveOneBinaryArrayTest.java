package arrays.windowsliding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOneBinaryArrayTest {

	MaxConsecutiveOneBinaryArray maxOnes = new MaxConsecutiveOneBinaryArray();

	@Test
	public void testGetMaxOnesWhenAllZero() {
		int[] nums = {0, 0, 0, 0, 0, 0};
		assertEquals(0, maxOnes.getMaxOnes(nums));
	}

	@Test
	public void testGetMaxOnesWhenAllOnes() {
		int[] nums = {1, 1, 1, 1, 1, 1};
		assertEquals(nums.length, maxOnes.getMaxOnes(nums));
	}

	@Test
	public void testGetMaxOnesWhenMix_1() {
		int[] nums = {0, 1, 1, 0, 1, 0};
		assertEquals(2, maxOnes.getMaxOnes(nums));
	}

	@Test
	public void testGetMaxOnesWhenMix_2() {
		int[] nums = {1, 1, 1, 0, 1, 0};
		assertEquals(3, maxOnes.getMaxOnes(nums));
	}


	@Test
	public void testGetMaxOnesWhenMix_3() {
		int[] nums = {1, 1, 1, 0, 1, 1, 1, 1};
		assertEquals(4, maxOnes.getMaxOnes(nums));
	}


	@Test
	public void testGetMaxOnesWhenMix_4() {
		int[] nums = {1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1};
		assertEquals(4, maxOnes.getMaxOnes(nums));
	}

}