package string;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Util {

	public boolean isUniqueString(String s){
		if(s.isEmpty())
			return true;

		Set<Character> set = new HashSet<>(s.length());
		for(char c: s.toCharArray()){
			if(set.contains(c))
				return false;
			set.add(c);
		}
		return true;
	}

	public boolean checkPermutation(String s1, String s2){
		if(isNullOrEmpty(s1) || isNullOrEmpty(s2) || s1.length() != s2.length())
			return false;

		return sortTheCharInString(s1).equals(sortTheCharInString(s2));
	}

	public String sortTheCharInString(String s){
//		char[] cArr = s.toCharArray();
//		Arrays.sort(cArr);
//		return new String(cArr);

		return Stream.of(s.split(""))
				.sorted()
				.collect(Collectors.joining());
	}

	public boolean isNullOrEmpty(String s){
		return s == null || s.isEmpty();
	}
}
