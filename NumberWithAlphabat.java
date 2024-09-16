package loop44;

public class NumberWithAlphabat {
	public static void main(String[] args) {
		String word="rAM76raJa84";
		int count=0;
		int count1=0;
		for(int i=0;i<=word.length()-1;i++) {
			if(word.charAt(i)>='a' && word.charAt(i)<='z' || word.charAt(i)>='A' && word.charAt(i)<='Z') {
				count=count+1;
			}
			else {
				count1=count1+1;
			}
		}
		System.out.println(count+" "+count1);

	}
}
