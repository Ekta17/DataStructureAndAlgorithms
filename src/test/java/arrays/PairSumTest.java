package arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PairSumTest {

	private static PairSum pairSum;

	@BeforeAll
	static public void init(){
		pairSum = new PairSum();
	}

	@ParameterizedTest
	@MethodSource("testDataForPairSumForUnsortedArray")
	void findPairSumWhenArrayIsUnsorted(int[] nums, int target, int[] expectedValues) {
		assertArrayEquals(expectedValues, pairSum.findPairSumWhenArrayIsUnsorted(nums, target), "Found the Pair Sum");
	}

	static Stream<Arguments> testDataForPairSumForUnsortedArray(){
		return Stream.of(//array, target sum, expected indices
				Arguments.of(new int[]{1,5,4,2,7}, 7, new int[]{1,3}),
				Arguments.of(new int[]{3, 2, 1, 7,6,4}, 100, new int[]{-1,-1})
		);
	}

	@ParameterizedTest
	@MethodSource("testDataForPairSumForSortedArray")
	void pairSumHelperForSortedArray(int[] nums, int target, int[] expectedValues) {
		assertArrayEquals(expectedValues, pairSum.pairSumHelperForSortedArray(nums, 0, nums.length-1, target));
	}

	static Stream<Arguments> testDataForPairSumForSortedArray(){
		return Stream.of( //array, target sum, expected indices
				Arguments.of(new int[]{1,2,4,6,8,9}, 8, new int[]{1,3}),
				Arguments.of(new int[]{1,2,3,4,6,7}, 100, new int[]{-1,-1})
		);
	}


}