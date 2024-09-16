package Stream;
import java.util.*;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Suren",143,'a',true,485);
		Student s2=new Student("Arun",121,'b',true,400);
		Student s3=new Student("Navin",122,'c',true,420);
		Student s4=new Student("Kavya",123,'b',false,350);
		
		ArrayList<Student> stus=new ArrayList<>();
		stus.add(s1);
		stus.add(s2);
		stus.add(s3);
		stus.add(s4);
		
		//List<Student> s=stus.stream().filter(a->a.getMarks()>400).collect(Collectors.toList());
		//for(Student ss:s) {
			//System.out.println(ss);
		//}
		//stus.stream().filter(a->a.getMarks()>400).forEach(x->System.out.println(x));
		//List<Student> s=stus.stream().filter(a->a.getMarks()>400).collect(Collectors.toList());
		//for(Student sss:s) {
			//System.out.println(sss.getSec());
			
		//}
		//stus.stream().filter(a->a.getMarks()>400).forEach(x->System.out.println(x.getSec()));
		//List<String> e=stus.stream().map(x->x.getName()).collect(Collectors.toList());
		//for(String str:e) {
			//System.out.println(str);
		//}
		//stus.stream().map(x->x.getName()).forEach(xyz->System.out.println(xyz));
		//List<Integer> i=stus.stream().map(x->x.getMarks()).collect(Collectors.toList());
		//for(Integer str:i) {
			//System.out.println(str);
		//}
		//stus.stream().map(x->x.getMarks()).forEach(xy->System.out.println(xy));
		List<String> n=stus.stream().filter(a->a.getId()>121).map(b->b.getName()).collect(Collectors.toList());
		for(String str:n) {
			System.out.println(str);
		}
		
		
	}

}
