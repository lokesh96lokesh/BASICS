package day25_06_22;

public class UseStudent {
	public static void main (String[]args) {
		Student student1= new Student();
		student1.name="siva";
		student1.id=234;
		student1.age=14;
		student1.attendencePercentage=75;
		Student student2= new Student();
		student2.name="mani";
		student2.id=236;
		student2.age=15;
		student2.attendencePercentage=80;
		Student student3= new Student();
		student3.name="valli";
		student3.id=237;
		student3.age=13;
		student3.attendencePercentage=90;
		System.out.println("no of days present in school siva ="+240*student1.attendencePercentage/100);
		System.out.println("no of days present in school mani ="+240*student2.attendencePercentage/100);
		System.out.println("no of days present in school valli ="+240*student3.attendencePercentage/100);
	}

}
