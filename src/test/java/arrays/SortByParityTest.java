package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortByParityTest {

	SortByParity sort = new SortByParity();

	@Test
	void sortArrayByParity() {
		int[] nums={3,1,2,4};
		assertArrayEquals(new int[]{4,2,1,3}, sort.sortArrayByParity(nums));
	}
}