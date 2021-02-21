package stack;

import java.util.Stack;

//Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
//
//The following rules define a valid string:
//
//Any left parenthesis '(' must have a corresponding right parenthesis ')'.
//Any right parenthesis ')' must have a corresponding left parenthesis '('.
//Left parenthesis '(' must go before the corresponding right parenthesis ')'.
//'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
//https://leetcode.com/problems/valid-parenthesis-string/
public class ValidParenthesis {
	public boolean checkValidString(String s) {

		Stack<Integer> openStack = new Stack<>();
		Stack<Integer> starStack = new Stack<>();

		for(int i = 0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c == '(')
				openStack.push(i);
			else if(c == '*')
				starStack.push(i);
			else{
				if(openStack.isEmpty() == false)
					openStack.pop();
				else if(starStack.isEmpty() == false)
					starStack.pop();
				else
					return false;
			}
		}

		while(!openStack.isEmpty() && !starStack.isEmpty()){
			if (openStack.pop() > starStack.pop())
				return false;
		}

		if(openStack.isEmpty())
			return true;
		else
			return false;
	}
}
