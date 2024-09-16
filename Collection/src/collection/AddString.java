package collection;

import java.util.ArrayList;

public class AddString {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Ajith");
		names.add("Suren");
		names.add("Viji");
		names.add("Manimaran");
		names.remove(2);
		names.set(2, "GopalSamy");
		int max=0;
		for(String x:names) {
			max=max+1;
			
		}
		System.out.println(max);
	}

}
