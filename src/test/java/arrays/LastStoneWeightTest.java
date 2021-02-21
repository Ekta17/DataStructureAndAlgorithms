package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {
	LastStoneWeight lastStoneWeight = new LastStoneWeight();

	@Test
	void lastStoneWeight() {
		int stones[] = {2,7,4,1,8,1};
		assertEquals(1, lastStoneWeight.lastStoneWeight(stones));
	}
}