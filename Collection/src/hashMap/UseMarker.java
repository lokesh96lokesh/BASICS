package hashMap;
import java.util.*;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1=new Marker("Cello",20,"Black");
		Marker m2=new Marker("Fountain",30,"Blue");
		Marker m3=new Marker("Renolds",10,"Green");
		
		HashMap<String,Marker> markers=new HashMap<>();
		markers.put(m1.getBrand(),m1);
		markers.put(m2.getBrand(),m2);
		markers.put(m3.getBrand(), m3);
		
		Iterator<Marker> its=markers.values().iterator();
		while(its.hasNext()) {
			Marker m=its.next();
		
		if(m.getBrand().startsWith("C")) {
			System.out.println(m.getBrand().toUpperCase());
		}
//	     int total=0;
//		for(Marker m:markers.values()) {
//			total=m.getPrice()+total;
//			
//		}
//		System.out.println(total);
//		
	}
	}
}


