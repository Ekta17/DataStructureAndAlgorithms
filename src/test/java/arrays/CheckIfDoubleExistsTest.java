package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfDoubleExistsTest {
	CheckIfDoubleExists checkIfDoubleExists = new CheckIfDoubleExists();

	@Test
	public void testCheckIfDoubleExists_1() {
		int[] nums = {7, 1, 14, 11};
		assertTrue(checkIfDoubleExists.checkIfExist(nums));
	}

	@Test
	public void testCheckIfDoubleExists_2() {
		int[] nums = {3, 1, 7, 11};
		assertFalse(checkIfDoubleExists.checkIfExist(nums));
	}

	@Test
	public void testCheckIfDoubleExists_3() {
		int[] nums = {-2, 0, 10, -19, 4, 6, -8}; //here 0 is confusing but if there is one more zero then only its valid else there exist only n and no 2*n
		assertFalse(checkIfDoubleExists.checkIfExist(nums));
	}

}