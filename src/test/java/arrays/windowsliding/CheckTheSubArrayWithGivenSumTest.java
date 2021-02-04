package arrays.windowsliding;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckTheSubArrayWithGivenSumTest {

	private static CheckTheSubArrayWithGivenSum checkTheSubArrayWithGivenSum;

	@BeforeAll
	public static void init(){
		checkTheSubArrayWithGivenSum = new CheckTheSubArrayWithGivenSum();
	}

	@Test
	public void testCheckSumWhenPresent(){
		int[] nums={1,8,30,-5,20,7};
		boolean isSumPresent = checkTheSubArrayWithGivenSum.isSumPresent(nums, 45, 3);
		assertTrue(isSumPresent);
	}

	@Test
	public void testCheckSumWhenNotPresent(){
		int[] nums={1,8,30,-5,20,7};
		boolean isSumPresent = checkTheSubArrayWithGivenSum.isSumPresent(nums, 45, 2);
		assertFalse(isSumPresent);
	}

}