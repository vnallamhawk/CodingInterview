package CodingInterviewSolutions;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueCharacter {

	public static void main(String[] args) {
		String str = "aa";
		System.out.println(isUnique(str));
	}

	public static boolean isUnique(String str) {
		Set<Character> s = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (s.contains(str.charAt(i))) {
				return false;
			}
			s.add(str.charAt(i));
		}
		return true;
	}
}