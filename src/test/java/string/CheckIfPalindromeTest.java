package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfPalindromeTest {
	CheckIfPalindrome checkIfPalindrome = new CheckIfPalindrome();

	@Test
	void isPalindromeWhenPalindrome_1() {
		String s = "abba";
		assertTrue(checkIfPalindrome.isPalindrome(s));
	}

	@Test
	void isPalindromeWhenPalindrome_2() {
		String s = "abcba";
		assertTrue(checkIfPalindrome.isPalindrome(s));
	}

	@Test
	void isPalindromeWhenNotPalindrome() {
		String s = "abgfba";
		assertFalse(checkIfPalindrome.isPalindrome(s));
	}
}