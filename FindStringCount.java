package loop44;

public class FindStringCount {
	public static void main(String[] args) {
		String word="APPLE";
		int count=0;
		for(int i=0;i<=word.length()-1;i++) {
			if(word.charAt(i)=='A'|| word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U') {
				count=count+1;
				
			}
		}
			System.out.println(count);
			
		
	}

}
