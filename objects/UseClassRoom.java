package objects;

public class UseClassRoom {
	public static void main (String[]args) {
		ClassRoom classroom1=new ClassRoom();
		classroom1.StudentName ="loki";
		classroom1.standard=12;
		classroom1.section ='a';
		classroom1.attendence=98.53423524324f;
		System.out.println("student name       :"+classroom1.StudentName);
		System.out.println("student standard   :"+classroom1.standard);
		System.out.println("student Section    :"+classroom1.section);
		System.out.println("student Attendence :"+classroom1.attendence);	
	}
}
