package arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UnionAndIntersectionTest {

	private static UnionAndIntersection unionAndIntersection;

	@BeforeAll
	public static void init(){
		unionAndIntersection=new UnionAndIntersection();
	}

	@ParameterizedTest
	@MethodSource("testData")
	void findUnionAndIntersection(int[] nums1, int[] nums2, int[][]expectedArray) {
		int[][] actualArray = unionAndIntersection.findUnionAndIntersection(nums1, nums2);
		//assertArrayEquals(expectedArray[0], actualArray[0], "Union match");
		//assertArrayEquals(expectedArray[1], actualArray[1], "Intersection match");
		assertArrayEquals(expectedArray, actualArray);
	}

	static Stream<Arguments> testData(){
		return Stream.of(
				Arguments.of(new int[]{5,15,20,25,30}, new int[]{15,30,45}, new int[][]{
						{5,15,20,25,30,45},
						{15,30}
				})
		);
	}
}