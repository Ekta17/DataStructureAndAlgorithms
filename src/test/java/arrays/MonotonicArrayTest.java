package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonotonicArrayTest {

	MonotonicArray monotonicArray = new MonotonicArray();

	@Test
	void isMonotonic_1() {
		int A[]={1,2,2,3};
		assertTrue(monotonicArray.isMonotonic(A));
	}

	@Test
	void isMonotonic_2() {
		int A[]={6,5,4,4};
		assertTrue(monotonicArray.isMonotonic(A));
	}

	@Test
	void isMonotonic_3() {
		int A[]={1,3,2};
		assertFalse(monotonicArray.isMonotonic(A));
	}

	@Test
	void isMonotonic_4() {
		int A[]={1,1,0};
		assertTrue(monotonicArray.isMonotonic(A));
	}
}