package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfAnagramsTest {

	CheckIfAnagrams checkIfAnagrams = new CheckIfAnagrams();

	@Test
	void isAnagramsWhenTrue() {
		String s1 = "abc";
		String s2 = "cab";
		assertTrue(checkIfAnagrams.isAnagrams(s1,s2));
	}


	@Test
	void isAnagramsWhenFalse() {
		String s1 = "abc";
		String s2 = "dbc";
		assertFalse(checkIfAnagrams.isAnagrams(s1,s2));
	}


	@Test
	void isAnagramsWhenFalse_2() {
		String s1 = "abc";
		String s2 = "abce";
		assertFalse(checkIfAnagrams.isAnagrams(s1,s2));
	}
}