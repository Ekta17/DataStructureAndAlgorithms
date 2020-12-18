package sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

	private static InsertionSort insertionSort;

	@BeforeAll
	public static void init() {
		insertionSort = new InsertionSort();
	}

	@ParameterizedTest
	@MethodSource("testDataForInsertionSort")
	void sort(int[] nums, int[] expectedArray) {
		assertArrayEquals(expectedArray, insertionSort.sort(nums));
	}

	static Stream<Arguments> testDataForInsertionSort() {
		return Stream.of(
				Arguments.of(new int[]{5, 2, 1, 0, 3}, new int[]{0, 1, 2, 3, 5}),
				Arguments.of(new int[]{0, 1, 2, 3, 5}, new int[]{0, 1, 2, 3, 5}),
				Arguments.of(new int[]{5, 3, 2, 1, 0}, new int[]{0, 1, 2, 3, 5})
		);
	}


}