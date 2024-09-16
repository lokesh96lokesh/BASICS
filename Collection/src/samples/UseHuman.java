package samples;
import java.util.*;
import java.util.stream.Collectors;

public class UseHuman {
	public static void main(String[] args) {
		Human h1=new Human("Suren",23,true);
		Human h2=new Human("Ajith",22,true);
		Human h3=new Human("Suresh",21,true);
		Human h4=new Human("Kavya",24,false);
		
		ArrayList<Human> hs=new ArrayList<>();
		hs.add(h1);
		hs.add(h2);
		hs.add(h3);
		hs.add(h4);
		
		List<String> l=hs.stream().filter(n->n.getIsMale()==true).map(w->w.getName()).collect(Collectors.toList());
		for(String a:l) {
			if(a.length()%2==0) {
				System.out.println(a.charAt(a.length()/2+1));
			}
			else {
				System.out.println(a.charAt(a.length()/2)+" "+a.charAt(a.length()/2-1));
			}
		}
		
	}

}
