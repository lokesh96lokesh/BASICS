package Stream;
import java.util.*;
import java.util.stream.Collectors;

public class UsePen {
	public static void main(String[] args) {
		Pen p1=new Pen("Cello",30,"Black");
		Pen p2=new Pen("Renolds",20,"Blue");
		Pen p3=new Pen("Fountain",10,"green");
		Pen p4=new Pen("Absara",25,"Black");
		Pen p5=new Pen("Nataraj",10,"Yellow");
		
		ArrayList<Pen> pens=new ArrayList<>();
		pens.add(p1);
		pens.add(p2);
		pens.add(p3);
		pens.add(p4);
		pens.add(p5);
		
		List<Pen> p=pens.stream().filter(a->a.getBrand().endsWith("a")).collect(Collectors.toList());
		for(Pen a:p) {
			System.out.println(a);
		}
		List<String> s=pens.stream().filter(d->d.getBrand().contains("a")).map(w->w.getColor()).collect(Collectors.toList());
		for(String b:s) {
			System.out.println(b);
		}
	}

}
