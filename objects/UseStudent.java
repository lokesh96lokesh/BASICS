package objects;

public class UseStudent {
	public static void main (String[]args) {
		Student student1=new Student();
		student1.name="loki";
		student1.rollNumber=323456;
		student1.math=45;
		student1.physic=56;
		student1.chem=64;
		student1.tamil=34;
		student1.eng=35;
		student1.average=(student1.math+student1.physic+student1.chem+student1.tamil+student1.eng)/5;
		Student student2=new Student();
		student2.name="prem";
		student2.rollNumber=323457;
		student2.math=34;
		student2.physic=52;
		student2.chem=64;
		student2.tamil=54;
		student2.eng=35;
		student2.average=(student2.math+student2.physic+student2.chem+student2.tamil+student2.eng)/5;
		Student student3=new Student();
		student3.name="arun";
		student3.rollNumber=323458;
		student3.math=54;
		student3.physic=34;
		student3.chem=64;
		student3.tamil=65;
		student3.eng=75;
		student3.average=(student3.math+student3.physic+student3.chem+student3.tamil+student3.eng)/5;
		System.out.println(student1.name+" "+student1.rollNumber+" "+student1.average);
		System.out.println(student2.name+" "+student2.rollNumber+" "+student2.average);
		System.out.println(student3.name+" "+student3.rollNumber+" "+student3.average);	
	}
}
