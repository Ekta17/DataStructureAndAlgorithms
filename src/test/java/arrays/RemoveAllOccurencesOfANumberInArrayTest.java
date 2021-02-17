package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAllOccurencesOfANumberInArrayTest {

	RemoveAllOccurencesOfANumberInArray remove = new RemoveAllOccurencesOfANumberInArray();

	@Test
	public void testRemoveAllOccurrences_1(){
		int[] nums = {0,1,2,2,3,0,4,2};
		assertEquals(5, remove.removeElement(nums,2));
	}

}