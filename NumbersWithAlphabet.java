package forFour;

public class NumbersWithAlphabet {
	public static void main(String[] args) {
		String word="rAn76roJa84";
		int count=0;
		int count1=0;
		for (int i=0;i<word.length();i++) {
			if(word.charAt(i)>='a'&&word.charAt(i)<='z'||word.charAt(i)>='A'&&word.charAt(i)<='Z') {
				count=count+1;
				//System.out.println(word.charAt(i));
			}
			else {
				count1=count1+1;
				//System.out.println(word.charAt(i));
			}
		}System.out.println("num of letters "+count);
		System.out.println("num of numbers "+count1);
		}
	}


