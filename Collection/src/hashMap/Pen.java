package hashMap;

import java.util.HashMap;

public class Pen {
	public static void main(String[] args) {
		String p1="Cello";
		String p2="Renoleds";
		String p3="Flair";
		String p4="Fountain";
		
		HashMap<Integer,String> pens=new HashMap<>();
		pens.put(2, p1);
		pens.put(14,p2);
		pens.put(8,p3);
		pens.put(0, p4);
		//pens.put(2, p2);
		//pens.put(8, p2);
		for(Integer i:pens.keySet()) {
			System.out.println(i);
		}
		//for(String i:pens.values()) {
			//System.out.println(i);
		//}
		for(Integer i:pens.keySet()) {
			System.out.println(pens.get(i));
		}
		pens.forEach((x,y)-> System.out.println(x+" "+y));
		
		System.out.println(pens);
		System.out.println(pens.keySet());
	}

}
