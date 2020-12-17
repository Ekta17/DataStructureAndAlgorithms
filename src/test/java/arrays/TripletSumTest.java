package arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TripletSumTest {

	private static TripletSum tripletSum;

	@BeforeAll
	public static void init(){
		tripletSum = new TripletSum();
	}

	@ParameterizedTest
	@MethodSource("testDataForTrippletSum")
	public void findTripletSumForSortedArray(int[] nums, int target, int[] expectedValues){
		int[] actualValues = tripletSum.findTripletSumForSortedArray(nums, target);
		Arrays.sort(actualValues);
		assertArrayEquals(expectedValues, actualValues);
	}

	static Stream<Arguments> testDataForTrippletSum(){
		return Stream.of(
				Arguments.of(new int[]{1,2,3,4,5,6,7}, 6, new int[]{0,1,2}),
				Arguments.of(new int[]{1,2,3,4,6,7}, 100, new int[]{-1,-1,-1})
		);
	}

}