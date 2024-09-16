package collection;

import java.util.ArrayList;

public class Sam {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Suren");
		names.add("Arun");
		names.add("@");
		int vowelsCount=0;
		int constantCount=0;
		for(String x:names) {
			if(x.contains("a") || x.contains("A") || x.contains("e") || x.contains("E") || x.contains("i") || x.contains("I") || x.contains("o") || x.contains("O") || x.contains("u") || x.contains("U")) {
				vowelsCount=vowelsCount+1;
			}
			else {
				constantCount=constantCount+1;
			}
		}
		System.out.println(vowelsCount);
		System.out.println(constantCount);
	}

}
