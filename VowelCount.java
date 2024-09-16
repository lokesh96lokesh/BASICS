package forFour;

public class VowelCount {
	public static void main(String[] args) {
		String[]  values= {"rrr","lll","ram","apple","zzz","raja"};
		int count=0;
		for(int i=0;i<values.length;i++) {
			if(values[i].contains("a")||values[i].contains("e")||values[i].contains("i")||values[i].contains("o")||values[i].contains("u")) {
				count=count+1;
			}
		}System.out.println(count);
	}

}
