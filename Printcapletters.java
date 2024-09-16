package forFour;

public class Printcapletters {
	public static void main(String[] args) {
		String word="ExAmPlE";
		int count=0;
		String word1=word.toUpperCase();
		for (int i=0;i<word.length();i++) {
			if (word.charAt(i)==word1.charAt(i)) {
				count=count+1;
				System.out.println(word.charAt(i));
		}
		}System.out.println(count);
	}
}
