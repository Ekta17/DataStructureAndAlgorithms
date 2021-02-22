package string;

public class ReverseAString {

	public String reverse(String s) {

		char[] reversedString = s.toCharArray();
		int i = 0, j = reversedString.length - 1;

		while (i < j) {
			swap(reversedString, i, j);
			i++;
			j--;
		}

		return new String(reversedString);
	}

	private void swap(char[] s, int i, int j) {
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
}
