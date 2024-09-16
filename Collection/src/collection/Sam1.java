package collection;

import java.util.ArrayList;

public class Sam1 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Suren");
		names.add("Arun");
		names.add("Ajith");
		for(String x:names) {
			System.out.println(x.indexOf(0));
		}
	}

}
