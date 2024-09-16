package Stream;
import java.util.*;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("Suren",1234,23,"Developer");
		Employee e2=new Employee("Arun",123,23,"Testing");
		Employee e3=new Employee("Navin",12,24,"Testing");
		Employee e4=new Employee("Ajith",1,26,"Testing");
		
		ArrayList<Employee> ls=new ArrayList<>();
		ls.add(e1);
		ls.add(e2);
		ls.add(e3);
		ls.add(e4); 
		
		//List<Employee> l=ls.stream().filter(a->a.getDisganation().equalsIgnoreCase("Testing")).collect(Collectors.toList());
		//for(Employee employee:l) {
			//System.out.println(employee);
		//}
		//ls.stream().filter(a->a.getDisganation().equals("Testing).forEach(x->System.out.println(x));
	
	//List<Employee> l=ls.stream().filter(a->a.getAge()>23).collect(Collectors.toList());
	//for(Employee employee:l) {
		//System.out.println(employee.getName());
	//}
		ls.stream().filter(a->a.getAge()>23).forEach(x->System.out.println(x.getName())) ;
}
}