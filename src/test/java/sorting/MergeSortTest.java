package sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

	private static MergeSort mergeSort;

	@BeforeAll
	public static void init(){
		mergeSort = new MergeSort();
	}

	@ParameterizedTest
	@MethodSource("testDataForMergeSortingTheArray")
	void sort(int[] num, int[] expectedArray) {
		assertArrayEquals(expectedArray, mergeSort.sort(num));
	}

	static Stream<Arguments> testDataForMergeSortingTheArray(){
		return Stream.of(
				Arguments.of(new int[]{5, 2, 1, 0, 3}, new int[]{0, 1, 2, 3, 5}),
				Arguments.of(new int[]{0, 1, 2, 3, 5}, new int[]{0, 1, 2, 3, 5}),
				Arguments.of(new int[]{5, 3, 2, 1, 0}, new int[]{0, 1, 2, 3, 5})
		);
	}

}