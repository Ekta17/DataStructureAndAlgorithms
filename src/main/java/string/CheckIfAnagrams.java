package string;

import java.util.Arrays;

//Two strings are anagrams if they are permutation of each other
public class CheckIfAnagrams {

	public boolean isAnagrams(String s1, String s2){
		if(s1 != null && s2 != null && s1.length() == s2.length()) {
			return sort(s1).equals(sort(s2));
		}
		return false;
	}

	private String sort(String s){
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		return(new String(charArray));
	}
}
