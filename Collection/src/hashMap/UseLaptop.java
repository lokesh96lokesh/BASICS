package hashMap;
import java.util.*;
public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop("HP ",53500," Black ",true);
		Laptop l2=new Laptop("Lenovo ",52500," White ",false);
		Laptop l3=new Laptop("Dell ",50500," Black ",true);
		Laptop l4=new Laptop("Axus ",51500," Green ",false);
		Laptop l5=new Laptop("Hcl ",53500," Black ",true);
		
		HashMap<String,Laptop> laps=new HashMap<>();
		laps.put(l1.getBrand(), l1);
		laps.put(l2.getBrand(), l2);
		laps.put(l3.getBrand(), l3);
		laps.put(l4.getBrand(), l4);
		laps.put(l5.getBrand(), l5);
		
		laps.forEach((x,y)-> System.out.println(x+" "+y));
		for(Laptop x:laps.values()) {
			System.out.println(x);
		}
		for(String  x:laps.keySet()) {
			System.out.println(laps.get(x).getPrice());
		}
		Iterator<Laptop> itr=laps.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getIsSsd()==true) {
				itr.remove();
			}
		
		}
		System.out.println(laps);
		
		
		
		
	}

}
