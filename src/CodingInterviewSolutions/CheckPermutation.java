package CodingInterviewSolutions;

public class CheckPermutation {

	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "dcabe";
		System.out.println(permutation(str1, str2));
	}

	public static boolean permutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		int[] letter = new int[128];
		for (int i = 0; i < str1.length(); i++) {
			int val = str1.charAt(i);
			letter[val]++;
		}
		for (int i = 0; i < str2.length(); i++) {
			int val = str2.charAt(i);
			letter[val]--;
			if (letter[val] < 0) {
				return false;
			}
		}
		return true;
	}
}