package loop5;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Suren";
		s1.age=23;
		s1.rollNo=2;
		s1.mark=100;
		
		Student s2=new Student();
		s2.name="Arun";
		s2.age=22;
		s2.rollNo=22;
		s2.mark=90;
		
		Student s3=new Student();
		s3.name="Navin";
		s3.age=24;
		s3.rollNo=32;
		s3.mark=80;
		
		Student s4=new Student();
		s4.name="Loki";
		s4.age=28;
		s4.rollNo=40;
		s4.mark=70;
		
		Student s5=new Student();
		s5.name="Sam";
		s5.age=25;
		s5.rollNo=55;
		s5.mark=50;
		
		Student[] ss= {s1,s2,s3,s4,s5};
		for(int i=0;i<ss.length;i++) {
			if(ss[i].rollNo>=1 && ss[i].rollNo<=20 ) {
				System.out.println(ss[i].name+ " A Section");
			}
			else if(ss[i].rollNo>=21 && ss[i].rollNo<=40) {
				System.out.println(ss[i].name+" B Section");
			}
			else if(ss[i].rollNo>=41 && ss[i].rollNo<=60) {
				System.out.println(ss[i].name+" C Section");
			}
		}
		for(int i=0;i<ss.length;i++) {
			if(ss[i].mark>80 && ss[i].mark<=100) {
				System.out.println(ss[i].name+" S Grade");
			}
			else if(ss[i].mark>60 && ss[i].mark<=80) {
				System.out.println(ss[i].name+" A Grade");
			}
			else if(ss[i].mark<60) {
				System.out.println(ss[i].name+" Fail");
			}
		}
		
		
		
	}

}
