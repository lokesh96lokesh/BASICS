package hashMap;
import java.util.*;

public class UsePhant {
	public static void main(String[] args) {
		Phant p1=new Phant("Cotton ",1200,true," Black");
		Phant p2=new Phant("Jungle ",1000,false," Blue");
		Phant p3=new Phant("Jean ",500,true," Green");
		Phant p4=new Phant("aks ",400,false," Gray");
		Phant p5=new Phant("ASD ",800,true," Black");
		
		HashMap<String,Phant> phants=new HashMap<>();
		phants.put(p1.getBrand(), p1);
		phants.put(p2.getBrand(), p2);
		phants.put(p3.getBrand(), p3);
		phants.put(p4.getBrand(), p4);
		phants.put(p5.getBrand(), p5);
		
		phants.forEach((x,y)-> {
			if(y.getPrice()>500) {
				System.out.println(y);
			}
			});
		
		
	}

}
