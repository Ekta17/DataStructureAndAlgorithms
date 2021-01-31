package arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

	private static RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

	@BeforeAll
	public static void init(){
		removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
	}

	@Test
	public void testRemoveDuplicatesFromSortedArray(){
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int lengthOfArrayWithUniqueElements = removeDuplicatesFromSortedArray.removeDuplicate(nums);
		int[] actualArray = new int[lengthOfArrayWithUniqueElements];
		int i = 0;
		while(i<lengthOfArrayWithUniqueElements)
			actualArray[i] = nums[i++];
		int[] expectedArray = {0,1,2,3,4};
		assertArrayEquals(expectedArray, actualArray);
	}

}