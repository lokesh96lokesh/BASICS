package collection;

import java.util.ArrayList;

public class LargeString {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Siva");
		names.add("Suren");
		names.add("Manimaran");
		names.add("Lokesh");
		int max=0;
		String emt="";
		for(int i=0;i<names.size();i++) {
			max=max+1;
			//emt=emt+max;
		}
		System.out.println(max);
	}

}
