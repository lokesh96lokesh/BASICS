package forLoop;

public class Javareverse {
	public static void main(String[]args) {
		String word="JAVA";
		String word1="";
		for(int i=word.length()-1;i>=0;i--) {
			word1=word1+word.charAt(i);
		}
		System.out.println(word1);
		}
	}

