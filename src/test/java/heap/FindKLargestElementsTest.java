package heap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FindKLargestElementsTest {

	private static FindKLargestElements findKLargestElements;

	@BeforeAll
	public static void init(){
		findKLargestElements = new FindKLargestElements();
	}

	@Test
	public void testFindKLargestElements(){
		int k = 2;
		int[] arr = {15, 3, 2, 8, 10, 5};
		int[] actualArray = findKLargestElements.getKLargestElements(arr, k);
		assertEquals(2, actualArray.length);
		assertTrue(IntStream.of(actualArray).anyMatch(x -> x == 10));
		assertTrue(IntStream.of(actualArray).anyMatch(x -> x == 15));
	}

}