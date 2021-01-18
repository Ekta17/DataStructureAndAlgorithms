package string;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

	private static Util util;

	@BeforeAll
	public static void init(){
		util = new Util();
	}

	@Test
	void isUniqueStringAdditionalSpaceWhenUnique() {
		String s = "ABCS";
		assertTrue(util.isUniqueString(s));
	}

	@Test
	void isUniqueStringAdditionalSpaceWhenNotUnique() {
		String s = "AAABCSD";
		assertFalse(util.isUniqueString(s));
	}
}