package searching;

import exception.IncorrectInputSupplied;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BinarySearchTest {

    private static BinarySearch binarySearch;

    @BeforeAll
    static void init() {
        binarySearch = new BinarySearch();
    }

    @ParameterizedTest
    @MethodSource("testDataForFindingTheKey")
    void itShouldReturnIndexWhenKeyIsPresent(int[] num, int low, int high, int key, int expectedValue){
        assertEquals(expectedValue, binarySearch.findIndexOfKeyIfExists(num, low, high, key));
    }

    static Stream<Arguments> testDataForFindingTheKey () {
        return Stream.of( //array of integers, low, high, key, expectedValue of Index
                Arguments.of((new int[] { 1, 2, 3, 4 }), 0, 3, 3, 2),
                Arguments.of((new int[] { 1, 2, 3, 4 }), 0, 3, 2, 1),
                Arguments.of((new int[] { 1, 2, 3, 4 }), 0, 3, 1, 0),
                Arguments.of((new int[] { 1, 2, 3, 4 }), 0, 3, 0, -1)
                );
    }

    @ParameterizedTest
    @MethodSource("testDataForFindingTheFirstOccurrenceOfTheKey")
    void itShouldReturnIndexOfFirstOccurrenceOfTheKey(int[] num, int low, int high, int key, int expectedValue){
        assertEquals(expectedValue, binarySearch.findTheFirstOccurrenceOfTheKey(num, low, high, key));
    }
    
    static Stream<Arguments> testDataForFindingTheFirstOccurrenceOfTheKey () {
        return Stream.of( //array of integers, low, high, key, expectedValue of Index
                Arguments.of((new int[] { 1, 2, 2, 4 }), 0, 3, 2, 1),
                Arguments.of((new int[] { 1, 2, 3, 3 }), 0, 3, 3, 2),
                Arguments.of((new int[] { 1, 2, 3, 4 }), 0, 3, 4, 3),
                Arguments.of((new int[] { 1, 1, 1, 4 }), 0, 3, 1, 0),
                Arguments.of((new int[] { 1, 2, 3, 4 }), 0, 3, 0, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testDataForFindingTheLastOccurrenceOfTheKey")
    void itShouldReturnIndexOfLastOccurrenceOfTheKey(int[] num, int low, int high, int key, int expectedValue){
        assertEquals(expectedValue, binarySearch.findTheLastOccurrenceOfTheKey(num, low, high, key));
    }

    static Stream<Arguments> testDataForFindingTheLastOccurrenceOfTheKey () {
        return Stream.of( //array of integers, low, high, key, expectedValue of Index
                Arguments.of((new int[] { 1, 2, 2, 4 }), 0, 3, 2, 2),
                Arguments.of((new int[] { 1, 2, 3, 3 }), 0, 3, 3, 3),
                Arguments.of((new int[] { 1, 2, 3, 4 }), 0, 3, 4, 3),
                Arguments.of((new int[] { 1, 1, 1, 4 }), 0, 3, 1, 2),
                Arguments.of((new int[] { 1, 2, 3, 4 }), 0, 3, 0, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testDataForCountingTheOccurrencesOfTheKey")
    void itShouldReturnCountOfOccurrenceOfTheKey(int[] num, int key, int expectedValue){
        assertEquals(expectedValue, binarySearch.countNumOfOccurrencesOfTheKey(num, key));
    }

    static Stream<Arguments> testDataForCountingTheOccurrencesOfTheKey () {
        return Stream.of( //array of integers, key, expectedValue of Index
                Arguments.of((new int[] { 1, 2, 2, 4 }), 2, 2),
                Arguments.of((new int[] { 1, 2, 3, 3 }), 3, 2),
                Arguments.of((new int[] { 1, 2, 3, 4 }), 4, 1),
                Arguments.of((new int[] { 1, 1, 1, 4 }), 1, 3),
                Arguments.of((new int[] { 1, 2, 3, 4 }), 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testDataForIndexOfTheKeyInLargeArray")
    void itShouldReturnIndexOfTheKeyInLargeArray(int[] num, int key, int expectedValue){
        assertEquals(expectedValue, binarySearch.findIndexOfKeyIfExistsInAnInfiniteArray(num, key));
    }

    static Stream<Arguments> testDataForIndexOfTheKeyInLargeArray () {
        return Stream.of( //array of integers, key, expectedValue of Index
                Arguments.of((new int[] { 1, 8, 20, 40, 60, 80, 100, 110, 120, 140, 180 }), 100, 6),
                Arguments.of((new int[] { 1, 2, 3, 3 }), 0, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testDataForIndexOfTheKeyInSortedRotateArray")
    void itShouldReturnIndexOfTheKeyInSortedRotatedArray(int[] num, int key, int expectedValue){
        assertEquals(expectedValue, binarySearch.findIndexOfKeyIfExistsInSortedRotatedArray(num, key));
    }

    static Stream<Arguments> testDataForIndexOfTheKeyInSortedRotateArray () {
        return Stream.of( //array of integers, key, expectedValue of Index
                Arguments.of((new int[] { 1, 8, 20, 40, 60, 80, 100, 110, 120, 140, 180 }), 100, 6),
                Arguments.of((new int[] { 8, 20, 40, 60, 80, 100, 110, 120, 140, 180, 1 }), 100, 5),
                Arguments.of((new int[] { 3, 4, 1, 2 }), 0, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testDataForPeekElementIndex")
    void itShouldReturnIndexOfThePeekElement(int[] num, int expectedValue) throws IncorrectInputSupplied {
        assertEquals(expectedValue, binarySearch.findPeakElementIndex(num));
    }

    static Stream<Arguments> testDataForPeekElementIndex () {
        return Stream.of( //array of integers, expectedValue of Index
                Arguments.of((new int[] { 1, 2, 3, 1 }), 2),
                Arguments.of((new int[] { 1,2,1,3,5,6,4 }), 5),
                Arguments.of((new int[] { 1, 2, 3, 4 }), 3),
                Arguments.of((new int[] { 4,3,2,1 }), 0),
                Arguments.of((new int[] { 1, 1, 1, 1 }), 1)
        );
    }

    @Test
    @NullAndEmptySource
    void itShouldThrowExceptionWhenInputArrayIsBlank() throws IncorrectInputSupplied {
        assertThrows(IncorrectInputSupplied.class, () ->  binarySearch.findPeakElementIndex(new int[]{}));
    }

    @ParameterizedTest
    @MethodSource("testDataForFindingSquareRoot")
    void itShouldReturnSquareRootOfTheNumber(int num, int expectedValue){
        assertEquals(expectedValue, binarySearch.findSquareRoot(num));
    }

    static Stream<Arguments> testDataForFindingSquareRoot () {
        return Stream.of( //number to find square root, expectedValue of floor of the square root
                Arguments.of(4, 2),
                Arguments.of(11, 3),
                Arguments.of(5, 2),
                Arguments.of(8, 2)
                );
    }
}
