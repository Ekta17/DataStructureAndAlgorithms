package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersWithEvenNoOfDigitsTest {

	NumbersWithEvenNoOfDigits numbersWithEvenNoOfDigits = new NumbersWithEvenNoOfDigits();

	@Test
	public void testCountNumberOfDigits_1() {
		int num = 123;
		assertEquals(3, numbersWithEvenNoOfDigits.numberOfDigits(num));
	}

	@Test
	public void testCountNumberOfDigits_2() {
		int num = 22;
		assertEquals(2, numbersWithEvenNoOfDigits.numberOfDigits(num));
	}

	@Test
	public void testCountNumberOfDigits_3() {
		int num = 0;
		assertEquals(1, numbersWithEvenNoOfDigits.numberOfDigits(num));
	}

	@Test
	public void testCountNumberOfDigits_4() {
		int num = 2;
		assertEquals(1, numbersWithEvenNoOfDigits.numberOfDigits(num));
	}

	@Test
	public void testFindNumberOfEvenDigitsNumbers_1() {
		int nums[] = {2, 3, 123, 12, 1, 3456};
		assertEquals(2, numbersWithEvenNoOfDigits.findNumbers(nums));
	}

}