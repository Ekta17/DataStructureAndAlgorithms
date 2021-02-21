package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {
	ValidParenthesis validParenthesis = new ValidParenthesis();

	@Test
	void testCheckValidString_1() {
		String str = "()";
		assertTrue(validParenthesis.checkValidString(str));
	}

	@Test
	void testCheckValidString_2() {
		String str = "(*)";
		assertTrue(validParenthesis.checkValidString(str));
	}

	@Test
	void testCheckValidString_3() {
		String str = "*()";
		assertTrue(validParenthesis.checkValidString(str));
	}

	@Test
	void testCheckValidString_4() {
		String str = "()*";
		assertTrue(validParenthesis.checkValidString(str));
	}

	@Test
	void testCheckValidString_5() {
		String str = "(()*";
		assertTrue(validParenthesis.checkValidString(str));
	}

	@Test
	void testCheckValidString_6() {
		String str = "(*))";
		assertTrue(validParenthesis.checkValidString(str));
	}

	@Test
	void testCheckValidString_7() {
		String str = "(*)))";
		assertFalse(validParenthesis.checkValidString(str));
	}

	@Test
	void testCheckValidString_8() {
		String str = "((*";
		assertFalse(validParenthesis.checkValidString(str));
	}


	@Test
	void testCheckValidString_9() {
		String str = "*";
		assertTrue(validParenthesis.checkValidString(str));
	}

	@Test
	void testCheckValidString_10() {
		String str = "(()()()((((**)";
		assertFalse(validParenthesis.checkValidString(str));
	}

	@Test
	void testCheckValidString_11(){
		String str = "((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()";
		assertTrue(validParenthesis.checkValidString(str));
	}


	@Test
	void testCheckValidString_12(){
		String str = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
		assertFalse(validParenthesis.checkValidString(str));
	}
}