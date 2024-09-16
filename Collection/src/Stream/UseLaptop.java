package Stream;
import java.util.*;
import java.util.stream.Collectors;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop("HP","Ax120F",53500,512,true);
		Laptop l2=new Laptop("Lenovo","zop120F",51500,512,true);
		Laptop l3=new Laptop("Dell","Azp120F",50500,512,false);
		Laptop l4=new Laptop("Axus","Ok1234",51000,512,false);
		Laptop l5=new Laptop("Apple","Mx87",53000,512,true);
		
		ArrayList<Laptop> laps=new ArrayList<>();
		laps.add(l1);
		laps.add(l2);
		laps.add(l3);
		laps.add(l4);
		laps.add(l5);
		
		//List<Laptop> l=laps.stream().filter(a->a.getIsSsd()==true).collect(Collectors.toList());
		//for(Laptop b:l) {
			//System.out.println(b);
		//}
		//laps.stream().filter(a->a.getIsSsd()==true).forEach(x->System.out.println(x));
		//long l=laps.stream().count();
		//System.out.println(l);
		long l=laps.stream().filter(x->x.getIsSsd()==true).count();
		System.out.println(l);
	}

}
