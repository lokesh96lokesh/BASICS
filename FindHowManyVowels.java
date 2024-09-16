package loop44;

public class FindHowManyVowels {
	public static void main(String[] args) {
		String[] values= {"rrr","lll","ram","apple","zzz","raja"};
		int count=0;
		
		for(int i=0;i<values.length;i++) {
			String val=values[i].toUpperCase();
			if(val.contains("A") || val.contains("E") || val.contains("I") || val.contains("O") || val.contains("U")) {
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
