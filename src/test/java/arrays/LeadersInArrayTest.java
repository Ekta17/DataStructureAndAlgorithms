package arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeadersInArrayTest {

	public static LeadersInArray leadersInArray;

	@BeforeAll
	public static void init() {
		leadersInArray = new LeadersInArray();
	}

	@Test
	public void testLeadersInArrayWhenOneLeaders() {
		int[] arr = {1, 2, 3, 4, 5};
		List<Integer> actualArr = leadersInArray.getLeaders(arr);
		assertEquals(Arrays.asList(5), actualArr);
	}

	@Test
	public void testLeadersInArrayWhenAllLeaders() {
		int[] arr = {5, 4, 3, 2, 1};
		List<Integer> actualArr = leadersInArray.getLeaders(arr);
		assertEquals(Arrays.asList(1, 2, 3, 4, 5), actualArr);
	}

	@Test
	public void testLeadersInArrayWhenSomeLeaders() {
		int[] arr = {5, 3, 20, 15, 8, 3};
		List<Integer> actualArr = leadersInArray.getLeaders(arr);
		assertEquals(Arrays.asList(3, 8, 15, 20), actualArr);
	}
}