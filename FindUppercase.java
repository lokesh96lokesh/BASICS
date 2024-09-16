package loop44;

public class FindUppercase {
	public static void main(String[] args) {
		String word="ExAmPlE";
		for(int i=0;i<=word.length()-1;i++) {
			if(word.charAt(i)>='A' && word.charAt(i)<='Z') {
				System.out.println(word.charAt(i));
			}
		}
	}

}
