package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAStringTest {
	ReverseAString reverseAString = new ReverseAString();

	@Test
	void reverse_1() {
		String s = "test";
		assertEquals("tset", reverseAString.reverse(s));
	}

	@Test
	void reverse_2() {
		String s = "testing";
		assertEquals("gnitset", reverseAString.reverse(s));
	}
}