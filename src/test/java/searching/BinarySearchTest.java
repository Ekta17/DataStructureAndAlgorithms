package searching;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    private static BinarySearch binarySearch;

    @BeforeAll
    static void init() {
        binarySearch = new BinarySearch();
    }

    @ParameterizedTest
    @MethodSource("testData")
    void itShouldReturnIndexWhenKeyIsPresent(int[] num, int low, int high, int key, int expectedValue){
        assertEquals(expectedValue, binarySearch.findIndexOfKeyIfExists(num, low, high, key));
    }

    static Stream<Arguments> testData () {
        return Stream.of( //array of integers, low, high, key, expectedValue of Index
                Arguments.of((new int[] { 1, 2, 3, 4 }), 0, 3, 3, 2),
                Arguments.of((new int[] { 1, 2, 3, 4 }), 0, 3, 2, 1),
                Arguments.of((new int[] { 1, 2, 3, 4 }), 0, 3, 1, 0),
                Arguments.of((new int[] { 1, 2, 3, 4 }), 0, 3, 0, -1)
                );
    }
}
