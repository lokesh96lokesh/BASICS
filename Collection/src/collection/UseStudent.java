package collection;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s=new Student("Suren","male",23,20000,"MCA");
		Student s1=new Student("Arun","male",24,10000,"BSc");
		Student s2=new Student("Navin","male",23,18000,"B.com");
		Student s3=new Student("Ajith","male",27,21000,"BCA");
		Student s4=new Student("Vijay","male",26,24000,"BCA");
		Student s5=new Student("Mohan","male",25,20000,"BCA");
		Student s6=new Student("Sara","female",23,23000,"B.com");
		Student s7=new Student("Anu","female",18,24000,"BCA");
		Student s8=new Student("Raji","male",22,25000,"BCA");
		Student s9=new Student("Aksh","male",21,26000,"BCA");
		
		ArrayList<Student> students=new ArrayList<>();
		students.add(s);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.remove(5);
		for(Student x:students) {
			System.out.println(x.getname());
		}
		//int max=0;
		//students.forEach(x->System.out.println(x.getname()));
		//for(Student x:students) {
			//if(x.getfees()>max) {
				//max=x.getfees();
			
			//}
		//}
		//System.out.println(max);
	//}
		//int odd=0;
		//int even=0;
	//for(Student y:students) {
		//if(y.getage()%2==0) {
			//odd++;
		//}
		//else {
			//even++;
		//}
	//}
	
	//System.out.println(odd);
	//System.out.println(even);
		//students.forEach(x-> {if(x.getname().contains("i")) {System.out.println(x.getname());}});
		ArrayList<Student> femaleList=new ArrayList<>();
		for(Student x:students) {
			if(x.getgender().equalsIgnoreCase("female")) {
				femaleList.add(x);
			}
		}
		femaleList.forEach(y->System.out.println(y));
			
		
	}
}
