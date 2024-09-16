package samples;
import java.util.*;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Suren",23,true);
		Student s2=new Student("Arun",22,true);
		Student s3=new Student("Navin",24,true);
		Student s4=new Student("Ajith",25,true);
		Student s5=new Student("Hansi",26,false);
		Student s6=new Student("Akash",27,true);
		Student s7=new Student("Guru",28,true);
		Student s8=new Student("Viji",21,false);
		Student s9=new Student("Nithi",29,false);
		Student s10=new Student("Kavya",30,false);
		
		ArrayList<Student> a=new ArrayList<>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		a.add(s6);
		a.add(s7);
		a.add(s8);
		a.add(s9);
		a.add(s10);
		
		//Map<Integer,Student> ss=a.stream().collect(Collectors.toMap(n->n.getAge(),n->n));
		//ss.forEach((x,y)-> System.out.println(y));
		Map<Integer,Student> sss=a.stream().filter(x->x.getIsMale()==true).collect(Collectors.toMap(n->n.getAge(),e->e));
		sss.forEach((x,y)-> System.out.println(y));
		
	}

}
