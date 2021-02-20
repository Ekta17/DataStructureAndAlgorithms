package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DisapperedNumbersTest {

	DisapperedNumbers disapperedNumbers = new DisapperedNumbers();

	@Test
	void findDisappearedNumbers() {
		int nums[] = {4,3,2,7,8,2,3,1};
		List<Integer> actualList = disapperedNumbers.findDisappearedNumbers(nums);
		assertEquals(Arrays.asList(5,6), actualList);
	}
}