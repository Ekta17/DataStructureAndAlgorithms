package sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

	private static QuickSort quickSort;

	@BeforeAll
	public static void init() {
		quickSort = new QuickSort();
	}

	@ParameterizedTest
	@MethodSource("testData")
	void sort(int[] nums, int[] expectedArray) {
		assertArrayEquals(expectedArray, quickSort.sort(nums));
	}

	static Stream<Arguments> testData() {
		return Stream.of(Arguments.of(new int[]{5, 3, 8, 1, 0, 2}, new int[]{0, 1, 2, 3, 5, 8}));
	}
}