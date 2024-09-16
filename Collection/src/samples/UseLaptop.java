package samples;
import java.util.*;
import java.util.stream.Collectors;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop("HP",53500,8,true);
		Laptop l2=new Laptop("Lenovo",52500,6,false);
		Laptop l3=new Laptop("",45000,8,true);
		Laptop l4=new Laptop("Axus",51500,8,false);
		Laptop l5=new Laptop("Dell",50500,8,true);
		
		ArrayList<Laptop> laps=new ArrayList<>();
		laps.add(l1);
		laps.add(l2);
		laps.add(l3);
		laps.add(l4);
		laps.add(l5);
		
		Set<Laptop> w=laps.stream().filter(x->x.getIsSsd()==true).collect(Collectors.toSet());
		w.forEach(n->System.out.println(n));
		
	}

}
