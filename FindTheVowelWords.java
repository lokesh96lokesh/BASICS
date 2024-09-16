package day5;

public class FindTheVowelWords {
	public static void main(String[]args) {
		String word="loki";
		if (word.contains("a")||word.contains("e")||word.contains("i")||word.contains("o")||word.contains("u")) {
			System.out.println("contains in vowel");
		}
		else {
			System.out.println("contains no vowel");
		}
	}

}
